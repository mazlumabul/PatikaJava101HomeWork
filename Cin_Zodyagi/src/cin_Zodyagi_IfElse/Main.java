package cin_Zodyagi_IfElse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dogumYili;

		System.out.println("Do�um Y�l�n�z� Giriniz :");
		dogumYili = scanner.nextInt();

		if (dogumYili % 12 == 0) {
			System.out.print("�in Zodya�� Burcunuz : Maymun");
		} else if (dogumYili % 12 == 1) {
			System.out.print("�in Zodya�� Burcunuz : Horoz");
		} else if (dogumYili % 12 == 2) {
			System.out.print("�in Zodya�� Burcunuz : K�pek");
		} else if (dogumYili % 12 == 3) {
			System.out.print("�in Zodya�� Burcunuz : Domuz");
		} else if (dogumYili % 12 == 4) {
			System.out.print("�in Zodya�� Burcunuz : Fare");
		} else if (dogumYili % 12 == 5) {
			System.out.print("�in Zodya�� Burcunuz : �k�z");
		} else if (dogumYili % 12 == 6) {
			System.out.print("�in Zodya�� Burcunuz : Kaplan");
		} else if (dogumYili % 12 == 7) {
			System.out.print("�in Zodya�� Burcunuz : Tav�an");
		} else if (dogumYili % 12 == 8) {
			System.out.print("�in Zodya�� Burcunuz : Ejderha");
		} else if (dogumYili % 12 == 9) {
			System.out.println("�in Zodya�� Burcunuz : Y�lan");
		} else if (dogumYili % 12 == 10) {
			System.out.println("�in Zodya�� Burcunuz : At");
		} else if (dogumYili % 12 == 11) {
			System.out.println("�in Zodya�� Burcunuz : Koyun");
		}

	}
}
