package org.Day11test;

public class Hello {
	public void add()
	{
		int a=10;
		System.out.println("A in method"+a);
	}
	public static void main(String[] args) {
		int a=100;
		System.out.println("A in main"+a);
		Hello h=new Hello();
		h.add();
	}
}
