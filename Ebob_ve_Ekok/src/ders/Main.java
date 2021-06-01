package ders;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int enKucuk;

		System.out.print("n1 :");
		int n1 = scanner.nextInt();

		System.out.print("n2 :");
		int n2 = scanner.nextInt();
		int ebob = 1; 

		if (n1 < n2) {
			enKucuk = n1;
		} else if (n2 < n1) {
			enKucuk = n2;
		} else {
			enKucuk = n1;
		}

		// EBOB
		for (int i = 1; i <= enKucuk; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
		}
		System.out.println("Ebob : " + ebob);
		// EKOK
		for (int i = 1; i <= (n1 * n2); i++) {
			if (i % n1 == 0 && i % n2 == 0) {
				System.out.println("Ekok : " + i);
				break;
			}
		}
	} 
}
