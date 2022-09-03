package org.Day3test;

public class EmployeeDetails {
	public void empInfo()
	{
		System.out.println("Employee Info");
	}
	
	public void empInfo(int id)
	{
		System.out.println("Employee ID is"+id);
	}
	
	public void empInfo(String name)
	{
		System.out.println("Employee Name is "+name);
	}
	public void empInfo(String email,long mobNum)
	{
		System.out.println("Employee email is"+email);
		System.out.println("Employee MObile Number is"+mobNum);
		
	}
	public void empInfo(long mobNum,String email)
	{
		System.out.println("Employee Alternate email is"+email);
	System.out.println("Employee Alternate MObile Number is"+mobNum);
	
		
	}
	public static void main(String[] args) {
		
		EmployeeDetails e=new EmployeeDetails();
		e.empInfo();
		e.empInfo(100);
		e.empInfo("Harry");
		e.empInfo("Harry778@gmail.com",9088823456l);
		e.empInfo(9879134567l, "hari235@gmail.com");
	}
	
	
}
