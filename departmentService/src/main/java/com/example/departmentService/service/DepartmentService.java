package com.example.departmentService.service;

import com.example.departmentService.entity.Department;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.departmentService.repository.DepartmentRepository;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    Logger log = LoggerFactory.getLogger(DepartmentService.class);


    public Department saveDepartment(Department department) {
        log.info("Inside save department of com.example.departmentService.service");
        return departmentRepository.save(department);
    }


    public Department findDepartment(Long deptId) {
        log.info("Inside Find department of com.example.departmentService.service");
        return departmentRepository.findByDepartmentId(deptId);
    }
}
