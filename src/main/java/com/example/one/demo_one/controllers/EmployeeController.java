package com.example.one.demo_one.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(path = "/e")
    public String getEmployees(){
        return "aaa";
    }

}
