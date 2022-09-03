package org.Day2all;
import org.Day2english.*;

//Multi-Level Inheritance
public class Languageclass extends English{
	public void alllanguage() {
		System.out.println("All Language");
	}

	public static void main(String[] args) {
		Languageclass c=new Languageclass();
		c.alllanguage();
		c.englishlanguage();
		c.tamillanguage();
		c.telugulanguage();
	}
}
