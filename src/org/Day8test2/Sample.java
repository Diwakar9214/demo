package org.Day8test2;
public class Sample {
	public static void main(String[] args) {
		//012345678
		String s="Nis%AnT%I";
		//change one letter to anther to another letter
		String re=s.replace('%', 'h');
		System.out.println(re);
		//change one sequence to another  
		String s1="Aus Ind Aus Ind";
		String r=s1.replaceAll("Aus", "Ind");
		System.out.println(r);
		String withspace="Nis ant i";
		//remove all space
		String withoutspace=withspace.replaceAll(" ","" );
		System.out.println(withoutspace);
		System.out.println("***No of space");
		System.out.println(withspace.length()-withoutspace.length());
	}
	
}