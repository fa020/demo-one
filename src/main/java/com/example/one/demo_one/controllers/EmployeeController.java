package com.example.one.demo_one.controllers;

import java.time.LocalDate;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.one.demo_one.dto.EmployeeDTO;

@RestController
public class EmployeeController {
    @GetMapping(path = "/e")
    public String getEmployees(){
        return "aaa";
    }
    @GetMapping(path = "/employe/detail")
    public EmployeeDTO getEmployeesDetails(){
        return new EmployeeDTO(12L,"a",LocalDate.of(2000, 02, 20),true);
    }
    @GetMapping(path = "/employe/detail/{id}")
    public EmployeeDTO getEmployeesDetailsById(@PathVariable("id") Long empID){
        return new EmployeeDTO(empID,"a",LocalDate.of(2000, 02, 20),true);
    }

}
