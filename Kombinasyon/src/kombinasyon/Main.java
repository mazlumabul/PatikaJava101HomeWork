package kombinasyon;

import java.util.Scanner;

/*
Java ile kombinasyon hesaplayan program yazýnýz.
*/

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int nFaktoryel = 1, rFaktoryel = 1;
		int nEksiR, nEksiRFaktoryel = 1;
		double sonuc = 0;
		System.out.print("N : ");
		int n = scanner.nextInt();

		System.out.print("r : ");
		int r = scanner.nextInt();

		for (int i = 1; i <= n; i++) {
			nFaktoryel *= i;
		}
		for (int i = 1; i <= r; i++) {
			rFaktoryel *= i;
		}
		nEksiR = n - r;

		for (int i = 1; i <= nEksiR; i++) {
			nEksiRFaktoryel *= i;
		}

		sonuc = nFaktoryel / (rFaktoryel * (nEksiRFaktoryel));
		System.out.println("C(" + n + "," + r + ") = " + sonuc);

	}
}
