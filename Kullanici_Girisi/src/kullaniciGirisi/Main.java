package kullaniciGirisi;

import java.util.Scanner;

/*
Kullanýcý Giriþi
Java koþullu ifadeler ile kullanýcý adý ve þifreyi kontrol eden program yapýmý.
    
Ödev
Eðer þifre adý yanlýþ ise kullanýcýya þifresini sýfýrlayýp sýfýrlamayacaðýný sorun, 
eðer kullanýcý sýfýrlamak isterse yeni girdiði þifrenin hatalý girdiði
ve unuttuðu þifre ile ayný olmamasý gerektiðini kontrol edip , 
þifreler ayný ise ekrana
 "Þifre oluþturulamadý, lütfen baþka þifre giriniz." 
 sorun yoksa "Þifre
oluþturuldu" yazan programý yazýnýz.
*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = "user", password = "12345", NewPassword = null;
		String select = null;

		System.out.print("Kullanýcý Adýnýz : ");
		username = scanner.nextLine();

		System.out.print("Þifreniz : ");
		NewPassword = scanner.nextLine();

		if (password.equals(NewPassword)) {
			System.out.println("Hoþgeldiniz");
		} else {
			System.out.println("Þifre  yanlýþ. Þifrenizi sýfýrlamak isterseniz e ye basýn. ");
			select = scanner.nextLine();

			if (select.equals("e")) {
				System.out.print("Yeni þifreniz : ");
				password = scanner.nextLine();

				if (password.equals(password)) {
					System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz");
				} else {
					System.out.println("Þifre oluþturuldu");
				}
			} 
		}

	}
}
