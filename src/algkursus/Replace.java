package algkursus;

import lib.TextIO;

public class Replace {

	public static void main(String[] args) {

		String tekst = TextIO.getlnString();
		System.out.println(tekst.replace('a', '_'));

	}
}
