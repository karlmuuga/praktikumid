package pr7;

import pr6.Methods;

public class KullKiriPanus {
	public static void main(String[] args) {
		int raha = 100;

		while (raha > 0) {

			int panus = Methods.kasutajaSisestus("Kui palju soovid panustada?", 1, 25);
			raha -= panus;
			int mynt = Methods.suvakas(0, 1);
			if (mynt == 1) {
				raha += panus * 2;
				System.out.println("Sa võitsid! Nüüd on jääk "+raha);
			} else {
				System.out.println("Sa kaotasid :(.. Nüüd on jääk "+raha);
			}
		}
	}
}
