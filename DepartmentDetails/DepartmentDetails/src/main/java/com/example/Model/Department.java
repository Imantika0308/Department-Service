package com.example.Model;

import javax.persistence.Entity;



import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="Department")

	public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentid;
	private String departmentname;

	public int getDepartmentid() {
		return departmentid;
	}
	public void setDepartmentid(int departmentid) {
		this.departmentid = departmentid;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	
	
	 @Override
	public String toString() {
		return "Department [departmentid=" + departmentid + ", departmentname=" + departmentname + "]";
	}
	public Department() {
	        // Empty constructor
	    }
	 public Department(int departmentid, String departmentname) {
		super();
		this.departmentid = departmentid;
		this.departmentname = departmentname;
	}
	
}
