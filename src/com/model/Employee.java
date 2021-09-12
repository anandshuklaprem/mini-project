package com.model;

public class Employee {
	private int empid;
	private String empname;
	private int salary;
	private String quali;
	private int deptid;
	private int roleid;

	public Employee() {

	}

	public Employee(int empid, String empname, int salary, String quali, int deptid, int roleid) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.quali = quali;
		this.deptid = deptid;
		this.roleid = roleid;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getQuali() {
		return quali;
	}

	public void setQuali(String quali) {
		this.quali = quali;
	}

	public int getDeptid() {
		return deptid;
	}

	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}

	public int getRoleid() {
		return roleid;
	}

	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", quali=" + quali
				+ ", deptid=" + deptid + ", roleid=" + roleid + "]";
	}

}
