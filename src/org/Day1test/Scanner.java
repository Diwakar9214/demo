package org.Day1test;

public class Scanner {

	public void scan() {
		
	
	short empId=8897;
	System.out.println("Employee ID is "+empId);
	 String empName="Barath";
	 System.out.println("Employee Name is "+empName);
     String empEmail="barath214@gmail.com";
     System.out.println("Employee Email id is "+empEmail);
     long empPhoneNo=8939847689l;
     System.out.println("Employee phone number is "+empPhoneNo);
     double empSalary=96580.98;
     System.out.println("Employee salary is "+empSalary);
     char empGender='M';
     System.out.println("Employee gender is "+empGender);
    
     String empCity="chennai";
     System.out.println("Employee city "+empCity);
}
	public static void main(String[] args) {
		Scanner s=new Scanner();
		s.scan();
	}
}
