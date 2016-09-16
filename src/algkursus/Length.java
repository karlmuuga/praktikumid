package algkursus;

import lib.TextIO;

public class Length {

	public static void main(String[] args) {
		System.out.println("Kuidas on teie nimi?");
		String s6ne;
		//TEST
		
		s6ne = TextIO.getlnString();
		int nimePikkus = s6ne.length();
		System.out.println("Teie nime pikkus on "+nimePikkus+" tärki.");
	}

}
