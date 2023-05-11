package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.repository.EmployeeRepository;

import com.example.demo.response.DefaultResponse;

@Controller
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeRepository employeeRepository;

    public EmployeeController() {
        this.employeeRepository = new EmployeeRepository();
    }

    @ResponseBody
    @GetMapping()
    public DefaultResponse getAll() {
        this.employeeRepository.getAll();
        return new DefaultResponse(false, null, 200);
    }
}
