package com.cnfad2.lab7;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Lab7Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Lab7Application.class, args);
		StudentService studentService = applicationContext.getBean(StudentService.class);
	
		studentService.addStudent("Nabendu", "1RV22MC053", 90, "Bangalore");
		System.out.println(studentService.getAllStudents().toArray());
	}

}
