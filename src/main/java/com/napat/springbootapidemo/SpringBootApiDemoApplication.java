package com.napat.springbootapidemo;

import com.napat.springbootapidemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootApiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringBootApiDemoApplication.class, args);

		// ร้อยของด้วย autowired แล้วก็เพิ่ม @Service เรียบร้อยแล้ว
		// ทำให้ไม่ต้อง new instance ใหม่
		// getBean มาดูว่าได้ของตั้งแต่รัน container มั้ย
		EmployeeService service = context.getBean(EmployeeService.class);
		System.out.println(service);
		service.createEmployee();
	}

}
