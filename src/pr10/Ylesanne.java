package pr10;

import java.util.ArrayList;
import java.util.Collections;

import lib.TextIO;
import pr8.Maximal;

public class Ylesanne {

	public static void main(String[] args) {
		boolean stopp = false;
		while (!stopp) {
			TextIO.putln("Millist ülesannet soovid näha? Lõpetamiseks vajuta enter (või midagi muud).");
			switch (TextIO.getlnString()) {

			case "1":
				suurim();
				break;

			case "1.2":
				neo();
				break;

			case "2":
				dia();
				break;

			case "3":
				dia2();
				break;

			default:
				TextIO.putln("Nägemist!");
				stopp = true;
				break;
			}
		}
	}

	public static int suurim() {
		TextIO.putln("Deklareermie massiivi järgmiselt: \nint[] massiiv = {1, 3, 6, 7, 8, 3, 5, 7, 21, 3};");
		int[] massiiv = { 1, 3, 6, 7, 8, 3, 5, 7, 21, 3 };
		TextIO.putln("Massiivi suurim väärtus on: " + Maximal.maksimum(massiiv));
		return 1;
	}

	public static int neo() {
		TextIO.putln(
				"Deklareerime maatriksi järgmiselt: int[][] neo = {\n{1, 3, 6, 7},\n{2, 3, 3, 1},\n{17, 4, 5, 0},\n{-20, 13, 16, 17}\n};\n");
		int[][] maatriks = { { 1, 3, 6, 7 }, { 2, 3, 3, 1 }, { 17, 4, 5, 0 }, { -20, 13, 16, 17 } };
		TextIO.putln("Maatriksi suurim väärtus on: " + Maximal.maksimum(maatriks));
		return 1;
	}

	public static String dia() {
		ArrayList<Integer> arvud = new ArrayList<Integer>();
		TextIO.putln("Palun sisesta täisarvud enteriga. Nulli sisestamine katkestab!");
		while (true) {
			int s = TextIO.getlnInt();
			if (s == 0)
				break;
			else
				arvud.add(s);
		}
		float ratio = 1;
		if (Collections.max(arvud) > 80) {
			ratio = Collections.max(arvud) / 80;
			for (int b = 0; b < arvud.size(); b++)
				arvud.set(b, (int) (arvud.get(b) / ratio));
		}

		for (Integer arv : arvud) {
			String graph = "";
			for (int n = 0; n < arv; n++)
				graph += "x";
			System.out.format("%s %s%n", Math.round(arv * ratio), graph);
		}
		TextIO.putln("");

		return "korras";
	}

	public static String dia2() {
		ArrayList<Integer> arvud = new ArrayList<Integer>();
		TextIO.putln("Palun sisesta täisarvud enteriga. Nulli sisestamine katkestab!");
		while (true) {
			int s = TextIO.getlnInt();
			if (s == 0)
				break;
			else
				arvud.add(s);
		}
		int suurim = Collections.max(arvud);

		for (int rida = (suurim + 2); rida > 0; rida--) {

			if (rida == 2) {
				for (int b = 1; b <= arvud.size(); b++)
					TextIO.put("---");
				TextIO.putln("");
			} else if (rida == 1) {
				for (Integer arv : arvud)
					System.out.format("  %s", arv);
				TextIO.putln("");

			} else {
				for (Integer arv : arvud) {
					if (arv >= (rida - 2))
						TextIO.put("  x");
					else
						TextIO.put("   ");
				}
				TextIO.putln("");
			}
		}
		TextIO.putln("");
		return "korras";
	}

	// astenda(2, 3) = 2³ = 8
	// astenda(5, 2) = 5² = 25

}
