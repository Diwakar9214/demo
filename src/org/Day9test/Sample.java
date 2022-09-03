package org.Day9test;

public class Sample {
	public static void main(String[] args) {
		String s="";
		//check whether string is empty or not
		boolean b1=s.isEmpty();
		System.out.println(b1);
		String s1="Nisha";
		boolean b2=s1.isEmpty();
		System.out.println(b2);
		//012345678910
		String p="Hai welcome to java class";
		String k=p.substring(4, 11);
		System.out.println(k);
		String l=p.substring(4);
		System.out.println(l);
	}
}
