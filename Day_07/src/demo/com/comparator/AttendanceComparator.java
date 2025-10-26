package demo.com.comparator;


import java.util.Comparator;

import demo.com.bean.Student;

public class AttendanceComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        System.out.println("in attendance comparator " + s1.getAttendPer() + "-----" + s2.getAttendPer());
        int cmp = Double.compare(s2.getAttendPer(), s1.getAttendPer()); // Descending order
        if (cmp == 0) {
            return Integer.compare(s1.getRollNo(), s2.getRollNo()); // Ascending rollNo for uniqueness
        }
        return cmp;
    }
}
