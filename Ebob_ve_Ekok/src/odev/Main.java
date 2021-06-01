package odev;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int enKucuk;
		int i = 1, j = 1;
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
		while (i <= enKucuk) {
			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
			i++;
		}
		System.out.println("Ebob : " + ebob);

		// EKOK
		while (j <= (n1 * n2)) {
			if (j % n1 == 0 && j % n2 == 0) {
				System.out.println("Ekok : " + j);

				break;
			}
			j++;
		}
	}
}
