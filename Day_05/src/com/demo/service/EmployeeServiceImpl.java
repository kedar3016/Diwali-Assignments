package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Employee;
import com.demo.dao.*;

public class EmployeeServiceImpl implements EmployeeService {
	
	EmployeeDao edao = new EmployeeDaoImpl();

	@Override
	public boolean addNewEmployee() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the emp Id : ");
		int eId = sc.nextInt();
		System.out.println("Enter the Employee Name : ");
		String ename = sc.next();
		System.out.println("Enter the Employee Role : ");
		String role = sc.next();
		Employee e = new Employee(eId,ename,role);
		
		return edao.save(e);
	}

	@Override
	public List<Employee> showAll() {
		// TODO Auto-generated method stub
		return edao.displayAll();
	}

	@Override
	public List<Employee> findByName(String name) {
		return edao.searchByName(name);
	}

	@Override
	public boolean removeEmployeeById(int eid) {
		return edao.deleteById(eid);
	}

	@Override
	public List<Employee> sortById() {
		return edao.sortById();
	}

	@Override
	public void saveFile(String fname) {
		edao.writeData(fname);
		
	}
	
	
	 
	 

}
