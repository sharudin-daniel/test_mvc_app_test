package com.dany.spring.mvc_hibernate.dao;

import com.dany.spring.mvc_hibernate.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    public void  saveEmployee(Employee employee);
    public Employee getEmployee(int id);
    public void deleteEmployee(int id);
}
