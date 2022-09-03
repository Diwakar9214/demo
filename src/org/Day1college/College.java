package org.Day1college;

public class College {

	public void collegeName() {
		System.out.println("College Name is DG vaishnav College");
	}
	public void collegeCode() {
		System.out.println("College Code is 10445");
	}
	public void collegeRank() {
		System.out.println("College Rank is 2");
	}
	public static void main(String[] args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s=new Student();
		s.studentId();
		s.studentName();
		s.studentDept();
		Hostel h=new Hostel();
		h.hostelName();
		Dept d=new Dept();
		d.deptName();
	}
	
}
