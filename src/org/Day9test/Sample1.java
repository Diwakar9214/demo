package org.Day9test;

public class Sample1 {
	public static void main(String[] args) {
		
	
	String s="Iphone 13 pro max";
	boolean b=s.contains("13");
	System.out.println(b);
	//compare 2 String & return int
	String f1="ABCD";
	String s2="AB";
	int ac=f1.compareTo(s2);
	System.out.println(ac);
	String t3="abcd";
	int bc=f1.compareTo(t3);
	System.out.println(bc);
	
}
}
