package basamakDegerToplami;

import java.util.Scanner;

//Girilen say�n�n basamak say�lar�n�n toplam�n� hesaplayan program yaz�n�z.
public class Main {
	public static void main(String[] args) {
		int basDeger, sonuc = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Sayi gir : ");
		int sayi = scanner.nextInt();
		int geciciSayi;
		geciciSayi = sayi;
		while(geciciSayi != 0) {
			basDeger = sayi%10;
			sonuc = sonuc + basDeger;
			geciciSayi /=10;
		}
		
		System.out.print(sayi+ " say�s�n�n basamak de�erleri toplam� :  "+ sonuc);
	} 
} 
