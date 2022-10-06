package newpractise_programs;

import utilities.Seleniumutility;

public class Utility_practise extends Seleniumutility{

	public static void main(String[] args) {

		
		Utility_practise up1=new Utility_practise();
		up1.setUp("chrome", "https://demo.automationtesting.in/Register.html");
	  up1.getTitleOfPage();	
		up1.getCurrentUrlOfPage();
		up1.getPageSourceSize();
		
	}

}
