package com.springboot.spp;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
@EnableAutoConfiguration
@RestController
public class StudentController {
//@GetMapping("student")
//public Student getStudent() {
//	return new Student("ramesh","soni");
//}
@GetMapping("/students")
public List<Student> getStudents(){
	List<Student> students=new ArrayList<>();
	students.add(new Student("Abhishek","Soni"));
	students.add(new Student("Abhisek","Soni"));
	students.add(new Student("Abishek","Soni"));
	students.add(new Student("Abhi","Soni"));
	students.add(new Student("Ahishek","Soni"));
	return students;
}


@GetMapping("/student/{firstName}/{lastName}")
public Student studentPathVariable(@PathVariable("firstName") String firstName,
		@PathVariable("lastName") String lastName) {
	return new Student(firstName,lastName);
}

// handle query parameters
@GetMapping("/student/query")
public Student studentQueryParams(@RequestParam(name="firstName") String firstName,
		@RequestParam(name="lastName") String lastName) {
	return new Student(firstName,lastName);
}



}
