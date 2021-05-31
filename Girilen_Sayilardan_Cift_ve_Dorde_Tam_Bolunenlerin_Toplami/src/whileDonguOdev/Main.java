package whileDonguOdev;

import java.util.Scanner;

/*
Java döngüler ile tek bir sayý girilene kadar kullanýcýdan giriþleri kabul eden ve 
girilen deðerlerden çift ve 4'ün katlarý olan sayýlarý toplayýp ekrana basan programý
yazýyoruz.
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
		System.out.println("Girilen sayýlardan çift ve 4'ün katý olan sayýlarýn toplamý : "+total);
		
	}
} 
