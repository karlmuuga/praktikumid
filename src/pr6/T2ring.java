package pr6;

public class T2ring {

	public static void main(String[] args) {
		int k1 = Methods.suvakas(1, 6);
		int k2 = Methods.suvakas(1, 6);

		int a1 = Methods.suvakas(1, 6);
		int a2 = Methods.suvakas(1, 6);

		System.out.println("Kasutaja täringud on " + k1 + " ja " + k2 + ".");
		System.out.println("Arvuti täringud on " + a1 + " ja " + a2 + ".");

		int k = k1 + k2;
		int a = a1 + a2;

		if (k > a)
			System.out.println("Võitis kasutaja: (k" + k + " vs a" + a + ").");
		else
			System.out.println("Võitis arvuti: (k" + k + " vs a" + a + ").");
	}

}
