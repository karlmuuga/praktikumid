package pr8;
import lib.TextIO;
import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {
		ArrayList<String> nimed = new ArrayList<String>();
		TextIO.putln("Palun sisesta nimed! Tühi sisend katkestab!");
		
		while(true){
			String sisend = TextIO.getlnString();
			if(sisend.equals(""))
				break;
			nimed.add(sisend);
		}
		java.util.Collections.sort(nimed);
		for (String nimi : nimed) {
		    System.out.println(nimi);
		}

	}

}
