package org.Day1test1;

public class CompanyDetails {
	public void CompId()
	{
	System.out.println("Company Id is 1010");	
	}
	public void CompName() {
		System.out.println("Company Name is TCS");
		
	}

	public static void main(String[] args)
	{
		EmployeeDetails e=new EmployeeDetails();
		
		
		e.empId();
		e.empName();
		CompanyDetails c=new CompanyDetails();
		c.CompId();
		c.CompName();
	
	}
	
}
