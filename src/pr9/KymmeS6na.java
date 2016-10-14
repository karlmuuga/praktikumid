package pr9;

import lib.TextIO;

public class KymmeS6na {

	public static void main(String[] args) {

		String[] massiiv = new String[10];

		for (int i = 0; i < 10; i++) {
			TextIO.putln("Palun sisesta sõna!");
			massiiv[i] = TextIO.getlnString();
		}

		for (int i = 9; i >= 0; i--) {
			TextIO.putln(massiiv[i].length() + " " + massiiv[i]);
		}
	}

}
