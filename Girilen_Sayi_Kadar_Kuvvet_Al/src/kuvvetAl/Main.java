package kuvvetAl;

import java.util.Scanner;
/*
Java döngüler ile girilen sayýya kadar olan 
4 ve 5'in kuvvetlerini ekrana yazdýran programý yazýyoruz.
*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi, i = 0, j=0;

		System.out.print("Sayi giriniz : ");
		sayi = scanner.nextInt();

		do {
			System.out.println(" 4 ^ " + i + " = " + (int) Math.pow(4, i));
			i++;

		} while (i <= sayi);
		System.out.println("---------------------------------");
		
		do {
			System.out.println(" 5 ^ " + j + " = " + (int) Math.pow(5, j));
			j++; 

		} while (j <= sayi);

	}
}
