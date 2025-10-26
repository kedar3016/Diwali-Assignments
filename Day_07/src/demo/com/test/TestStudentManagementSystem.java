package demo.com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import demo.com.bean.Student;
import demo.com.exception.LowAttendanceException;
import demo.com.service.StudentService;
import demo.com.service.StudentServiceImpl;

public class TestStudentManagementSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService sservice = new StudentServiceImpl();
		int ch = 0;
		do {
			System.out.println("1 : Add new Student\n2:Display All\n3:Search By Rollno\n4:Search By Name"
					+ "\n5:Delete By RollNo\n6:Delete By Score\n7:Calculate Grade"
					+ "\n8:Sort By Attendance Percentage\n9:Save File \n10:Exit");
			System.out.println("Enter your Choice : ");
			ch = sc.nextInt();
			switch(ch) {
				
				case 1 ->{
					boolean flag = sservice.addNewStudent();
					if(flag) {
						System.out.println("Student Added Successfuly!!");
					}
					else {
						System.out.println("Error!!");
					}
				}
				
			//------------------------Display All------------------
				case 2 ->{
					Set<Student> slst = sservice.displayAll();
					
					slst.forEach(System.out::println);
					
				}
				
				
			//-----------------------Search By Roll No------------------------------------
				
				case 3 ->{
					System.out.println("Enter the Roll No : ");
					int rollNo = sc.nextInt();
					Student s = sservice.searchByRollNo(rollNo);
					if(s != null) {
						System.out.println(s);
					}
					else {
						System.out.println("Not Found!!!");
					}
				}
				
			//--------------------Search By Name------------------------------------------
				case 4 ->{
					System.out.println("Enter Name : ");
					String nm = sc.next();
					Set<Student> res = sservice.findByName(nm);
					if(res != null){
						res.forEach(System.out::println);
						
					}
					else {
						System.out.println("Not Found!!");
					}
				}
				
			//---------------------Delete By Id------------------------------------------
				case 5->{
					System.out.println("Enter Roll No : ");
					int rn = sc.nextInt();
					boolean status = sservice.deleteByRollNo(rn);
					if(status) {
						System.out.println("Delete Successfully!!");
					}
					else {
						System.out.println("Not Found!!");
					}
				}
				
			//---------------------Delete By Score-------------------------------------------
				case 6 ->{
					System.out.println("Enter Marks : ");
					double marks = sc.nextInt();
					boolean flag = sservice.deleteByMarks(marks);
					if(flag) {
						System.out.println("Deletd Successfuly!!");
					}
					else {
						System.out.println("Not Found!!!");
					}
				}
				
			//----------------------------Calculate Grade----------------------------------
				case 7 -> {
					System.out.println("Enter Roll No : ");
					int id = sc.nextInt();
					Student s = sservice.searchByRollNo(id);
					if(s!=null) {
						try {
							System.out.println(s.getsName() + " Grade Are "+s.calculateGrade());
						}catch(LowAttendanceException e) {
							System.out.println("Error"+e.getMessage());
						}
					}
				}
				
			//--------------------------------sort by Attendance-----------------
				case 8->{
					Set<Student> sset = sservice.sortByAttendance();
                    if (sset.isEmpty()) {
                        System.out.println("No students available");
                    } else {
                        sset.forEach(System.out::println);
                    }
				}
			//------------------------Save File----------------------------------
				case 9->{
					boolean status = sservice.saveToFile("studData.txt");
                    if (status) {
                        System.out.println("Data saved successfully!!!");
                    } else {
                        System.out.println("Failed to save data");
                    }
				}
				
			//----------------------------Exit------------------------------------------
				case 10->{
					System.out.println("Thank You!!");
				}
			}
		}while(ch != 10);
	}

}
