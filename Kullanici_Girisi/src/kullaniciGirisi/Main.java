package kullaniciGirisi;

import java.util.Scanner;

/*
Kullan�c� Giri�i
Java ko�ullu ifadeler ile kullan�c� ad� ve �ifreyi kontrol eden program yap�m�.
    
�dev
E�er �ifre ad� yanl�� ise kullan�c�ya �ifresini s�f�rlay�p s�f�rlamayaca��n� sorun, 
e�er kullan�c� s�f�rlamak isterse yeni girdi�i �ifrenin hatal� girdi�i
ve unuttu�u �ifre ile ayn� olmamas� gerekti�ini kontrol edip , 
�ifreler ayn� ise ekrana
 "�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz." 
 sorun yoksa "�ifre
olu�turuldu" yazan program� yaz�n�z.
*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String username = "user", password = "12345", NewPassword = null;
		String select = null;

		System.out.print("Kullan�c� Ad�n�z : ");
		username = scanner.nextLine();

		System.out.print("�ifreniz : ");
		NewPassword = scanner.nextLine();

		if (password.equals(NewPassword)) {
			System.out.println("Ho�geldiniz");
		} else {
			System.out.println("�ifre  yanl��. �ifrenizi s�f�rlamak isterseniz e ye bas�n. ");
			select = scanner.nextLine();

			if (select.equals("e")) {
				System.out.print("Yeni �ifreniz : ");
				password = scanner.nextLine();

				if (password.equals(password)) {
					System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz");
				} else {
					System.out.println("�ifre olu�turuldu");
				}
			} 
		}

	}
}
