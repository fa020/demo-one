package com.example.one.demo_one.services;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.example.one.demo_one.dto.EmployeeDTO;
import com.example.one.demo_one.entities.EmployeeEntity;
import com.example.one.demo_one.repositeries.EmployeeRepository;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;
    final ModelMapper modelMapper;

    public EmployeeService(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    public EmployeeDTO getEmpById(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.getById(id);
        return new EmployeeDTO(employeeEntity.getId(), employeeEntity.getName(), employeeEntity.getDateOfJoinging(),
                employeeEntity.isActive());
    }

    public String createNewEmployee(EmployeeDTO employeeDTO) {
        // TODO Auto-generated method stub
        EmployeeEntity employeeEntity = modelMapper.map(employeeDTO, EmployeeEntity.class);
        employeeRepository.save(employeeEntity);
        return "created emp";
        // throw new UnsupportedOperationException("Unimplemented method
        // 'createNewEmployee'");
    }

    public List<EmployeeDTO> getAllEmp() {
        List<EmployeeEntity> entities = employeeRepository.findAll();
        List<EmployeeDTO> dtos = entities.stream()
                .map(emp -> modelMapper.map(emp, EmployeeDTO.class))
                .collect(Collectors.toList());

        return dtos;
    }

}
