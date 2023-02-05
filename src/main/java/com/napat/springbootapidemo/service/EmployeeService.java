package com.napat.springbootapidemo.service;

import com.napat.springbootapidemo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// ใส่ Service เพื่อให้ java เปลี่ยนเป็น spring ใช้ feature spring ได้
@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public void createEmployee() {
        System.out.println("** execute create employee");


        System.out.println("** call employee repository");
        repository.createEmployee();
    }
}
