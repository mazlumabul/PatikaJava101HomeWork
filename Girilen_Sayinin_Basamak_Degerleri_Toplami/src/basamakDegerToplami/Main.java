package basamakDegerToplami;

import java.util.Scanner;

//Girilen sayýnýn basamak sayýlarýnýn toplamýný hesaplayan program yazýnýz.
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
		
		System.out.print(sayi+ " sayýsýnýn basamak deðerleri toplamý :  "+ sonuc);
	} 
} 
