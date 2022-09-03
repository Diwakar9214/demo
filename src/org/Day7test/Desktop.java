package org.Day7test;

public class Desktop implements HardWare,Software {

	public void desktopModel()
	{
		System.out.println("Desktop Hp,Lenovo,Dell");
	}

	@Override
	public void softwareResources() {
		System.out.println("Vlc,Java,chrome,zoom,ms office");
	}

	@Override
		public void hardwareResources() {
		System.out.println("Ram,Storage,Graphic card,Mother board");
	}
	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.desktopModel();
		d.softwareResources();
		d.hardwareResources();
	}
}
