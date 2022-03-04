package com.spde.department.controllers;

import com.spde.department.entities.Department;
import com.spde.department.services.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/")
    public Department save(@RequestBody Department department) {
        log.info("Save Department " + department);
        return departmentService.save(department);
    }

    @GetMapping("/{id}")
    public Department findById(@PathVariable("id") Long departmentId) {
        log.info("Find Department by Id = " + departmentId);
        return departmentService.findById(departmentId);
    }
}
