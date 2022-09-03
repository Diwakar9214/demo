package org.Day3test;

public class AxisBank extends HdfcBank {
//method over-riding
	public void fixed() {
		System.out.println("fixed...6%");
	}
	public void saving()
	{
		System.out.println("saving...7%");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.fixed();
		a.saving();
	}
}
