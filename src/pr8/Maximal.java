package pr8;

public class Maximal {

	public static int maksimum(int[] massiiv) {
		int max = massiiv[0];

		for (int i = 1; i < massiiv.length; i++) {
			if (massiiv[i] > max) {
				max = massiiv[i];
			}
		}
		return max;
	}

	// meetod, mis leiab maatriksi maksimumi
	public static int maksimum(int[][] maatriks) {
		int max = Math.max(Maximal.maksimum(maatriks[0]), Maximal.maksimum(maatriks[1]));
		return max;
	}

	public static void main(String[] args) {
		int[][] maatriks = { { 1, 0, 12, -1 }, { 7, -3, 2, 5 }};
		System.out.println("Suurim väärtus on: " + maksimum(maatriks));

	}

}
