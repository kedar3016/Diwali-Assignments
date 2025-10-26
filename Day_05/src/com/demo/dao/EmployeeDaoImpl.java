package com.demo.dao;
import java.util.ArrayList;
import java.util.List;
import java.io.*;

import com.demo.bean.*;

public class EmployeeDaoImpl implements EmployeeDao{
	
	static List<Employee> elist = new ArrayList<>();
	
	static {
			elist.add(new Employee(101,"kedar","Hr"));
			elist.add(new Employee(102,"Shruti","AI"));
	}
	

	@Override
	public boolean save(Employee e) {
		return elist.add(e);
	}


	@Override
	public List<Employee> displayAll() {
		if(!(elist.isEmpty()))
				return elist;
		else {
				return null;
		}
	}


	@Override
	public List<Employee> searchByName(String name) {

		List<Employee> temp = new ArrayList<>();
		for(Employee e:elist) {
			if(e.geteName().equals(name)) {
				temp.add(e);
			}
			
		}
		
		if(temp.size()>0) {
			return temp;
			
		}
		else {
			return null;
		}
	}


	@Override
	public boolean deleteById(int eid) {
		return elist.remove(new Employee(eid));
	}


	@Override
	public List<Employee> sortById() {
		List<Employee> temp = new ArrayList<>();
		for(Employee e : elist) {
			temp.add(e);
		}
		temp.sort(null);
		return temp;
	}


	@Override
	public void writeData(String fname) {
		File f = new File(fname);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))) {
			for(Employee e : elist) {
				oos.writeObject(e);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	

}
