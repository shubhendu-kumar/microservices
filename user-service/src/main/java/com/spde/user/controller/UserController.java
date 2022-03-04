package com.spde.user.controller;

import com.spde.user.entities.User;
import com.spde.user.services.UserService;
import com.spde.user.valueobjects.UserDepartmentAssociation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/")
    public User save(@RequestBody User user) {
        log.info("Save User " + user);
        return userService.save(user);
    }

    @GetMapping("/{id}")
    public UserDepartmentAssociation findById(@PathVariable("id") Long userId) {
        log.info("Find User by Id " + userId);
        return userService.findById(userId);
    }
}
