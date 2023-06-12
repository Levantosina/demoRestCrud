package com.example.cruddemo.demo.service;

import com.example.cruddemo.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Levantosina
 */


public interface EmployeeService {
    List<Employee> findAll();
}
