package pr7;

import lib.TextIO;
import pr6.Methods;

public class Liisu {
	public static void main(String[] args) {
		
		int n = Methods.kasutajaSisestus("Palun sisestage inimeste arv!", 1, 10);
		String[] massiiv = new String[n];
		
		for(int i = 0 ; i < n ; i++){
			int b = i+1;
			TextIO.putln("Palun sisesta inimese nr " + b + " nimi!");
			massiiv[i] = TextIO.getlnString();
		}
		TextIO.putln("Tema nimi on " + massiiv[Methods.suvakas(0, (n-1))]);
	}

}
