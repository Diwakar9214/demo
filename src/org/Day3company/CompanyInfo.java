package org.Day3company;
//Method Overloading
public class CompanyInfo {
	public void companyName() {
		System.out.println("Company Info");
		}
	public void companyName(String name) {
		System.out.println("Company Name is "+name);
	}
	public void companyName(int id) {
		System.out.println("Company Id "+id);
	}
	public void companyName(long emp,String client) {
		System.out.println("Company Client "+client);
		System.out.println("Company Employee count "+emp);
		
	}
	
public static void main(String[] args) {
	CompanyInfo c=new CompanyInfo();
	c.companyName();
	c.companyName("TCS");
	c.companyName(2);
	c.companyName(224566l,"CITI BANK,HSBC,SBI");
	c.companyName();
	c.companyName("Capgemini");
	c.companyName(214);
	c.companyName(2456781, "Standard Charted,Flipkart,Amazon");
	
}
}
