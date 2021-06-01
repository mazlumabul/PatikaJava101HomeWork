package switchCase_ile;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String username, password;
		int right = 3;
		int balance = 1500; // bakiye
		int select;
		while (right > 0) {
			System.out.print("Kullanýcý adý : ");
			username = scanner.nextLine();

			System.out.print("Þifre : ");
			password = scanner.nextLine();

			if (username.equals("mazlum") && password.equals("123")) {
				System.out.println("Sisteme giriþ yaptýnýz .Hoþ geldiniz. " + username);
				do {
					System.out.println("Lütfen yapmak istediðiniz iþlemi seçiniz.");
					System.out.println(
					"1 - Para Yatýrma\n" + 
					"2 - Para Çekme\n" + 
					"3 - Bakiye Sorgula\n" + 
					"4 - Çýkýþ Yap\n");
					System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
					select = scanner.nextInt();
					
					switch(select) {
					case 1:
						System.out.print("Para Miktarý : ");
						int price = scanner.nextInt();
						balance += price;
						System.out.println("Bakiyeniz : " + balance);
						break;
					
					case 2:
						System.out.print("Para Miktarý : ");
						price = scanner.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz");
						} else {
							balance -= price;
							System.out.println("Kalan bakiyeniz : " + balance);
							
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;
					}
				
				} while (select != 4);
				System.out.println("Tekrar görüþmek üzere ...");

				break;

			} else {
				right--;
				System.out.println("Yanlýþ kullanýcý adý veya þifre. Tekrar deneyiniz. Kalan hak : " + right);
				if (right == 0) {
					System.out.println("Giriþ hakkýnýz bitti. Program sonlanýyor");
				}
			}

		}

	}
}
