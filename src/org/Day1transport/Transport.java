package org.Day1transport;
import org.Day1air.Air;
import org.Day1road.Road;
import org.Day1water.Water;
public class Transport {

	public void TransportForm() {
		System.out.println("Transport FOrm are air,road,water");
		
	}
public static void main(String[] args) {
	Transport t=new Transport();
	t.TransportForm();
	Road r=new Road();
	r.bike();
	r.bus();
	r.cycle();
	r.car();
	Air a=new Air();
	a.aeroPlane();
	a.heliCopter();
	Water w=new Water();
	w.boat();
	w.ship();
	
}
}
