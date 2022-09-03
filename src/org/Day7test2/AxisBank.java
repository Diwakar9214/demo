package org.Day7test2;


public class AxisBank implements RbiBank,HdfcBank{

	@Override
	public void saving() {
		System.out.println("Saving 10%");
		
	}
	@Override
	public void deposit() {
		System.out.println("Deposit..6%");
		
	}
	@Override
	public void fixed() {
		System.out.println("Fixed..9%");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.saving();
		a.deposit();
		a.fixed();
	}
	
	

	
}