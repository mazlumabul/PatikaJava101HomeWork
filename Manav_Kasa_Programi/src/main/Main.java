package main;

import java.text.DecimalFormat;
/*
 * Java ile kullanýcýlarýn manavdan almýþ olduklarý ürünlerin 
 * kilogram deðerlerine göre toplam tutarýný ekrana yazdýran programý yazýn.

Meyveler ve KG Fiyatlarý

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlýcan : 5,00 TL
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double armutPrice = 2.14, elmaPrice = 3.67, domatesPrice = 1.11, 
				muzPrice = 0.95,patlicanPrice = 5.00;
		
		double armutKl = 0, elmaKl = 0,domatesKl = 0, muzKl = 0, patlicanKl = 0;
		
		System.out.print("Armut Kaç Kilo ? : " );
		armutKl = scan.nextDouble();
		
		System.out.print("Elma Kaç Kilo ? : "  );
		elmaKl = scan.nextDouble();
		
		System.out.print("Domates Kaç Kilo ? : "  );
		domatesKl = scan.nextDouble();
		
		System.out.print("Muz Kaç Kilo ?  : "  );
		muzKl = scan.nextDouble();
		
		System.out.print("Patlýcan Kaç Kilo ? : "  );
		patlicanKl = scan.nextDouble();

		double toplamTutar= 0;
		toplamTutar = (armutKl * armutPrice) + 
				 (elmaKl * elmaPrice)+
				 (domatesKl * domatesPrice)+
				 (muzKl + muzPrice )+
				 (patlicanKl *patlicanPrice );
		
		System.out.print("Toplam tutar : " + new DecimalFormat("##.##").format(toplamTutar));

		
	}
}
