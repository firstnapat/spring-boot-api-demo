package com.napat.springbootapidemo.service;

import com.napat.springbootapidemo.repository.EmployeeRepository;

public class EmployeeService {


    EmployeeRepository repository = new EmployeeRepository();

    public void createEmployee() {
        System.out.println("** execute create employee");


        System.out.println("** call employee repository");
        repository.createEmployee();
    }
}
