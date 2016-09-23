package pr6;

import lib.TextIO;

public class Liisu {

	public static void main(String[] args) {
		TextIO.putln("Mitu inimest teie rühmas on?");
		int i = TextIO.getlnInt();
		TextIO.putln(Methods.suvakas(1, i));

	}

}
