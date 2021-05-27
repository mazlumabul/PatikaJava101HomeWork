package ucak;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double mesafe = 0, yas;
		int yolculukTipi;

		System.out.print("Mesafeyi km t�r�nden giriniz :");
		mesafe = scanner.nextDouble();
		
		double normalTutar = mesafe * 0.10;

		System.out.print("Ya��n�z� giriniz :");
		yas = scanner.nextDouble();

		System.out.print("Yolculuk tipini giriniz (1 => Tek Y�n , 2 => Gidi� D�n�� ):");
		yolculukTipi = scanner.nextInt();

		if (yolculukTipi == 1) {
			if (yas <= 12) {
				double yasIndirimi = normalTutar * 0.5;
				double IndirimliTutar = normalTutar - yasIndirimi;
				System.out.println("Normal Tutar : " + normalTutar);
				System.out.println("�ndirimli Toplam  Tutar : " + IndirimliTutar);

			} else if (yas > 12 && yas <= 24) {
				double yasIndirimi = normalTutar * 0.1;
				double IndirimliTutar = normalTutar - yasIndirimi;
				System.out.println("Normal Tutar : " + normalTutar);
				System.out.println("�ndirimli Toplam  Tutar : " + IndirimliTutar);
			} else if (yas > 24 && yas < 65) {
				System.out.println("Toplam Tutar : " + normalTutar);

			} else {
				double yasIndirimi = normalTutar * 0.3;
				double indirimliTutar = normalTutar - yasIndirimi;
				System.out.println("Normal Tutar : " + normalTutar);
				System.out.println("�ndirimli Toplam  Tutar : " + indirimliTutar);
			}
		} else if (yolculukTipi == 2) {

			if (yas <= 12) {
				double yasIndirimi = normalTutar * 0.5;
				double indirimliTutar = normalTutar - yasIndirimi;
				double gidisDonusBileti = indirimliTutar * 0.20;
				double toplamTutar = (indirimliTutar - gidisDonusBileti) * 2;
				System.out.println("�ndirimli Toplam  Tutar : " +toplamTutar);

			} else if (yas > 12 && yas <= 24) {
 
				double yasIndirimi = normalTutar * 0.1;
				double indirimliTutar = normalTutar - yasIndirimi;
				double gidisDonusBileti = indirimliTutar * 0.20;
				double toplamTutar = (indirimliTutar - gidisDonusBileti) * 2;
				System.out.println("�ndirimli Toplam  Tutar : " +toplamTutar);

			} else if (yas > 24 && yas < 65) {
				double gidisDonusBileti = normalTutar * 0.20;
				double toplamTutar = normalTutar - gidisDonusBileti;
				System.out.println("�ndirimli Toplam  Tutar : " +toplamTutar);
				
			} else {
				double yasIndirimi = normalTutar * 0.3;
				double indirimliTutar = normalTutar - yasIndirimi;
				double gidisDonusBileti = indirimliTutar * 0.20;
				double toplamTutar = (indirimliTutar - gidisDonusBileti) * 2;
				System.out.println("�ndirimli Toplam  Tutar : " +toplamTutar);
			}
		} else {
			System.out.println("Hatal� Veri Girdiniz !");
		}

	}
}
