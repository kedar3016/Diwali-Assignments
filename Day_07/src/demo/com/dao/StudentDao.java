package demo.com.dao;

import java.util.Set;

import demo.com.bean.Student;

public interface StudentDao {

	boolean save(Student s);

	Set<Student> findAll();

	Student findByRollNo(int rollNo);

	Set<Student> findByName(String nm);

	boolean removeByRollNo(int rn);

	boolean removeByMarks(double marks);

	Set<Student> sortByAttendancePer();

	boolean saveFile(String string);

	

}
