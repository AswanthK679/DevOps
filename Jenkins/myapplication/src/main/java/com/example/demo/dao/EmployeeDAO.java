package com.example.demo.dao;

import com.example.demo.dto.EmployeeDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDAO extends JpaRepository <EmployeeDTO,Long> {
}