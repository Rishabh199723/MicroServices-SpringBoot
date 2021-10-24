package com.example.departmentService.controller;

import com.example.departmentService.entity.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.departmentService.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    Logger log = LoggerFactory.getLogger(DepartmentController.class);

    @PostMapping("/saveDepartment")
    public Department saveDepartment(@RequestBody Department department) {
        log.info(String.valueOf(department));
        log.info("Inside save department of department com.example.departmentService.controller");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/findDepartment/{id}")
    public Department findDepartment(@PathVariable("id") Long deptId) {
        log.info("Inside find department of department com.example.departmentService.controller");
        return departmentService.findDepartment(deptId);
    }
}
