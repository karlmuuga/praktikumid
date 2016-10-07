package pr7;

import pr6.Methods;

public class Neljas {
	public static void main(String[] args) {
		int raha = 100;

		while (raha > 0) {
			int t2ring = Methods.kasutajaSisestus("Mis numbri peale soovid panustada?", 1, 6);
			int panus = Methods.kasutajaSisestus("Kui palju soovid panustada?", 1, raha);
			raha -= panus;
			int mynt = Methods.suvakas(1, 6);
			if (mynt == t2ring) {
				raha += panus * 2;
				System.out.println("Sa võitsid! Nüüd on jääk " + raha);
			} else {
				System.out.println("Sa kaotasid :(.. Nüüd on jääk " + raha);
			}
		}
	}
}
