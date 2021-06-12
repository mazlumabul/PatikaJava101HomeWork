package main;

import java.util.Scanner;
//Java dilinde, çok boyutlu diziler ile oluþturulmuþ matrisin transpozunu bulan programý yazýnýz.
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Satir Sayisi : ");
		int row = scanner.nextInt();

		System.out.print("Sütun Sayisi : ");
		int column = scanner.nextInt();

		int[][] matris = new int[row][column];
		if(row <= 0 || column <= 0 ) {
			System.out.println("Satýr veya Sutün sayýsý Sýfýr dan küçük olamaz ");
		}
		// matris dizisine eleman aldýk
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				System.out.print("[ " + i + " " + j + " ] elemaný = ");
				matris[i][j] = scanner.nextInt();
			}
		}
		// matris dizisini yazdýr
		System.out.println("\nDizi\n");
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				System.out.print("[ " + matris[i][j] + " ]");
			}
			System.out.println();
		}
		// tranzpozu al ve göster
		System.out.println("\nTranspoz\n");
		for (int i = 0; i < matris[0].length; i++) {
			for (int j = 0; j < matris.length; j++) {
				System.out.print("[ " + matris[j][i] + " ]");
			}
			System.out.println();
		}

	}
}
