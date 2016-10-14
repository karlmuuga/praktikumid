package pr9;

import lib.TextIO;

public class SuurT2hed {

	public static void main(String[] args) {
		TextIO.putln("Palun sisesta sõna!");
		String s = TextIO.getlnString().toUpperCase();
		char massiiv[] = s.toCharArray();
		for(int i = 0; i < s.length() ; i++){
			if(i != s.length()-1)
				System.out.print(massiiv[i] + "-");
			else
				System.out.print(massiiv[i]);
		
		}
	}

}
