package whileDonguOdev;

import java.util.Scanner;

/*
Java d�ng�ler ile tek bir say� girilene kadar kullan�c�dan giri�leri kabul eden ve 
girilen de�erlerden �ift ve 4'�n katlar� olan say�lar� toplay�p ekrana basan program�
yaz�yoruz.
*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number, total=0;
		
		do {
			System.out.print("Sayi giriniz : ");
			number = scanner.nextInt(); 
			if(number % 4== 0) {
				total += number; 
			}
		} while(number%2 == 0);
		System.out.println("Girilen say�lardan �ift ve 4'�n kat� olan say�lar�n toplam� : "+total);
		
	}
} 
