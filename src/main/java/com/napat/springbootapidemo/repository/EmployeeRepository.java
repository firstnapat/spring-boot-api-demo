package com.napat.springbootapidemo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public void createEmployee() {
        System.out.println("*** save employee tp database");

    }
}
