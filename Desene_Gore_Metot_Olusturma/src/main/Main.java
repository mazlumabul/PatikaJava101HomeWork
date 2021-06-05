package main;

import java.util.Scanner;

/*
Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
*/
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("N Sayısı : ");
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
