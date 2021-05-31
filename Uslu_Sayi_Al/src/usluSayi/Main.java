package usluSayi;

import java.util.Scanner;

/*
Java ile kullanýcýnýn girdiði deðerler ile üslü sayý hesaplayan programý 
"For Döngüsü" kullanarak yapýnýz.
*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total=1;
		System.out.print("Üssü alýnacak sayi : ");
		int n = scanner.nextInt();
		
		System.out.print("Üs : ");
		int k = scanner.nextInt();
		
		for(int i = 1;i<=k;i++) {
			total *= n;
		}
		System.out.println("Cevap : " + total);
	}
}
