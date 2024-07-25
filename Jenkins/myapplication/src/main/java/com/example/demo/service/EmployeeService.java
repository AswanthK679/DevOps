package com.example.demo.service;

import com.example.demo.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO getEmployeeById(Long id);
    EmployeeDTO saveEmployee(EmployeeDTO employee);
    void deleteEmployee(Long id);
}
