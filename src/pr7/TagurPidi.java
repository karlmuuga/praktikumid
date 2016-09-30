package pr7;

import lib.TextIO;

public class TagurPidi {

	public static void main(String[] args) {
		TextIO.putln("Palun sisesta sõna!");
		String s = TextIO.getlnString();
		System.out.println(new StringBuilder(s).reverse().toString());

	}

}
