package sinifGecme;
/*
Java ko�ullu ifadeler ile kullan�c�n�n not durumuna g�re s�n�f� ge�me durumunu hesaplayan program yap�n.

Dersler : Matematik, Fizik, T�rk�e, Kimya, M�zik

Ge�me Notu : 55

E�er girilen ders notlar� 0 veya 100 aras�nda de�il ise ortalamaya kat�lmas�n.
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

		System.out.print("T�rk�e Notunuz : ");
		turkce = scanner.nextInt();

		System.out.print("Kimya Notunuz : ");
		kimya = scanner.nextInt();

		System.out.print("M�zik Notunuz : ");
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
			
			System.out.println("Ortalaman�z : " + avarage);
			System.out.println("Tebrikler ge�tiniz...");
		} else {
			System.out.println("Ortalaman�z : " + avarage);
			System.out.println("Ge�emediniz...");
		}

	}
}