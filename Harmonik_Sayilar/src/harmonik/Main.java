package harmonik;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double result = 0;
		System.out.print("Sayi giriniz : ");
		int sayi = scanner.nextInt();

		for (double i = 1; i <= sayi; i++) {
			result += (1/i);
		}
		System.out.println("Sonuç : "+result);
	}
}
