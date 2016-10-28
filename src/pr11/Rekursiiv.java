package pr11;

public class Rekursiiv {

	public static void main(String[] args) {
		//System.out.println(astenda(2, 3) + "/r/n");
		long n = 6;
		while (true) {
			n = fibo(n);
			System.out.println(n);
		}
	}

	public static int astenda(int a, int b) {
		if (b > 1)
			return a * astenda(a, (b - 1));
		else
			return a;
	}

	public static long fibo(long n) {
		if (n == 0)
			return 0;
		else if (n == 1)
			return 1;
		else
			return fibo(n - 1) + fibo(n - 2);
	}
}
