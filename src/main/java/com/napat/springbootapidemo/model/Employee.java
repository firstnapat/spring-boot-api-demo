package com.napat.springbootapidemo.model;

public class Employee {
    Integer id;
    String firstName;
    String lastName;

    Department department;

    public Employee() {

    }

    // 3. ทำให้เป็น constructor แล้วส่งค่าแบบ public
    public Employee(Department department) {
        this.department = department;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
