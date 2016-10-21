package pr10;

import java.util.ArrayList;

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
		TextIO.putln("Deklareerime maatriksi järgmiselt: int[][] neo = {\n{1, 3, 6, 7},\n{2, 3, 3, 1},\n{17, 4, 5, 0},\n{-20, 13, 16, 17}\n};\n");
		int[][] maatriks = {
			    {1, 3, 6, 7},
			    {2, 3, 3, 1},
			    {17, 4, 5, 0},
			    {-20, 13, 16, 17}
			};
		TextIO.putln("Maatriksi suurim väärtus on: " + Maximal.maksimum(maatriks));
		return 1;
	}
	
	public static String dia(){
		ArrayList<Integer> arvud = new ArrayList<Integer>();
		while(true){
			TextIO.putln("Palun sisesta täisarv. Nulli sisestamine katkestab!");
			int s = TextIO.getlnInt();
			if(s == 0)
				break;
			else
				arvud.add(s);
		}


		return "korras";
	}

}
