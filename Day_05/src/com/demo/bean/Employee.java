package com.demo.bean;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable {
	private int empId;
	private String eName;
	private String empRole;
	
	
	//Default Constructor
	public Employee() {
		super();
	}
	
	//Parameterized Constructor 
	public Employee(int empId, String eName, String empRole) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.empRole = empRole;
	}
	public Employee(int empId, String eName) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.empRole = "HR";
	}
	
	//getter and Setter

	public Employee(int eid) {
		this.empId = eid;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("in Equals Method "+this.empId+"-----"+((Employee)obj).empId);
		return this.empId == ((Employee)obj).empId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	
	//Overrided ToString Method 

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", empRole=" + empRole + "]";
	}
	

	@Override
	public int compareTo(Employee o) {
		System.out.println("In Compareto method "+this.empId+" ---- "+o.empId);
		return this.empId-o.empId;
	}
	
	

}
