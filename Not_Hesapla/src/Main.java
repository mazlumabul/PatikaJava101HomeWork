import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Matematik Notu : ");
		int matematikNot = scanner.nextInt();

		System.out.print("Fizik Notu : ");
		int fizikkNot = scanner.nextInt();

		System.out.print("Kimya Notu : ");
		int kimyaNot = scanner.nextInt();

		System.out.print("T�rk�e Notu : ");
		int turkceNot = scanner.nextInt();

		System.out.print("Tarih Notu : ");
		int tarihkNot = scanner.nextInt();

		System.out.print("M�zik Notu : ");
		int muzikNot = scanner.nextInt();

		int ortalama = (matematikNot + fizikkNot + kimyaNot + turkceNot + tarihkNot + muzikNot) / 6;

		String durum = ortalama <= 60 ? (String) " Kald�" : (String) "Ge�ti";
		System.out.println("Durum : " + durum);
	}

}
