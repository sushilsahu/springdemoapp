package com.spring.springdemoapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.springdemoapp.dto.EmployeeDTO;
import com.spring.springdemoapp.entity.Employee;
import com.spring.springdemoapp.repository.EmployeeRepository;

import jakarta.persistence.criteria.CriteriaBuilder.In;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDTO getEmployee(Integer id) {
        // In a real application, this would fetch data from a database
        Employee employee = employeeRepository.getEmployee(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        return employeeDTO.EmployeeMapper(employee);
    }

}
