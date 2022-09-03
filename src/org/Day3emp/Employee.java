package org.Day3emp;

public class Employee {
	
	public void empId() {
		System.out.println("Employee Info");
		
	}
	public void empId(int id) {
		System.out.println("Employee id is  "+id);
		
	}
	public void empId(String name) {
		System.out.println("Employee Name is "+name);
		
	}
	public void empId(char gender) {
		System.out.println("Employee gender "+gender);
		
	}
	public void empId(long mobNum,String address) {
		System.out.println("Employee Mobile Number "+mobNum);
		System.out.println("Employee Address "+address);
		
	}
	public void empId(String address,long mobNum)
	{
		System.out.println("Employee Alternate Mobile Number "+mobNum);
		System.out.println("Employee Alternate Address "+address);
	}
	public static void main(String[] args) {
		{
			Employee e=new Employee();
			e.empId();
			e.empId(35);
			e.empId("Abhi");
			e.empId('M');
			e.empId(9234578978l,"124,72 street,ellaiamman nagar,villivakkam,chennai");
			e.empId("4,2 main rd,ellaiamman nagar,korattur",9600098453l);
		}
	}
	
}
