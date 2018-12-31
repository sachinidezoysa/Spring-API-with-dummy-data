package com.revport.service;

import com.revport.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee findById(long id);

    Employee findByName(String name);

    void saveEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployeeById(long id);

    List<Employee> findAllEmployees();

    void deleteAllEmployees();

    public boolean isEmployeeExist(Employee employee);

}