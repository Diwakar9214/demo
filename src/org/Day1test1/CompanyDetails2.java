package org.Day1test1;

import org.Day1test2.ClientDetails;

public class CompanyDetails2 {
	public void CompId()
	{
	System.out.println("Company Id is 1010");	
	}
	public void CompName() {
		System.out.println("Company Name is TCS");
		
	}

	public static void main(String[] args)
	{
		
		CompanyDetails c=new CompanyDetails();
		c.CompId();
		c.CompName();
		ClientDetails cd=new ClientDetails();
		cd.ClientId();
		cd.ClientName();
		
		
	
	}

}
