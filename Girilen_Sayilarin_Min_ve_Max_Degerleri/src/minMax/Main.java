package minMax;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numberUfnumbers;
		int min=1,max=1,maxSayi,minSayi;
		
		System.out.print("Kaç sayi gireceksiniz : ");
		numberUfnumbers = scanner.nextInt();
		
		for(int i = 0; i<numberUfnumbers;i++) {
			System.out.print("sayi giriniz : ");
			int sayi = scanner.nextInt();
			maxSayi = sayi;
			// 1 2 3 4 5
			if(maxSayi>max) {
				max=maxSayi;	
			}
			minSayi = sayi;
			if(minSayi < sayi) {
				min = minSayi;
			}
		}
		System.out.println("Maximum Sayi : " + max);
		System.out.println("Minimum Sayi : " + min);

	}
} 
