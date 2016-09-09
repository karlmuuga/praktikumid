package pr2;

import lib.TextIO;

public class AI {

	public static void main(int[] args) {
		
		System.out.println("Palun sisesta esimese inimese vanus!");
		int age1 = TextIO.getlnInt();
		
		System.out.println("Palun sisesta teise inimese vanus!");
		int age2 = TextIO.getlnInt();
		
		if(Math.abs(age1-age2) > 5)
			System.out.println("Mine koju!");
		else if(Math.abs(age1-age2) > 10)
			System.out.println("Sind oodatakse Paldiski maantee 52 kliinikus!");
		else if(Math.abs(age1-age2) < 5)
			System.out.println("Äkki läheme kohvile?");
			
	}
}
