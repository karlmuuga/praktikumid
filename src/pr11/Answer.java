package pr11;

import java.util.ArrayList;

public class Answer {

	public static void main(String[] args) {
		int[] res = veeruMaxid(new int[][] { { 1, 2, 6 }, { 4, 5, 3 } });
		for (Integer a : res)
			System.out.println(a);
	}

	public static int[] veeruMaxid(int[][] m) {

		ArrayList<Integer> v22rtused = new ArrayList<Integer>();

		int pikim = m[0].length;

		for (int i = 0; i < m.length; i++) {

			for (Integer arv : m[i]) {
				if (m[i].length > pikim) {
					pikim = m[i].length;
				}
			}
		}

		for (int c = 0; c < pikim; c++) {
			v22rtused.add(maksimum(m, c));
		}

		int[] vastus = new int[v22rtused.size()];
		
		for(int b = 0 ; b < v22rtused.size() ;b++)
			vastus[b] = v22rtused.get(b);
		
		return vastus;
	}

	public static int maksimum(int[][] massiiv, int rida) {
		int max = massiiv[0][rida];

		for (int i = 1; i < massiiv.length; i++) {
			if (massiiv[i][rida] > max) {
				max = massiiv[i][rida];
			}
		}
		return max;
	}

}