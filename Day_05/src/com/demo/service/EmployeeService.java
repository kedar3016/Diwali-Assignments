package com.demo.service;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> showAll();

	List<Employee> findByName(String name);

	boolean removeEmployeeById(int eid);

	List<Employee> sortById();

	void saveFile(String string);

}
