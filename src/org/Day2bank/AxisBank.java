package org.Day2bank;

public class AxisBank extends BankInfo {

	public void deposit()
	{
		System.out.println("1 Lakh is deposited");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.fixed();
		a.deposit();
	}
}
