package com.spde.user.services;

import com.spde.user.entities.User;
import com.spde.user.repositories.UserRepository;
import com.spde.user.valueobjects.Department;
import com.spde.user.valueobjects.UserDepartmentAssociation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private RestTemplate restTemplate;

    public User save(User user) {
        return userRepository.save(user);
    }

    public UserDepartmentAssociation findById(Long userId) {
        Optional<User> userOptional = userRepository.findById(userId);
        User user = userOptional.get();
        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/" + user.getDepartmentId(),
                Department.class);
        return new UserDepartmentAssociation(user, department);
    }
}
