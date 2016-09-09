package pr2;

import lib.TextIO;

public class AI {

	public static void main(String[] args) {
		
		System.out.println("Palun sisesta esimese inimese vanus!");
		int age1 = TextIO.getlnInt();
		
		while (age1 <= 0) {
			System.out.println("Palun sisesta korrektne vanus!");
			age1 = TextIO.getlnInt();
		}
		
		System.out.println("Palun sisesta teise inimese vanus!");
		int age2 = TextIO.getlnInt();
		
		while (age2 <= 0) {
			System.out.println("Palun sisesta korrektne vanus!");
			age2 = TextIO.getlnInt();
		}
		
		if(Math.abs(age1-age2) > 10)
			System.out.println("Sind oodatakse Paldiski maantee 52 kliinikus!");
		else if(Math.abs(age1-age2) > 5)
			System.out.println("Mine koju!");
		else if(Math.abs(age1-age2) < 5)
			System.out.println("Äkki läheme kohvile?");
			
	}
}
