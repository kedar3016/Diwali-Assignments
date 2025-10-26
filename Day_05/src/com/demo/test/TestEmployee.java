package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.bean.Employee;
import com.demo.service.*;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch;
		EmployeeService eservice = new EmployeeServiceImpl();
		
		
		do {
			System.out.println("1. Add Employee to list\r\n"
					+ "2. Remove Employee list\r\n"
					+ "3. Show all Employee\r\n"
					+ "4. Show all Employee in sorted order (sort on the basis of empID)\r\n"
					+ "5. Find a Employee with empName\r\n"
					+ "6. Save all Employees into file\r\n"
					+ "7. Quit");
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			
			
				switch(ch) {
					//-------------------------Add Employeee-------------------------------------------
						case 1 ->{
							boolean flag = eservice.addNewEmployee();
							
							if(flag) {
									System.out.println("EMployee Added Successfully!!");
								}
							else {
									System.out.println("Error!! Try Again!!");
								}
							}
						
					//--------------------------remove Employee----------------------
						case 2 -> {
								System.out.println("Enter the Employee Id : ");
								int eid = sc.nextInt();
								boolean status = eservice.removeEmployeeById(eid);
								if(status) {
									System.out.println("Employee Data Deleted Successfully!!");
								}
								else {
									System.out.println("Not Found!!");
								}
						}
						
					//--------------------------Show Employee-----------------------	
						case 3 -> {
							List<Employee> e = eservice.showAll();
							
							e.forEach(System.out::println);
							
						}
						
					//---------------------Sort by Emp Id------------------------------------------
						case 4 -> {
								List<Employee> slst = eservice.sortById();
								if(slst != null) {
									slst.forEach(System.out::println);
								}
								else {
									System.out.println("List Is Empty!!!");
								}
							
						}
						
					//-------------------Find By Name----------------
						case 5 ->{
							System.out.println("Enter the Employee Name : ");
							String name = sc.next();
							List<Employee> lst = eservice.findByName(name);
							if(lst != null) {
								lst.forEach(System.out::println);
								
							}
							else {
								System.out.println("Employee Not Found!!!");
							}
						}
						
					//---------------------Save File-------------------------------
						case 6 ->{
							eservice.saveFile("EmpData.txt");
							
							System.out.println("Thank you for visiting......");
						}
						
						case 7->{
							System.out.println("Thank You!!!");
							sc.close();
						}
				}
		}while(ch != 7);

	

}
}
