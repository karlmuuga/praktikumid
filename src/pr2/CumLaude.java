package pr2;

import lib.TextIO;

public class CumLaude {
	public static void main(String[] args) {
		
		System.out.println("Tere!\nPalun sisesta enda kaalutud keskmine hinne!");
		
		double hinne = TextIO.getlnDouble();
		while(hinne < 1 || hinne > 5)
			System.out.println("Palun sisesta korrektne hinne!");
			hinne = TextIO.getlnDouble();
		
		System.out.println("Palun sisesta enda lõputöö hinne!");
		
		double too = TextIO.getlnDouble();
		while(too < 1 || too > 5)
			System.out.println("Palun sisesta korrektne hinne!");
			too = TextIO.getlnDouble();
			
		if(hinne > 4.5 && too == 5)
			System.out.println("Õnnitlused! Sa saad Cum Laude! Aga mida sa sellega nüüd peale hakkad?");
		else
			System.out.println("Loodan, et sa üldse lõpetad..");
			
	}
}
