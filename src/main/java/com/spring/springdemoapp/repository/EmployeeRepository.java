package com.spring.springdemoapp.repository;

import org.springframework.stereotype.Repository;

import com.spring.springdemoapp.entity.Employee;

@Repository
public class EmployeeRepository {
    public Employee getEmployee(Integer id) {
        // In a real application, this would interact with a database
        return new Employee("John Doe", "Engineering", 30, 1);
    }

}
