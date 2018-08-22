package com.valentine.springboot_heroku.dao;

import org.springframework.stereotype.Service;

 import java.util.List;

import static java.util.Arrays.asList;

@Service
public class EmployeeService {

    private List<String> employees  = asList(
        "valentine", "Yura", "James", "Artyom");


    public List<String> getEmployees() {
        return employees;
    }

    public void setEmployees(List<String> employees) {
        this.employees = employees;
    }

}
