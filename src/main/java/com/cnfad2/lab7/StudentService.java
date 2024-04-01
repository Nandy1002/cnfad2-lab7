package com.cnfad2.lab7;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService{

	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getAllStudents(){
		return studentRepo.findAll();
	}
	
	public void addStudent(String name, String usn, int totalMarks, String address) {
		Student s = new Student();
		s.setUsn(usn);
		s.setName(name);
		s.setAddress(address);
		s.setTotalMarks(totalMarks);
		studentRepo.save(s);
	}
	
	public void updateStudent(int id, String name, String usn, String address) {
		Student student = studentRepo.findById(id).orElse(null);
		if(student!=null) {
			student.setName(name);
			student.setUsn(usn);
			student.setAddress(address);
			studentRepo.save(student);
		}else {
			System.out.println("Not Found");
		}
	}
	
	public void deleteStudent(int id) {
		studentRepo.deleteById(id);
	}
}
