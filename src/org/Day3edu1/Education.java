package org.Day3edu1;
//Multi level Inheritance
public class Education extends Arts{

	public void ug()
	{
		System.out.println("UG COURSE");
	}
	public void pg()
	{
		System.out.println("PG COURSE");
	}
	public static void main(String[] args) {
		Education e=new Education();
		e.ug();
		e.pg();
		e.bsc();
		e.bEd();
		e.bA();
		e.bBA();
		e.bE();
		e.bTech();
		e.physiyo();e.dental();
		e.mbbs();
	}
}
