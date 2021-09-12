package com.Controller;

import com.model.Employee;
import java.util.List;
import com.Dao.EmpDaoImpl;

public class MainEntry {

	public static void main(String[] args) throws ClassNotFoundException {

		Employee e1 = new Employee();
		e1.setEmpid(107);
		e1.setEmpname("Priya");
		e1.setQuali("CA");
		e1.setRoleid(120);
		e1.setDeptid(110);

		EmpDaoImpl edao = new EmpDaoImpl();
		boolean isadded = edao.add(e1);
		System.out.println(isadded);

		int deleted = edao.delete(107);

		System.out.println("Delete = " + deleted);

		List<Employee> temp = edao.getAllEmp();

		for (Employee x : temp)
		{
			System.out.println(x);
		}

		Employee emp = edao.getEmpById(103);

		System.out.println(emp);

		int updated = edao.updateById(103);

		System.out.println("Updated = " + updated);

	}

}
