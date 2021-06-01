package mukemmelSayi;
/*
Klavyeden girilen bir sayýnýn mükemmel sayý olup/olmadýðýný 
bulan ve sayý mükemmel sayý ise ekrana “mükemmel sayýdýr.” deðilse “mükemmel sayý deðildir.” 
ifadelerini ekrana yazan programý Java dilinde yazýnýz.
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
			System.out.println(sayi + " mükemmel bir sayýdýr.");
		} else {
			System.out.println(sayi + " mükemmel bir sayý deðildir.");
		}
	}
}
 