package org.Day3univ;

public class University extends College {
	public void ug()
	{
		System.out.println("Madras university UG Course");
	}
	
	public void pg()
	{
		System.out.println("Madras university PG Course");
	}
	public static void main(String[] args) {
		University u=new University();
		u.ug();
		u.pg();
		
	}

}
