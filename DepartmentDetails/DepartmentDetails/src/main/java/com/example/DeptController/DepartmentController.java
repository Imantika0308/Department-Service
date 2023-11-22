package com.example.DeptController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Department;
import com.example.Service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

	@Autowired
	private DepartmentService deService;
	
	@PostMapping("/add")
	public Department addDepartment(@RequestBody Department department)
	{	
		return deService.addDepartment(department);
	}
	@GetMapping("/get")
	public List<Department> getAllDepartment()  
	{
		return deService.getDepartments();
	}
	
	@GetMapping("/{departmentid}")
	public ResponseEntity<Department> getDepartmentbyID(@PathVariable int departmentid){
		return new ResponseEntity<Department>(deService.getbyId(departmentid), HttpStatus.OK);
	}
}