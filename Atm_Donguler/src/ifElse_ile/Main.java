package ifElse_ile;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String username, password;
		int right = 3;
		int balance = 1500; // bakiye
		int select;
		while (right > 0) {
			System.out.print("Kullan�c� ad� : ");
			username = scanner.nextLine();

			System.out.print("�ifre : ");
			password = scanner.nextLine();

			if (username.equals("mazlum") && password.equals("123")) {
				System.out.println("Sisteme giri� yapt�n�z .Ho� geldiniz. " + username);
				do {
					System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz.");
					System.out.println(
					"1 - Para Yat�rma\n" + 
					"2 - Para �ekme\n" + 
					"3 - Bakiye Sorgula\n" + 
					"4 - ��k�� Yap\n");
					System.out.print("L�tfen yapmak istedi�iniz i�lemi se�iniz : ");
					select = scanner.nextInt();
				
					if (select == 1) {
						System.out.print("Para Miktar� : ");
						int price = scanner.nextInt();
						balance += price;
						System.out.println("Bakiyeniz : " + balance);
					} else if (select == 2) {
						System.out.print("Para Miktar� : ");
						int price = scanner.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz");
						} else {
							balance -= price;
							System.out.println("Kalan bakiyeniz : " + balance);
						}
					} else if (select == 3) {
						System.out.println("Bakiyeniz : " + balance);
					}
				} while (select != 4);
				System.out.println("Tekrar g�r��mek �zere ...");

				break;

			} else {
				right--;
				System.out.println("Yanl�� kullan�c� ad� veya �ifre. Tekrar deneyiniz. Kalan hak : " + right);
				if (right == 0) {
					System.out.println("Giri� hakk�n�z bitti. Program sonlan�yor");
				}
			}

		}

	}
}
