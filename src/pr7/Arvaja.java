package pr7;

import lib.TextIO;
import pr6.Methods;

public class Arvaja {

	public static void main(String[] args) {
		int i = Methods.suvakas(1, 100);

		while (true) {
			TextIO.putln("Arva, mis arv oli?");
			int s = Integer.parseInt(TextIO.getlnString());

			if (s == i) {
				TextIO.putln("Päris osav oled, arvasid ära!");
				break;
			} else if (s > i) {
				TextIO.putln("Tegelik arv on väiksem!");
			} else {
				TextIO.putln("Tegelik arv on suurem!");
			}

		}

	}

}
