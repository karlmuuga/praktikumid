package pr9;

import lib.TextIO;

public class Palindroom {

	public static void main(String[] args) {
		TextIO.putln("Palun sisesta sõna!");
		String s = TextIO.getlnString();
		String d = (new StringBuilder(s).reverse().toString());
		if (s.equals(d))
			TextIO.putln("palindroom");
		else
			TextIO.putln("ei ole palindroom");

	}

}
