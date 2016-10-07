package algkursus;

import lib.TextIO;

public class Tsyklid {

	public static void main(String[] args) {

		// Deklareerime põhimuutuja i
		int i;

		// Trükkida ühele reale numbrid 10 kuni 1
		for (i = 10; i > 0; i--)
			System.out.print(i + " ");
		System.out.print("\r\n\r\n");

		// Trükkida ühele reale paarisarvud 0 kuni 10 (0,2,4 jne.)
		for (i = 0; i <= 10; i += 2)
			System.out.print(i + " ");
		System.out.print("\r\n\r\n");

		// Trükkida ühele reale kolmega jaguvad arvud vahemikus 30 kuni 0 (30,
		// 27, 24 jne.)
		for (i = 30; i >= 3; i -= 3)
			System.out.print(i + " ");
		System.out.print("\r\n\r\n");

		// Tabelˇˇ

		// Deklareerime ruudukujulise tabeli külje pikkuse
		int suurus = 8;// Seda on lihtne muuta _=)

		for (i = 1; i <= suurus; i++) {

			for (int j = 1; j <= suurus; j++) {

				if (i == j)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.print("\r\n");
		}
		System.out.print("\r\n\r\n");

		// Tabel vol 2

		TextIO.putln("Millises möödus tabeli genereerin?");
		int k6rgus = TextIO.getlnInt();
		for (i = 1; i <= (2 * k6rgus + 3); i++)
			System.out.print("-");
		System.out.print("\r\n");

		for (i = 0; i < (k6rgus); i++) {
			System.out.print("| ");

			for (int j = 0; j < k6rgus; j++) {

				if (i == j || j == (k6rgus - i - 1))
					System.out.print("x ");
				else
					System.out.print("0 ");
			}
			System.out.print("| \r\n");
		}

		for (i = 1; i <= (2 * k6rgus + 3); i++)
			System.out.print("-");
		System.out.print("\r\n\r\n");

		// Tabel vol 3
		TextIO.putln("Millises möödus tabeli genereerin?");
		int tabelisuurus = TextIO.getlnInt();
		for (i = 0; i < tabelisuurus; i++) {
			int k = i;
			for (int j = 0; j < tabelisuurus; j++) {
				System.out.print(k + " ");
				k++;
				if (k == 10)
					k = 0;

			}
			System.out.print("\r\n");
		}
	}

}
