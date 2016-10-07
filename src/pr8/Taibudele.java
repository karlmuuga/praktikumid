package pr8;

import lib.TextIO;
import java.util.*;

public class Taibudele {

	public static void main(String[] args) {

		class Sportlane {
			public String nimi;
			public double tulemus;
		}

		// ˇˇˇˇsiin saab lihtsasti muuta sportlaste arvu
		Sportlane[] a = new Sportlane[10];
		int i;

		System.out.println("Küsin 10 tulemust ja nime.");
		System.out.println("Sisesta palun tulemus tühik nimi.");
		System.out.println("Näiteks: 4.20 Dabber \"Herbalist\" Crazy");

		for (i = 0; i < a.length; i++) {
			Sportlane ajutine = new Sportlane();
			System.out.println("Sportlane nr " + (i + 1) + " : ");
			ajutine.tulemus = TextIO.getDouble();
			ajutine.nimi = TextIO.getlnString();
			a[i] = ajutine;
		}

		Arrays.sort(a, new Comparator<Sportlane>() {

			public int compare(Sportlane s1, Sportlane s2) {
				if (s1.tulemus > s2.tulemus)
					return -1;
				else if (s1.tulemus < s2.tulemus)
					return 1;
				else
					return 0;
			}
		});

		// Väljastame tulemused
		for (i = 0; i < a.length; i = i + 1) {
			System.out.println(a[i].tulemus + "\t" + a[i].nimi);
		}

	}
}
