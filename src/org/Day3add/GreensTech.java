package org.Day3add;
public class GreensTech {
	
	public void greensOmr(String branch)
	{
		System.out.println("Green Tech Branch"+ branch);		
	}
	public void greensOmr(int telephone)
	{
		System.out.println("Green Tech telephone"+ telephone);
	}
	public void greensOmr(long  mobNum)
	{
		System.out.println("Green Tech mobNum"+ mobNum);		
	}
	public void greensOmr(String branch,int telephone,long  mobNum)
	{
		System.out.println("Green Tech Branch"+ branch);
		System.out.println("Green Tech telephone"+ telephone);
		System.out.println("Green Tech mobNum"+ mobNum);		
	}
	public void greensOmr(int telephone,long  mobNum,String branch)
	{
		System.out.println("Green Tech Branch"+ branch);
		System.out.println("Green Tech telephone"+ telephone);
		System.out.println("Green Tech mobNum"+ mobNum);		
	}
	public static void main(String[] args) {
	GreensTech g=new GreensTech();
	g.greensOmr("Adyar");
	g.greensOmr(43511623);
	g.greensOmr(8939915577l);
	g.greensOmr("OMR");
	g.greensOmr(43511623);
	g.greensOmr(8939925577l);
	g.greensOmr(43511623,8939915577l, "Velachery");
	g.greensOmr("Velachery",43511623,8939915577l);
	g.greensOmr(43511623,8939915577l, "Tambaram");
	g.greensOmr("Tambaram",43511623,8939915577l);
	
}
}
