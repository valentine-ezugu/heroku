package com.valentine.springboot_heroku.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(AppRunner.class);

    private final EmployeeService employeeService;

    public AppRunner(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public void run(String... args) throws Exception {

        logger.info(".... Fetching books");
        logger.info("employee-123 -->" + employeeService.getEmployeeById("123"));
        logger.info("employee-124 -->" + employeeService.getEmployeeById("124"));
        logger.info("employee-125 -->" + employeeService.getEmployeeById("125"));
        logger.info("employee-126 -->" + employeeService.getEmployeeById("126"));
        logger.info("employee-127 -->" + employeeService.getEmployeeById("127"));
        logger.info("employee-123 -->" + employeeService.getEmployeeById("123"));
        logger.info("employee-123 -->" + employeeService.getEmployeeById("123"));
        logger.info("employee-123 -->" + employeeService.getEmployeeById("123"));
        logger.info("employee-123 -->" + employeeService.getEmployeeById("123"));
        logger.info("employee-123 -->" + employeeService.getEmployeeById("123"));
    }

}