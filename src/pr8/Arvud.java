package pr8;

import lib.TextIO;

public class Arvud {

	public static void main(String[] args) {

		int[] massiiv = new int[10];

		for (int i = 0; i < 10; i++) {
			TextIO.putln("Palun sisesta arv!");
			massiiv[i] = TextIO.getlnInt();
		}

		for (int i = 9; i >= 0; i--) {
			TextIO.putln(massiiv[i]);
		}
	}

}
