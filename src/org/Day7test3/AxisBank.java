package org.Day7test3;

public class AxisBank extends RbiBank{

	@Override
	public void deposit() {
		System.out.println("Deposit..6%");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.deposit();
	}

	
}
