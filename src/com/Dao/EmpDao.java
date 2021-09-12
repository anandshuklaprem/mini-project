package com.Dao;

import java.util.List;

import com.model.Employee;

public interface EmpDao {

	public boolean add(Employee e) throws ClassNotFoundException;

	public int delete(int eid) throws ClassNotFoundException;

	public List<Employee> getAllEmp();

	public int updateById(int id) throws ClassNotFoundException;

	public Employee getEmpById(int id);

}
