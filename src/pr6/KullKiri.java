package pr6;

import lib.TextIO;

public class KullKiri {

	public static void main(String[] args) {
		int k = Methods.kasutajaSisestus("Kull (0) või kiri (1)?", 0, 1);
		int vise = Methods.suvakas(0, 1);
		TextIO.putln("Kasutaja pakkus " + k);
		TextIO.putln("Arvuti pakkus " + vise);
		if(vise != k)
			TextIO.putln("Kahjuks kaotasid :(");
		else
			TextIO.putln("Võitsid!");
			
	}

}
