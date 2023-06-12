package com.example.cruddemo.demo.service;

import com.example.cruddemo.demo.dao.EmployeeDAO;
import com.example.cruddemo.demo.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Levantosina
 */

@Service
public class EmployeeServiceImpl implements EmployeeService{

   private EmployeeDAO employeeDAO;

   public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
       this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }
}
