package algkursus;

import lib.TextIO;

public class AI {

	public static void main(String[] args) {
		
		TextIO.putln("Palun sisesta esimese inimese vanus!");
		int age1 = TextIO.getlnInt();
		
		while (age1 <= 0) {
			TextIO.putln("Palun sisesta korrektne vanus!");
			age1 = TextIO.getlnInt();
		}
		
		TextIO.putln("Palun sisesta teise inimese vanus!");
		int age2 = TextIO.getlnInt();
		
		while (age2 <= 0) {
			TextIO.putln("Palun sisesta korrektne vanus!");
			age2 = TextIO.getlnInt();
		}
		
		if(Math.abs(age1-age2) > 10)
			TextIO.putln("Sind oodatakse Paldiski maantee 52 kliinikus!");
		else if(Math.abs(age1-age2) > 5)
			TextIO.putln("Mine koju!");
		else if(Math.abs(age1-age2) < 5)
			TextIO.putln("Äkki läheme kohvile?");
			
	}
}
