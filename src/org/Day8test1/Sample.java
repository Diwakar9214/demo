package org.Day8test1;

public class Sample {
	public static void main(String[] args) {
		//012345678
		String s="NisHanThi";
		//fetch letter at 5 Index position
		char c=s.charAt(5);
		System.out.println(c);
		//check whether letter is uppercase or not
		boolean b=Character.isUpperCase(c);
		System.out.println(b);
		////check whether letter is lowercase or not
		boolean b1=Character.isLowerCase(c);
		System.out.println(b1);
		//check whether letter is digit or not
		boolean b2=Character.isDigit(c);
		System.out.println(b2);
		//check whether lower case letter to uppercase
		char up=Character.toUpperCase(c);
		System.out.println(up);
		
		//check whether String starts with same sequence or not
				boolean b3=s.startsWith("Nis");
				System.out.println(b3);
				boolean b4=s.endsWith("Thi");
				System.out.println(b4);
		
	}
}
