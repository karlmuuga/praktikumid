package pr6;

import lib.TextIO;

public class Methods {

	// Kuubi meetod
	public static double kuup(int a) {

		return Math.pow(a, 3);
	}

	public static int kasutajaSisestus(String kysimus, int min, int max) {
		TextIO.putln(kysimus);
		return kasutajaSisestus(min, max);
	}

	public static int kasutajaSisestus(int min, int max) {

		while (true) {
			int a = TextIO.getlnInt();
			if (a >= min && a <= max)
				return a;
			TextIO.putln("Palun proovi uuesti!");
		}
	}

	public static int suvakas(int min, int max) {
		int vahemik = Math.abs(max - min) + 1;
		return min + (int) (Math.random() * vahemik);
	}

	public static void main(String[] args) {

		// TextIO.putln(kuup(5));
		kuup(5);
		TextIO.putln(kasutajaSisestus("Palun sisesta õige hinne!", 1, 5));

	}
}
