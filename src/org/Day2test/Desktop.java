package org.Day2test;

public class Desktop extends Computer{

	public void desktopSize()
	{
	System.out.println("Desktop size is 1TB");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopSize();
		d.computerModel();
	}
}
