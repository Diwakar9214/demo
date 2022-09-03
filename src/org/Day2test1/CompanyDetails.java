package org.Day2test1;
//Multi-level inheritance
public class CompanyDetails extends ClientDetails{
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
		c.clientId();
		c.clientName();
	}

}
