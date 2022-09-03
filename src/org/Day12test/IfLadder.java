package org.Day12test;

public class IfLadder {
	public static void main(String[] args) {
		int a=10,b=30,c=20;
		if(a>b&&a>c)
		{
			System.out.println("A is greatest"+a);
		}
		else if(b>c&&b>a)
		{
			System.out.println("B is greatest"+b);
			
		}
		else 
		{
			System.out.println("C is greates"+c);
		}
	}
}
