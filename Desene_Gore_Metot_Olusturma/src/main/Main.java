package main;

import java.util.Scanner;

/*
Kural : Girilen say� 0 veya negatif oldu�u yere kadar girilen say�dan 5 rakam�n� ��kar�n. 
Her ��karma i�lemi s�ras�nda ekrana son de�eri yazd�r�n. 
Say� negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme i�leminde say�n�n son de�erini ekrana yazd�r�n.
*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N Say�s� : ");
		int n = scanner.nextInt();

		desenAzalt(n, n);

	}

	public static int desenAzalt(int number, int tempNumber) {

		if (number > 0) {
			System.out.print(number + " ");
			return desenAzalt(number - 5, tempNumber);
		} else {
			return desenArttir(number, tempNumber);
		}
	}

	public static int desenArttir(int number, int tempNumber) {

		System.out.print(number + " ");
		if (number == tempNumber) {
			return number;
		} else {
			return desenArttir(number + 5, tempNumber);
		}
	}

}
