package org.Day9test2;

public class Scount {
public static void main(String[] args) {
	int upper=0,lower=0,di=0,spe=0;
	String s=" Welcome To Java class @123";
	int Str= s.length();
	System.out.println(Str);
	for(int i=0;i<s.length();i++)
	{
		char c=s.charAt(i);
		
		boolean b=Character.isUpperCase(c);
		boolean b1=Character.isLowerCase(c);
		boolean b2=Character.isDigit(c);
		boolean c1=Character.isWhitespace(c);
		if(b==true)
		{
			upper++;
		}
		else if(b1==true)
		{
			lower++;
		}
		else if(b2==true)
		{
			di++;
		}
		else if(c1==true)
		{
			spe++;
		}
		else
		{
		break;	
			
		}
		
	}
	System.out.println("Uppercase"+upper);

	System.out.println("Lowercase"+lower);

	System.out.println("Digit"+di);

	System.out.println("Special"+spe);
}
}
