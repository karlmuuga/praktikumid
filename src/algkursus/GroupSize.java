package algkursus;

import lib.TextIO;

public class GroupSize {

	public static void main(String[] args) {

		System.out.println("Mitme inimesega on tegemist?");
		int arv = TextIO.getlnInt();

		System.out.println("Kui suured on teie grupid?");
		int suurus = TextIO.getlnInt();
		System.out.println(arv + " inimesest on võimalik moodustada " + (arv/suurus) + " rühma, kusjuures üle jääb " + (arv%suurus) + " inimest.");

	}
}
