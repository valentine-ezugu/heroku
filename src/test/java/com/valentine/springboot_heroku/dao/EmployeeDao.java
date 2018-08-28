package com.valentine.springboot_heroku.dao;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeService.class)
public class EmployeeDao {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void getAnEmployee_ById(){
        String expected = "valentine";

        String actual = employeeService.getEmployeeById("123");
        Assert.assertEquals(expected,actual);
    }

}
