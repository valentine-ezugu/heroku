package com.valentine.springboot_heroku.controller;

import com.valentine.springboot_heroku.dao.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<String> employeeList(){
        return employeeService.getEmployees();
    }

}
