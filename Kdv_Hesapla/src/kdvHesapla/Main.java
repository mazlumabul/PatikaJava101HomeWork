package kdvHesapla;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double fiyat, kdvOran, kdvTutar;

		System.out.print("Fiyat� giriniz : ");
		fiyat = scanner.nextDouble();

		if (fiyat > 0 && fiyat <= 1000) {
			kdvOran = 0.18;
			kdvTutar = fiyat * kdvOran;
			double kdvliFiyat = fiyat + kdvTutar;

			System.out.println(
					"KDV'siz Oran : " + fiyat + "\nKDV'li Fiyat : " + kdvliFiyat + "\nKDV Tutar� : " + kdvOran);
		} else if(fiyat>1000) {
			kdvOran = 0.8;
			kdvTutar = fiyat * kdvOran;
			double kdvliFiyat = fiyat + kdvTutar;
			
			System.out.println("KDV'siz Oran : " + fiyat+
					"\nKDV'li Fiyat : " +kdvliFiyat+
					"\nKDV Tutar� : " + kdvOran);
		} else {
			System.out.println("Tan�ms�z fiyat giri�i..");
		}

	}
}
