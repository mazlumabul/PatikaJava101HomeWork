package mukemmelSayi;
/*
Klavyeden girilen bir say�n�n m�kemmel say� olup/olmad���n� 
bulan ve say� m�kemmel say� ise ekrana �m�kemmel say�d�r.� de�ilse �m�kemmel say� de�ildir.� 
ifadelerini ekrana yazan program� Java dilinde yaz�n�z.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir Sayi giriniz : ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		int i=1;
		
		while(i<sayi) {
			if(sayi % i==0) {
				toplam +=i;
			}
			i++;
		} 
		if(sayi == toplam) {
			System.out.println(sayi + " m�kemmel bir say�d�r.");
		} else {
			System.out.println(sayi + " m�kemmel bir say� de�ildir.");
		}
	}
}
 