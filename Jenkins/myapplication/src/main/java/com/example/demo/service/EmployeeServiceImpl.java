package com.example.demo.service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.dto.EmployeeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<EmployeeDTO> getAllEmployees() {
        return employeeDAO.findAll();
    }

    @Override
    public EmployeeDTO getEmployeeById(Long id) {
        Optional<EmployeeDTO> optionalEmployee = employeeDAO.findById(id);
        return optionalEmployee.orElse(null);
    }

    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employee) {
        return employeeDAO.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeDAO.deleteById(id); // Using inherited method from JpaRepository
    }
}
