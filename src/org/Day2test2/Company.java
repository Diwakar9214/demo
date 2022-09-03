package org.Day2test2;
//child class
public class Company extends Client
{

	public void companyName() {
	System.out.println("Company Name is CTS");
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		Company c=new Company();
		e.clientName();
		e.empName();
		c.companyName();
		c.clientName();;
}
}