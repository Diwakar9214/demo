package org.Day8test3;

public class Sample {
	public static void main(String[] args) {
		String s="Nishanti";
		//return index present at particular value
		int p=s.indexOf("i");
		System.out.println(p);
		//index of char is not present return -1
		int p1=s.indexOf("k");
		System.out.println(p1);
		//return last index present at particular value
				int p2=s.lastIndexOf("i");
				System.out.println(p2);
		String s1="nishanti";
		//check equality of two string
		boolean b=s.equals(s1);
		System.out.println(b);
		//check equlaity of two string with outcase
		boolean c=s.equalsIgnoreCase(s1);
		System.out.println(c);
		
				
		
		
	}
}
