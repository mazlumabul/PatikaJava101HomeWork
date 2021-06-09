package sinifGecme;
/*
Java koþullu ifadeler ile kullanýcýnýn not durumuna göre sýnýfý geçme durumunu hesaplayan program yapýn.

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Eðer girilen ders notlarý 0 veya 100 arasýnda deðil ise ortalamaya katýlmasýn.
*/
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int mat, fizik, turkce, kimya, muzik;
		double avarage = 0, total=0; 
 
		System.out.print("Matematik Notunuz : ");
		mat = scanner.nextInt();

		System.out.print("Fizik Notunuz : ");
		fizik = scanner.nextInt();

		System.out.print("Türkçe Notunuz : ");
		turkce = scanner.nextInt();

		System.out.print("Kimya Notunuz : ");
		kimya = scanner.nextInt();

		System.out.print("Müzik Notunuz : ");
		muzik = scanner.nextInt();
		
		
		if ((mat >= 0 && mat <= 100)) {
			total = total + mat;
		}
		if ((fizik >= 0 && fizik <= 100)) {
			total = total + fizik;
		}
		if ((turkce >= 0 && turkce <= 100)) {
			total = total + turkce;
		}
		if ((kimya >= 0 && kimya <= 100)) {
			total = total + kimya;
		}
		if ((muzik >= 0 && muzik <= 100)) {
			total = total + muzik;
		}
		
		avarage = total/5;
		if(avarage >= 55) {
			
			System.out.println("Ortalamanýz : " + avarage);
			System.out.println("Tebrikler geçtiniz...");
		} else {
			System.out.println("Ortalamanýz : " + avarage);
			System.out.println("Geçemediniz...");
		}

	}
}