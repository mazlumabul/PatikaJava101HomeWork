package cin_Zodyagi_IfElse;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int dogumYili;

		System.out.println("Doðum Yýlýnýzý Giriniz :");
		dogumYili = scanner.nextInt();

		if (dogumYili % 12 == 0) {
			System.out.print("Çin Zodyaðý Burcunuz : Maymun");
		} else if (dogumYili % 12 == 1) {
			System.out.print("Çin Zodyaðý Burcunuz : Horoz");
		} else if (dogumYili % 12 == 2) {
			System.out.print("Çin Zodyaðý Burcunuz : Köpek");
		} else if (dogumYili % 12 == 3) {
			System.out.print("Çin Zodyaðý Burcunuz : Domuz");
		} else if (dogumYili % 12 == 4) {
			System.out.print("Çin Zodyaðý Burcunuz : Fare");
		} else if (dogumYili % 12 == 5) {
			System.out.print("Çin Zodyaðý Burcunuz : Öküz");
		} else if (dogumYili % 12 == 6) {
			System.out.print("Çin Zodyaðý Burcunuz : Kaplan");
		} else if (dogumYili % 12 == 7) {
			System.out.print("Çin Zodyaðý Burcunuz : Tavþan");
		} else if (dogumYili % 12 == 8) {
			System.out.print("Çin Zodyaðý Burcunuz : Ejderha");
		} else if (dogumYili % 12 == 9) {
			System.out.println("Çin Zodyaðý Burcunuz : Yýlan");
		} else if (dogumYili % 12 == 10) {
			System.out.println("Çin Zodyaðý Burcunuz : At");
		} else if (dogumYili % 12 == 11) {
			System.out.println("Çin Zodyaðý Burcunuz : Koyun");
		}

	}
}
