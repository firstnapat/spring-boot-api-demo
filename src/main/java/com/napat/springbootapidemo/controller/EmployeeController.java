package com.napat.springbootapidemo.controller;

import com.napat.springbootapidemo.entity.Employee;
import com.napat.springbootapidemo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    // Autowired คือการ inject ของอัตโนมัติ
    // @Autowired

    // 4. create constructor แทนที่จะใช้ autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> listEmployee() {

        Employee employee = new Employee();
        employee.setId(1);
        employee.setFirstName("Jame");
        employee.setLastName("Barber");
        List<Employee> results = new ArrayList<>();
        results.add(employee);

        Employee employee2 = new Employee();
        employee2.setId(2);
        employee2.setFirstName("napat");
        employee2.setLastName("pcn");
        results.add(employee2);


        return results;
    }
    @GetMapping("/employees/{id}")
    public Employee getEmployee(@PathVariable Integer id) {

        Employee employee = new Employee();
        employee.setId(id);
        employee.setFirstName("Jame");
        employee.setLastName("Barber");

        return employee;
    }

    @PostMapping("/employees")
    public Employee createEmployee(@RequestBody Employee request) {

        System.out.println("id: " + request.getId());
        System.out.println("firstname: " + request.getFirstName());
        System.out.println("lastname: " + request.getLastName());

        employeeService.createEmployee();
        return request;
    }
}
