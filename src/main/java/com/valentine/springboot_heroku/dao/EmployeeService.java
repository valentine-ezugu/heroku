package com.valentine.springboot_heroku.dao;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

@Service
public class EmployeeService {

    private List<String> employees  = asList(
        "valentine", "Yura", "James", "Artyom");

    public List<String> getEmployees() {
        return employees;
    }


    private Map<String, String> mapOfEmployees() {
      Map<String, String> employeeMap = new HashMap<>();

        employeeMap.put("123","valentine");
        employeeMap.put("124","yura");
        employeeMap.put("125","james");
        employeeMap.put("126","tulay");
        employeeMap.put("127","emma");
        employeeMap.put("128","gordon");

        return employeeMap;
    }

    private Map<String, String> map = new HashMap<>(mapOfEmployees());


    public String getEmployeeById(String id) {
            slowServiceSimulation();
        return map.get(id);
    }

    private void slowServiceSimulation() {

         try {
             Long wait = 3000L;
             Thread.sleep(wait);
         } catch (InterruptedException e) {
            throw new IllegalStateException (e);
         }
    }

}
