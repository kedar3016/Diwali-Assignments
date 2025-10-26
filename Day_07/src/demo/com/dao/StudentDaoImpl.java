package demo.com.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import demo.com.bean.Student;
import demo.com.comparator.AttendanceComparator;

public class StudentDaoImpl implements StudentDao {

	static Set <Student> sset;
	
	static {
		sset = new TreeSet<>(new AttendanceComparator());
		sset.add(new Student(101, "Alice", "Math", 85.0, 92.0));
        sset.add(new Student(102, "Bob", "Science", 55.0, 78.0));
        sset.add(new Student(103, "Charlie", "History", 92.0, 88.0));
        sset.add(new Student(104, "David", "English", 70.0, 65.0));
        sset.add(new Student(105, "Eve", "Physics", 45.0, 50.0));
        sset.add(new Student(106, "Frank", "Chemistry", 88.0, 95.0));
        sset.add(new Student(107, "Grace", "Biology", 60.0, 72.0));
        sset.add(new Student(108, "Henry", "Art", 95.0, 89.0));
        sset.add(new Student(109, "Ivy", "Music", 50.0, 60.0));
        sset.add(new Student(110, "Jack", "PE", 78.0, 81.0));
		
	}
	
	
	@Override
	public boolean save(Student s) {
		return sset.add(s);
	}


	@Override
	public Set<Student> findAll() {
		return sset;
	}


	@Override
	public Student findByRollNo(int rollNo) {
		for(Student s : sset) {
			if(s.getRollNo() == rollNo) {
				return s;
			}
			
		}
		return null;
	}


	@Override
	public Set<Student> findByName(String nm) {
		Set<Student> result = new HashSet<>();
		
		for(Student s : sset) {
			if(s.getsName().equals(nm)) {
				result.add(s);
			}
		}
		return result.isEmpty()?null:result;
	}


	@Override
	public boolean removeByRollNo(int rn) {
		return sset.remove(new Student(rn));
	}


	@Override
	public boolean removeByMarks(double marks) {
		return sset.removeIf(s->s.getScore() < marks);
	}


	@Override
	public Set<Student> sortByAttendancePer() {
		// TODO Auto-generated method stub
		return sset;
	}


	@Override
	public boolean saveFile(String string) {
		
				try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(string))){
					ArrayList<Student> list = new ArrayList<>(sset);
					oos.writeObject(list);
					return true;
				}catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}
		}
	

}
