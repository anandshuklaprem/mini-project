package com.model;

public class Department {
	private int idDepartment;
	private String departmentName;

	public Department(int idDepartment, String departmentName) {
		super();
		this.idDepartment = idDepartment;
		this.departmentName = departmentName;
	}

	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String toString() {
		return "Employee [did=" + departmentName + " ,dname=" + departmentName + "]";

	}

}
