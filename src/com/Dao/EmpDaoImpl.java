package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.Confriguration.DBconnect;
import com.model.Employee;

public class EmpDaoImpl implements EmpDao {

	@Override
	public boolean add(Employee e) throws ClassNotFoundException {

		try (Connection con = DBconnect.getconnection();
				PreparedStatement pst = con.prepareStatement(
						"insert into employee(idemployee, employeename, employeesalary, employeequalification, did, rid) values(?,?,?,?,?,?)")) {

			pst.setInt(1, e.getEmpid());
			pst.setString(2, e.getEmpname());
			pst.setInt(3, e.getSalary());
			pst.setString(4, e.getQuali());
			pst.setInt(5, e.getDeptid());
			pst.setInt(6, e.getRoleid());
			int c = pst.executeUpdate();

			if (c > 0)
				return true;

		} catch (SQLException e1) {

			e1.printStackTrace();
		}

		return false;

	}

	@Override
	public int delete(int eid) throws ClassNotFoundException {

		int status = 0;
		PreparedStatement pst = null;
		Connection con = null;

		try {
			con = DBconnect.getconnection();

			pst = con.prepareStatement("delete from employee where idemployee=?");
			pst.setInt(1, eid);

			status = pst.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		return status;
	}

	@Override
	public List<Employee> getAllEmp() {

		ArrayList<Employee> emplist = new ArrayList<>();
		try (Connection con = DBconnect.getconnection(); Statement st = con.createStatement()) {

			ResultSet rs = st.executeQuery("select * from employee");

			while (rs.next()) {
				Employee e2 = new Employee();
				e2.setEmpid(rs.getInt(1));
				e2.setEmpname(rs.getString(2));
				e2.setSalary(rs.getInt(3));
				e2.setQuali(rs.getString(4));
				e2.setDeptid(rs.getInt(5));
				e2.setRoleid(rs.getInt(6));
				emplist.add(e2);

			}

		} catch (Exception e) {
			e.printStackTrace();

		}
		return emplist;
	}

	@Override
	public int updateById(int id) throws ClassNotFoundException {

		int status = 0;
		PreparedStatement pst = null;
		Connection con = null;

		try {
			con = DBconnect.getconnection();
			
			pst = con.prepareStatement("UPDATE employee SET employeename = ?, employeesalary = ?, employeequalification = ? WHERE  idemployee=?");
			pst.setString(1, "Arjun");
			pst.setInt(2, 43000);
			pst.setString(3, "Doctor");
			pst.setInt(4, id);

			status = pst.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
				if (con != null)
					con.close();

			} catch (Exception e1) {
				e1.printStackTrace();
			}

		}
		return status;
	}

	@Override
	public Employee getEmpById(int id) {

		ResultSet rs = null;
		PreparedStatement pst = null;
		Employee eobj = null;

		try (Connection con = DBconnect.getconnection()) {
			pst = con.prepareStatement("select * from employee where idemployee = ?");
			pst.setInt(1, id);

			rs = pst.executeQuery();
			rs.next();

			eobj = new Employee();
			eobj.setEmpid(rs.getInt(1));
			eobj.setEmpname(rs.getString(2));
			eobj.setSalary(rs.getInt(3));
			eobj.setQuali(rs.getString(4));
			eobj.setDeptid(rs.getInt(5));
			eobj.setRoleid(rs.getInt(6));

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pst != null)
					pst.close();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}

		}

		return eobj;
	}

}
