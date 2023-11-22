package com.example.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Model.Department;
import com.example.Repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository dRepository;
	public Department addDepartment(Department department) {
		
		return dRepository.save(department);
	}
	public List<Department> getDepartments() {

		return (List<Department>) dRepository.findAll();
	}
	
	public Department getbyId(int departmentid) {
		return dRepository.findById(departmentid).orElse(null);
		
	}
}
