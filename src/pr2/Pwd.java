package pr2;

import lib.TextIO;

public class Pwd {

	public static void main(int[] args) {
		String pwd = "paroolike123";
		System.out.println("Palun sisesta enda parool.");
		String input = TextIO.getlnString();
		if(input.equals(pwd))
			System.out.println("Tere tulemast NSA süsteemi!");
	}

}
	