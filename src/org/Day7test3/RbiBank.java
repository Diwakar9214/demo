package org.Day7test3;
//Partial Abstraction-->Abstract Method+Non-Abstract Method
public abstract class RbiBank {

	//Non-abstract Method
	public void saving()
	{
		System.out.println("Saving ...5%");
	}
	//Abstract Method
	public abstract void deposit();
}
