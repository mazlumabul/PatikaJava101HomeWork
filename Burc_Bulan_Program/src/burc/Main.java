package burc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int day;
		String month;
		System.out.print("Ka��nc� ayda do�dunuz? :  ");
		month = scanner.nextLine();

		System.out.print("Hangi g�n do�dunuz? :  ");
		day = scanner.nextInt();

		if (month.equals("1")) {
			if (day < 22) {
				System.out.println("Burcunuz O�lak");
			} else {
				System.out.println("Burcunuz Kova");
			}
		} else if (month.equals("2")) {
			if (day < 20) {
				System.out.println("Burcunuz Kova");
			} else {
				System.out.println("Burcunuz Bal�k");
			}
		} else if (month.equals("3")) {
			if (day < 21) {
				System.out.println("Burcunuz Bal�k");
			} else {
				System.out.println("Burcunuz Ko�");
			}
		} else if (month.equals("4")) {
			if (day < 21) {
				System.out.println("Burcunuz Ko�");
			} else {
				System.out.println("Burcunuz Bo�a");
			}
		} else if (month.equals("5")) {
			if (day < 22) {
				System.out.println("Burcunuz Bo�a");
			} else {
				System.out.println("Burcunuz �kizler");
			}
		} else if (month.equals("6")) {
			if (day < 23) {
				System.out.println("Burcunuz �kizler");
			} else {
				System.out.println("Burcunuz Yenge�");
			}
		} else if (month.equals("7")) {
			if (day < 23) {
				System.out.println("Burcunuz Yenge�");
			} else {
				System.out.println("Burcunuz Aslan");
			}
		} else if (month.equals("8")) {
			if (day < 23) {
				System.out.println("Burcunuz Aslan");
			} else {
				System.out.println("Burcunuz Ba�ak");
			}
		} else if (month.equals("9")) {
			if (day < 23) {
				System.out.println("Burcunuz Ba�ak");
			} else {
				System.out.println("Burcunuz Terazi");
			}
		} else if (month.equals("10")) {
			if (day < 23) {
				System.out.println("Burcunuz Terazi");
			} else {
				System.out.println("Burcunuz Akrep");
			}
		} else if (month.equals("11")) {
			if (day < 22) {
				System.out.println("Burcunuz Akrep");
			} else {
				System.out.println("Burcunuz Yay");
			}
		} else if (month.equals("12")) {
			if (day < 22) {
				System.out.println("Burcunuz Yay");
			} else {
				System.out.println("Burcunuz O�lak");
			}
		}

	}
}
