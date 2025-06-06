package com.example.one.demo_one.services;

import org.springframework.stereotype.Service;

import com.example.one.demo_one.dto.EmployeeDTO;
import com.example.one.demo_one.entities.EmployeeEntity;
import com.example.one.demo_one.repositeries.EmployeeRepository;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }
    // public EmployeeDTO getEmpById(Long id){

    //     EmployeeEntity employeeEntity = employeeRepository.getById(id);

    //     return new EmployeeDTO(employeeEntity.getId(),employeeEntity.getName(),employeeEntity.getDateOfJoinging(),employeeEntity.isActive());
    // }


}
