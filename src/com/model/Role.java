package com.model;

public class Role {

	private int idrole;
	private String rolename;

	public Role(int idrole, String rolename) {
		super();
		this.idrole = idrole;
		this.rolename = rolename;
	}

	public int getIdrole() {
		return idrole;
	}

	public void setIdrole(int idrole) {
		this.idrole = idrole;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String toString() {
		return "Employee [Rid=" + idrole + " ,Rname=" + rolename + "]";

	}

}
