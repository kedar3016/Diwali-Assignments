package demo.com.service;

import java.util.Set;

import demo.com.bean.Student;

public interface StudentService {

	boolean addNewStudent();

	Set<Student> displayAll();

	Student searchByRollNo(int rollNo);

	Set<Student> findByName(String nm);

	boolean deleteByRollNo(int rn);

	boolean deleteByMarks(double marks);

	Set<Student> sortByAttendance();

	boolean saveToFile(String string);

}
