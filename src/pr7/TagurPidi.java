package pr7;

import lib.TextIO;

public class TagurPidi {

	public static void main(String[] args) {
		TextIO.putln("Palun sisesta sõna!");
		TextIO.putln(new StringBuilder(TextIO.getlnString()).reverse().toString());
	}

}
