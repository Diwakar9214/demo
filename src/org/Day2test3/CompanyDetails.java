package org.Day2test3;
//single inheritance
public class CompanyDetails extends EmployeeDetails{
	public void compId()
	{
		System.out.println("Company Id is 245");
	}
	public void compName()
	{
		System.out.println("Company Name is Capgemini");
	}
	public static void main(String[] args) {
		CompanyDetails c=new CompanyDetails();
		c.compId();
		c.compName();
		c.empId();
		c.empName();
	}

}
