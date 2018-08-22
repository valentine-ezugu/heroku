package com.valentine.springboot_heroku;

import com.valentine.springboot_heroku.dao.EmployeeService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static java.util.Arrays.asList;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmployeeService.class)
public class SpringbootHerokuApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private EmployeeService service;

	@Test
    public void return_Employe_List() {
	    List<String> myTestList = asList(
            "valentine", "Yura", "James", "Artyom"
        );

        List<String> actualList = service.getEmployees();
        Assert.assertEquals(myTestList, actualList);
    }
}
