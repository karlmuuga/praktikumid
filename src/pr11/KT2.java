package pr11;

import java.util.Arrays;

public class KT2 {

	public static void main(String[] args) {

	}

	public static int score(int[] points) {
		int sum = 0;
		for (Integer a : points)
			sum += a;
		int[] miinimumid = miinimum(points);
		
		int lahutus = 0;
		
		for (Integer b : miinimumid){
			lahutus += b;
			//System.out.println(b);
		}
		
		return sum-lahutus; // TODO!!! Your program here
	}

	private static int[] miinimum(int[] massiiv) {
	    int[] v2himad = new int[2];
	    Arrays.fill(v2himad, Integer.MAX_VALUE);

	    for(int n : massiiv) {
	        if(n < v2himad[1]) {
	        	v2himad[1] = n;
	            Arrays.sort(v2himad);
	        }
	    }
	    return v2himad;
	}

}