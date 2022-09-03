package org.Day3edu;
//child class
public class Arts extends Education{
	public void bsc()
	{		System.out.println("BSC CS");
	}
		public void bEd()
	{		System.out.println("BED Course");
	}
		public void bA()
	{		System.out.println("BA course");
	}
	public void bBA()
	{		System.out.println("BBA course");
	}
	public void ug()
	{
		System.out.println("Madras university UG Course");
	}
	
	public void pg()
	{
		System.out.println("Madras university PG Course");
	}
	public static void main(String[] args) {
		Arts a=new Arts();
		a.ug();
		a.pg();
		a.bA();
		a.bBA();
		a.bEd();
		a.bsc();
	}
}
