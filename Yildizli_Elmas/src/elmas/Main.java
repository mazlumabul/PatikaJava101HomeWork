package elmas;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int basamakSayisi;
		System.out.print("Basamak Sayýsý : ");
		basamakSayisi = scanner.nextInt();

		for (int i = 1; i <= basamakSayisi; i++) {
			for (int k = 1; k <= (basamakSayisi - i); k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= (2 * i - 1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i < basamakSayisi; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 2 * basamakSayisi - 1; k >= (2 * i + 1); k--) {
				System.out.print("*");

			}
			System.out.println();

		}
	}
}
