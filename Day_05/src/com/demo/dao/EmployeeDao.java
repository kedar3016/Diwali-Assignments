package com.demo.dao;

import java.util.List;

import com.demo.bean.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> displayAll();

	List<Employee> searchByName(String name);

	boolean deleteById(int eid);

	List<Employee> sortById();

	void writeData(String fname);

}
