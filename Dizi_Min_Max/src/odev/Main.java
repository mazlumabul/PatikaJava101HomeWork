package odev;

import java.util.Arrays;
import java.util.Scanner;

//Dizideki elemanlar�n girilen say�dan k���k en yak�n say�y� ve 
//en b�y�k en yak�n say�y� bulan program� yaz�n�z.
public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi : ");
		int sayi = scanner.nextInt();

		System.out.println("Girilen sayi : " + sayi);

		int[] list = { 15, 14, 12, 788, 150, 1, 2, 0 };
		int girilenSayidanKucukOlanEnBuyuk = 0, girilenSayidanBuyukOlanEnKucuk = 2147483647;

		for (int i = 0; i < list.length; i++) {
			if (sayi > list[i]) {
				if (list[i] > girilenSayidanKucukOlanEnBuyuk) {
					girilenSayidanKucukOlanEnBuyuk = list[i];
				}
			}

			else if (sayi < list[i]) {

				if (list[i] < girilenSayidanBuyukOlanEnKucuk) {
					girilenSayidanBuyukOlanEnKucuk = list[i];
				}
			}

		}

		System.out.println("Girilen say�dan k���k en yak�n say� : " + girilenSayidanKucukOlanEnBuyuk);
		System.out.println("Girilen say�dan b�y�k en yak�n say� : " + girilenSayidanBuyukOlanEnKucuk);

	}
}
