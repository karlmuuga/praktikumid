package pr7;

public class Tagastaja {

	public static int summa(int[] massiiv) {
		int l = massiiv.length;
		int s = 0;
		for (int i = 0; i < l; i++) {
			s += massiiv[i];
		}
		return s;
	}

	public static void main(String[] args) {
		// sedasi saab meetodi välja kutsuda
		int summa = summa(new int[] { 4, 3, 1, 7, -1 });
		System.out.println(summa);
	}

}
