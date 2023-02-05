package com.napat.springbootapidemo.model;

public class Demo {
    public static void main(String[] args) {

        Department department = new Department();
        // dependency injection
        // 2.ส่ง parameter ผ่านเข้ามาตอน new เลย
        Employee employee = new Employee(department);
        // 1. new แล้วค่อย set ค่า
        // Employee employee = new Employee();
        // employee.setDepartment(department);
        // มีค่าเท่ากับการ Autowired

        String departmentName = employee.getDepartment().getName();
        System.out.println(departmentName);


    }
}
