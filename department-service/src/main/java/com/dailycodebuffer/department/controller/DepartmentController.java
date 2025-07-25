package com.dailycodebuffer.department.controller;

import com.dailycodebuffer.department.entity.Department;
import com.dailycodebuffer.department.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    Logger logger = LogManager.getLogger(DepartmentController.class);


    @PostMapping("/")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("Inside saveDepartment method of DepartmentController");
        Department  d = departmentService.saveDepartment(department);
        logger.info("Inside saveDepartment method of DepartmentController" + d);
        return d;

    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        log.info("Inside findDepartmentById method of DepartmentController");
        logger.info("Inside findDepartmentById method of DepartmentController");
        Department d=  departmentService.findDepartmentById(departmentId);
        logger.info("Inside findDepartmentById method of DepartmentController" + d);
        return d;
    }

    @GetMapping("/")
    public List<Department> findAllDep() {
        log.info("Inside findDepartmentById method of DepartmentController");
        List<Department> d=  departmentService.findAllDepartment();
        logger.info("Inside findAllDep method of DepartmentController" + d);
        return d;
    }

}
