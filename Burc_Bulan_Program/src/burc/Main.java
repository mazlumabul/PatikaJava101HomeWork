package burc;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int day;
		String month;
		System.out.print("Kaçýncý ayda doðdunuz? :  ");
		month = scanner.nextLine();

		System.out.print("Hangi gün doðdunuz? :  ");
		day = scanner.nextInt();

		if (month.equals("1")) {
			if (day < 22) {
				System.out.println("Burcunuz Oðlak");
			} else {
				System.out.println("Burcunuz Kova");
			}
		} else if (month.equals("2")) {
			if (day < 20) {
				System.out.println("Burcunuz Kova");
			} else {
				System.out.println("Burcunuz Balýk");
			}
		} else if (month.equals("3")) {
			if (day < 21) {
				System.out.println("Burcunuz Balýk");
			} else {
				System.out.println("Burcunuz Koç");
			}
		} else if (month.equals("4")) {
			if (day < 21) {
				System.out.println("Burcunuz Koç");
			} else {
				System.out.println("Burcunuz Boða");
			}
		} else if (month.equals("5")) {
			if (day < 22) {
				System.out.println("Burcunuz Boða");
			} else {
				System.out.println("Burcunuz Ýkizler");
			}
		} else if (month.equals("6")) {
			if (day < 23) {
				System.out.println("Burcunuz Ýkizler");
			} else {
				System.out.println("Burcunuz Yengeç");
			}
		} else if (month.equals("7")) {
			if (day < 23) {
				System.out.println("Burcunuz Yengeç");
			} else {
				System.out.println("Burcunuz Aslan");
			}
		} else if (month.equals("8")) {
			if (day < 23) {
				System.out.println("Burcunuz Aslan");
			} else {
				System.out.println("Burcunuz Baþak");
			}
		} else if (month.equals("9")) {
			if (day < 23) {
				System.out.println("Burcunuz Baþak");
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
				System.out.println("Burcunuz Oðlak");
			}
		}

	}
}
