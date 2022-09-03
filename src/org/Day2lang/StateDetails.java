package org.Day2lang;

public class StateDetails extends LanguageInfo {
	public void southIndia() {
		
		System.out.println("IT Power");
	}
	public void northIndia() {
		System.out.println("Bolloywood");
		
	}
	
	public static void main(String[] args) {		
		StateDetails sd=new StateDetails();
		sd.southIndia();
		sd.northIndia();
		sd.tamilLanguage();
		sd.englishLanguage();
		sd.hindiLanguage();
	}

}
