package com.spde.department.services;

import com.spde.department.entities.Department;
import com.spde.department.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department save(Department department) {
        return departmentRepository.save(department);
    }

    public Department findById(Long departmentId) {
        Optional<Department> department = departmentRepository.findById(departmentId);
        return department.get();
    }
}
