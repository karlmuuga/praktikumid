package pr9;

import lib.TextIO;

public class Pulmad {
	public static void main(String[] args) {
		String laul =  "Põdral maja metsa sees, edasi sõnu ei tea.......";
		TextIO.putln("Millise tähega soovid laulda?");
		TextIO.putln(laul.replaceAll("[aeiouõäöü]", TextIO.getlnString()));
	}

}
