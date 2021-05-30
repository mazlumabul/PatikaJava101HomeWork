package sayi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayac = 0, toplam = 0; 
		double ortalama = 0;
		System.out.print("Sayi gir : ");
		int sayi = scanner.nextInt();
		
		for(int i = 1; i< sayi; i++) {
			if(i %3 ==0 && i %4 ==0) {
				sayac++;
				toplam += i;
				ortalama= toplam /sayac;
				
			}
		}
		
		System.out.println(ortalama);
		
	}
}
 