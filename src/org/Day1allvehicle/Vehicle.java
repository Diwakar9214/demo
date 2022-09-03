package org.Day1allvehicle;

import org.Day1fourwheeler.FourWheeler;
import org.Day1threewheeler.ThreeWheeler;
import org.Day1twowheeler.TwoWheller;

public class Vehicle {
public void VehicleNecessery() {

	System.out.println("Engine");
}
public static void main(String[] args) {
	Vehicle v=new Vehicle();
	v.VehicleNecessery();
	TwoWheller t=new TwoWheller();
	t.bike();
	t.cycle();
	ThreeWheeler th=new ThreeWheeler();
	th.auto();
	FourWheeler f=new FourWheeler();
	f.car();
	f.bus();
	f.lorry();
	
	
}
}
