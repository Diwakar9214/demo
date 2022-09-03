package org.Day7bike;

public class Ktm implements Bike{

	@Override
	public void cost() {
		System.out.println("KTM Bike cost 1 lakh");
		
	}

	@Override
	public void speed() {

		System.out.println("KTM Bike speed is 150");
		
	}
	public static void main(String[] args) {
	Ktm k=new Ktm();
	k.cost();
	k.speed();
	}

}
