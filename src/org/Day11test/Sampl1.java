package org.Day11test;

public class Sampl1 {
	public int a;
	public void add() {
		a=100;
		System.out.println("A in method"+a);
	}
	public static void main(String[] args) {
		Sampl1 s=new Sampl1();
		System.out.println("Before Initialisaction"+s.a);
		s.add();
		System.out.println("After Initialisation"+s.a);
		Sampl1 s2=new Sampl1();
		System.out.println("Before initialisaction"+s2.a);
		
		
	}
}
