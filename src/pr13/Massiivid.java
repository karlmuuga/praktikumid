package pr13;

import lib.TextIO;

public class Massiivid {

	public static void main(String[] args) {
		int[][] neo = { { 1, 1, 1, 1, 1 }, { 2, 3, 4, 5, 6 }, { 3, 4, 5, 6, 7 }, { 4, 5, 6, 7, 8 },
				{ 5, 6, 7, 8, 9 }, };

		boolean stopp = false;
		while (!stopp) {
			TextIO.putln("Millist ülesannet soovid näha? Lõpetamiseks vajuta enter (või midagi muud).");
			switch (TextIO.getlnString()) {

			case "1":
				tryki(neo[3]);
				break;

			case "2":
				tryki(neo);
				break;

			case "3":
				tryki(ridadeSummad(neo));
				break;

			case "4":
				System.out.println(korvalDiagonaaliSumma(neo));
				break;

			case "5":
				tryki(ridadeMaksimumid(neo));
				break;

			case "6":
				System.out.println(miinimum(neo));
				break;

			case "7":
				tryki(kahegaJaakMaatriks(10, 10));
				break;
				
			case "8":
				int[][] maatriks = {{1,2},{3,4},{5,6}};
				tryki(transponeeri(maatriks));
				break;

			default:
				TextIO.putln("Nägemist!");
				stopp = true;
				break;
			}
		}
	}

	public static void tryki(int[] massiiv) {
		for (int arv : massiiv)
			System.out.print(arv + " ");
		System.out.println("");
	}

	public static void tryki(int[][] maatriks) {

		for (int n = 0; n < maatriks.length; n++)
			tryki(maatriks[n]);

		System.out.println("");
	}

	public static int[] ridadeSummad(int[][] maatriks) {
		int[] massiiv = new int[maatriks.length];

		for (int n = 0; n < maatriks.length; n++) {
			int summa = 0;
			for (int arv : maatriks[n])
				summa += arv;
			massiiv[n] = summa;
		}

		return massiiv;
	}

	public static int korvalDiagonaaliSumma(int[][] maatriks) {
		int summa = 0;
		for (int i = 0; i < maatriks[0].length; i++)
			summa += maatriks[i][maatriks[i].length - 1 - i];
		return summa;
	}

	public static int reaSuurim(int[] rida) {
		int suurim = rida[0];
		for (int arv : rida) {
			if (suurim < arv)
				suurim = arv;
		}
		return suurim;
	}

	public static int[] ridadeMaksimumid(int[][] maatriks) {
		int[] massiiv = new int[maatriks.length];

		for (int i = 0; i < maatriks.length; i++)
			massiiv[i] = reaSuurim(maatriks[i]);

		return massiiv;
	}

	public static int reaV2him(int[] rida) {
		int v2him = rida[0];
		for (int arv : rida) {
			if (v2him > arv)
				v2him = arv;
		}
		return v2him;
	}

	public static int miinimum(int[][] maatriks) {
		int v2him = reaV2him(maatriks[0]);
		for (int[] rida : maatriks) {
			if (reaV2him(rida) < v2him)
				v2him = reaV2him(rida);
		}
		return v2him;
	}

	public static int[][] kahegaJaakMaatriks(int ridu, int veerge) {
		int[][] maatriks = new int[ridu][veerge];
		for (int rida = 0; rida < maatriks.length; rida++) {
			for (int veerg = 0; veerg < maatriks[0].length; veerg++)
				maatriks[rida][veerg] = (rida + veerg) % 2;
		}

		return maatriks;
	}

	public static int[][] transponeeri(int[][] maatriks) {
		
		int[][] vastus = new int[maatriks[0].length][maatriks.length];
		
		for(int rida = 0 ; rida < maatriks[0].length ; rida++){
			for(int veerg = 0; veerg < maatriks.length ; veerg++)
				vastus[rida][veerg] = maatriks[veerg][rida];
		}
		
		return vastus;
	}

}
