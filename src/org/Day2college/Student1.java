package org.Day2college;
// multi level inheritance in same package
public class Student1 extends Hostel1 {

	public void studentName() {
		System.out.println("Student Name is Dina");
	}
	public void studentDept() {
		System.out.println("Student Dept is B.sc cs");
		
	}
	public void studentId() {
		System.out.println("Student Id is 39");
		
	}
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.studentId();
		s.studentName();
		s.studentDept();
		s.hostelName();
		s.deptName();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		
		
	}
}
