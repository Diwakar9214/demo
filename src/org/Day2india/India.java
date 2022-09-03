package org.Day2india;
import org.Day2tamilnadu.*;
//Multi level inheritance
public class India extends TamilNadu {
public void india() {
	System.out.println("India");
}
public static void main(String[] args) {
	India i=new India();
	i.india();
	i.tamilLanguage();
	i.malayalam();
	i.telugu();
}
}
