package pr8;

import pr6.Methods;

public class KuuluJutt {

	public static void main(String[] args) {
		String[] naine = new String[] { "Mari", "Jane", "Liis" };
		String[] mees = new String[] { "Joonas", "John", "Artur" };
		String[] verb = new String[] { "sebivad", "tülitsevad", "panevad leivad ühte kappi" };

		System.out.format("%s ja %s %s", naine[Methods.suvakas(0, 2)], mees[Methods.suvakas(0, 2)],
				verb[Methods.suvakas(0, 2)]);
	}

}
