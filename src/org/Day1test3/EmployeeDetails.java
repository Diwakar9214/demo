package org.Day1test3;

public class EmployeeDetails {

	//1.type the method name and then press ctrl+space bar
	//empId method name
	private void empId() {
		
		System.out.println("Employee Id is 100");
	}
	//2.press ctrl+space bar,select the method from that
	//empNmae method name
	private void empName() {
		System.out.println("Employee name is Danny");
		
	}
	//Main method
	
	public static void main(String[] args) {
		//object creation
		//e oject name
		EmployeeDetails e=new EmployeeDetails();
		//method calling
		e.empId();
		e.empName();
	}
	
	
}
