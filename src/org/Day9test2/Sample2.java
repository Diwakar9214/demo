package org.Day9test2;

public class Sample2 {
public static void main(String[] args) {
	String s="velmurugank451@gmail.com";
	//verify '@' is present or not
	boolean a=s.contains("@");
	System.out.println(a);
	//verify "pincode" is present or not
	String a1="5-35-2a,venkatesh nivas,Aruppukottai";
	boolean a2=a1.contains("pin code");
	System.out.println(a2);
	String a3="Nishakerala24@gmail.com";
	//string as "Welcome to java class" and replace java into sql.
	String s1=" Welcome to class java";
	String s2=s1.replace("java","Sql");
	System.out.println(s2);
	//string as "Greens Adayar"and replace Adayar into Omr.
	String c="Greens Adayar";
	String c1=c.replace("Adyar","omr");
	System.out.println(c1);
	//Given String as "Welcome to java class" and Replace space into '#'
	String d="Welcome to java class";
	String d1=d.replace(" ", "#");
	System.out.println(d1);
	//Get the email from the user and verify "gmail" is present or not.
   // If present replace that gmail into yahoo
	String d3=" Nishakerala24@gmail.com";
	boolean d4=d3.contains("gmail");
	System.out.println(d4);
	String d5=d3.replace("gmail","Yahoo");
	System.out.println(d5);
	//Get the address from the user and verify "pincode" is present or not.
    //If present replce the pincode with empty space
	String f=" 5-35-2a,venkatesh nivas,Aruppukottai,pincode-626101";
	String f1=f.replace("pincode-626101"," ");
	System.out.println(f1);
	//DescriptionDescription: Given String as "Welcome to java class" and verify whether the given string startsWith welcome: Given String as "Welcome to java class" and verify whether the given string startsWith welcome
	String j="Welcome to Java Class";
	boolean j1=j.startsWith("Wel");
	System.out.println(j1);
	String g="Hai i am nisha";
	boolean g1=g.startsWith("Wel");
	System.out.println(g1);
	boolean g2=j.endsWith("Class");
	System.out.println(g2);
	
	
	
}
}