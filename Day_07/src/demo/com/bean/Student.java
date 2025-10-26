package demo.com.bean;

import java.io.Serializable;
import java.util.Objects;

import demo.com.exception.LowAttendanceException;

public class Student implements Comparable<Student>,Serializable{
	private int rollNo;
	private String sName;
	private String course;
	private double attendPer;
	private double score;
	
	
	//Default Constructor
	public Student() {
		super();
	}
	
	//Parameterized Constructor
	public Student(int rollNo, String sName, String course, double attendPer, double score) {
		super();
		this.rollNo = rollNo;
		this.sName = sName;
		this.course = course;
		this.attendPer = attendPer;
		this.score = score;
	}
	
	
	public Student(int rn) {
		this.rollNo = rn;
	}

	//Getter And Setters Methods
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public double getAttendPer() {
		return attendPer;
	}
	public void setAttendPer(double attendPer) {
		this.attendPer = attendPer;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	
	
	//ToString Method 
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", sName=" + sName + ", course=" + course + ", attendPer=" + attendPer
				+ ", score=" + score + "]";
	}

	@Override
	public int compareTo(Student o) {
		System.out.println("in CompareTo Roll NO : "+this.rollNo+" ------ "+o.rollNo);
		return this.rollNo - o.rollNo;
	}

	
	@Override
	public boolean equals(Object obj) {
		System.out.println("in Equals Method Roll NO : "+this.rollNo+" ------ "+((Student)obj).rollNo);
		return this.rollNo == ((Student)obj).rollNo;
	}

	public String calculateGrade() throws LowAttendanceException {
		if(attendPer < 60) {
			throw new LowAttendanceException("Attendance Percentage is Less Than 60%");
		}
		if(score >= 90) return "A";
		else if(score >= 80) return "B";
		else if(score >= 70) return "C";
		else if(score >= 60) return "D";
		else return "F";
	}
	

}
