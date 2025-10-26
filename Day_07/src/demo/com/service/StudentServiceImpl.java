package demo.com.service;

import java.util.Scanner;
import java.util.Set;

import demo.com.bean.Student;
import demo.com.dao.StudentDao;
import demo.com.dao.StudentDaoImpl;

public class StudentServiceImpl implements StudentService {

	StudentDao sdao = new StudentDaoImpl();
	@Override
	public boolean addNewStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student Roll NO : ");
		int rn = sc.nextInt();
		System.out.println("Enter Name : ");
		String name = sc.next();
		System.out.println("Enter Course Name : ");
		String course = sc.next();
		System.out.println("Enter the Attendance Percentage (0 -100): ");
		double attPer = sc.nextDouble();
		System.out.println("Enter the score");
		double score = sc.nextDouble();
		
		Student s = new Student(rn,name,course,attPer,score);
		
		return sdao.save(s);
	}
	@Override
	public Set<Student> displayAll() {
		return sdao.findAll();
	}

	@Override
	public Student searchByRollNo(int rollNo) {
		// TODO Auto-generated method stub
		return sdao.findByRollNo(rollNo);
	}
	@Override
	public Set<Student> findByName(String nm) {
		// TODO Auto-generated method stub
		return sdao.findByName(nm);
	}
	@Override
	public boolean deleteByRollNo(int rn) {
		// TODO Auto-generated method stub
		return sdao.removeByRollNo(rn);
	}
	@Override
	public boolean deleteByMarks(double marks) {
		// TODO Auto-generated method stub
		return sdao.removeByMarks(marks);
	}
	@Override
	public Set<Student> sortByAttendance() {
		return sdao.sortByAttendancePer();
	}
	@Override
	public boolean saveToFile(String string) {
		// TODO Auto-generated method stub
		return sdao.saveFile(string);
	}
		
}
