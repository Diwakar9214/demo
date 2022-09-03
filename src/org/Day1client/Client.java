package org.Day1client;
import org.Day1company.Company;
public class Client extends Company{
	public void clientName()
	{
		System.out.println("Client Name is zaheer");
	}
	
	public static void main(String[] args) {
		Client c=new Client();
		c.clientName();
		c.companyName();
	}

}
