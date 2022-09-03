package org.Day1emp1;

import org.Day1client1.Client;
import org.Day1company1.Company;
import org.Day1project1.Project;

public class Employee {
	
public void empName() {
	System.out.println("Employee name is Hari");
	
}

public static void main(String[] args) {
	Client c=new Client();
	c.clientName();
	Company co=new Company();
	co.companyName();
	Employee e=new Employee();
	e.empName();
	Project p=new Project();
	p.projectName();
	

}
}