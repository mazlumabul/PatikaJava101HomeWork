package fibonacci;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int elemanSayisi;
		System.out.print("Eleman sayýsý : ");
		elemanSayisi = scanner.nextInt();
		int sayi1 = 0, sayi2 = 1, sayi3;

		for (int i = 0; i < elemanSayisi; i++) {
			System.out.print(sayi1 + " + ");
			System.out.print(sayi2 + " = ");

			sayi3 = sayi1 + sayi2;
			System.out.println(sayi3);
			sayi1 = sayi2;
			sayi2 = sayi3;

		}

	}
}
