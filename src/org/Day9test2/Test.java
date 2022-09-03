package org.Day9test2;

import java.security.Identity;

public class Test {
	public static void main(String[] args) {
		String s="nishanthi";
		String s1=s.toUpperCase();
		System.out.println(s1);
		//Convert all small letter and into capital letter
		String a="WelcomE";
		String a1=a.toUpperCase();
		System.out.println(a1);
		//Given String as "Welcome to java class" and verify whether the given string startsWith welcome
		String a2="Welcome to class java";
		String a3=a2.substring(0);
		boolean a4=a3.equals(a2);
		System.out.println(a4);
		//Given String as "Hai i am nisha" and verify whether the given string startsWith welcome
		String b="Hai i am nisha";
		String b1="welcome";
		boolean b2=b.equals(b1);
		System.out.println(b2);
		//Given String as "Welcome to java class" and verify whether the given string endsWith class
		String c2="Welcome to class java";
		int c3=a2.lastIndexOf(17);
		boolean c4=a3.equals(c2);
		System.out.println(c4);
		//Given String as "Welcome to java class" and verify whether the string is empty or not
		String d="Welcome to java class";
		boolean d1=d.isEmpty();
		System.out.println(d1);
		//Given string is empty or not
		String d2="";
		boolean d3=d2.isEmpty();
		System.out.println(d3);
		//hash code
		String q="Nisha";
		System.out.println(System.identityHashCode(q));
		}

}
