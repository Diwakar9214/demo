package org.Day9test;

public class Sample2 {
public static void main(String[] args) {
	String s="";
	System.out.println(System.identityHashCode(s));
	String s1=null;
	System.out.println(System.identityHashCode(s1));
	boolean b=s.isEmpty();
	System.out.println(b);
	String a="Greens";
	String b1="Technology";
	//String merge
	String c=a.concat(b1);
	System.out.println(c);
	
	
} 
}
