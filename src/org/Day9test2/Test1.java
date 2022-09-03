package org.Day9test2;

public class Test1 {
public static void main(String[] args) {
	String s="Nisha";
	String s1="nisha";
	int s2=s1.compareTo(s);
	System.out.println(s2);
	String s3="Nia";
	int s4=s3.compareTo(s);
	System.out.println(s4);
	String g="Welcome to java class";
	String g1=g.substring(0,7);
	System.out.println(g1);
	//Replace all vowels char into '@'
	String h="Welcome";
	String h1=h.replaceAll("e","@");
	System.out.println(h1);
}
}
