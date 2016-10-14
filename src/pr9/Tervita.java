package pr9;

import java.util.ArrayList;

import lib.TextIO;

public class Tervita {

	public static void main(String[] args) {
		ArrayList<Inimene> inimesed = new ArrayList<Inimene>();
		inimesed.add(new Inimene("Mati", 34));

		while (true) {
			TextIO.putln("Palun sisesta inimese nimi");
			String nimi = TextIO.getlnString();

			TextIO.putln("Palun sisesta inimese vanus");
			int vanus = TextIO.getlnInt();

			inimesed.add(new Inimene(nimi, vanus));
			
			TextIO.putln("Lõpetamiseks kirjuta lõpeta, vastasel juhul vajuta enter");
			if (TextIO.getlnString().equals("lõpeta"))
				break;

		}

		for (Inimene inimene : inimesed) {
			// Java kutsub välja Inimene klassi toString() meetodi
			inimene.tervita();
			// System.out.println(inimene);
		}
	}

}
