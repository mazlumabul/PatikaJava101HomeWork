package taksimetre;

import java.util.Scanner;

/*
 * Java ile gidilen mesafeye (KM) göre taksimetre tutarýný ekrana yazdýran programý yazýn.

Taksimetre KM baþýna 2.20 TL tutmaktadýr.

Minimum ödenecek tutar 20 TL'dir. 

20 TL altýnda ki ücretlerde yine 20 TL alýnacaktýr.

Taksimetre açýlýþ ücreti 10 TL'dir.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double mesafe, kmBasinaUcret = 2.20, baslangicTutar=10, tutar;
		
		System.out.print("Gidilen mesafe kaç km : ");
		mesafe = scanner.nextDouble();
		tutar =  baslangicTutar + (kmBasinaUcret* mesafe);
		
		
		if(tutar <=20) {
			System.out.println("Tutar : 20 tl");
		} else if(tutar>20) {
			System.out.println("Tutar : " + tutar + " tl");
			
		} else {
			System.out.println("Geçersiz mesafe...");
		}
		
	}
}
