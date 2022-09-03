package org.Day7test1;



public class AxisBank implements RbiBank{

	@Override
	public void saving() {
		System.out.println("Saving 10%");
		
	}
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