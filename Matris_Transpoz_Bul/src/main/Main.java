package main;

import java.util.Scanner;
//Java dilinde, �ok boyutlu diziler ile olu�turulmu� matrisin transpozunu bulan program� yaz�n�z.
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Satir Sayisi : ");
		int row = scanner.nextInt();

		System.out.print("S�tun Sayisi : ");
		int column = scanner.nextInt();

		int[][] matris = new int[row][column];
		if(row <= 0 || column <= 0 ) {
			System.out.println("Sat�r veya Sut�n say�s� S�f�r dan k���k olamaz ");
		}
		// matris dizisine eleman ald�k
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				System.out.print("[ " + i + " " + j + " ] eleman� = ");
				matris[i][j] = scanner.nextInt();
			}
		}
		// matris dizisini yazd�r
		System.out.println("\nDizi\n");
		for (int i = 0; i < matris.length; i++) {
			for (int j = 0; j < matris[i].length; j++) {
				System.out.print("[ " + matris[i][j] + " ]");
			}
			System.out.println();
		}
		// tranzpozu al ve g�ster
		System.out.println("\nTranspoz\n");
		for (int i = 0; i < matris[0].length; i++) {
			for (int j = 0; j < matris.length; j++) {
				System.out.print("[ " + matris[j][i] + " ]");
			}
			System.out.println();
		}

	}
}
