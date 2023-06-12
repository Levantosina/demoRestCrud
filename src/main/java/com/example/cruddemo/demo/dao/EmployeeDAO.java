package com.example.cruddemo.demo.dao;

import com.example.cruddemo.demo.entity.Employee;

import java.util.List;

/**
 * @author Levantosina
 */
public interface EmployeeDAO {

    List<Employee> findAll();
}
