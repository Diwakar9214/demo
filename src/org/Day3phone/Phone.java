package org.Day3phone;

public class Phone {

	public void phoneInfo(int id,String name)
	{
		System.out.println("Customer id"+id);
		System.out.println("Customer Name"+name);
	}
	public void phoneInfo(String name,int id)
	{
		System.out.println("Customer id"+id);
		System.out.println("Customer name"+name);
	}
	
		public void phoneInfo(long code,int id,String name)
		{
			System.out.println("Index number"+code);
			System.out.println("Customer id"+id);
			System.out.println("Customer name"+name);
			
		}
		public void phoneInfo(int id,long code,String name)
		{

			System.out.println("Index number"+code);
			System.out.println("Customer id"+id);
			System.out.println("Customer name"+name);
		}
	public static void main(String[] args) {
		{
			Phone p=new Phone();
			p.phoneInfo(214, "Varun");
			p.phoneInfo("maxy", 1235);
			p.phoneInfo(56, 91l, "jery");
			p.phoneInfo(568l, 58, "Mac");
		}
	}
}
	


