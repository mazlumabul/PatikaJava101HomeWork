package daireAlanHesapla;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double yariCap, pi = 3.14;
		int alfa;
		System.out.print("Yarýçap  : ");
		yariCap = scan.nextDouble();

		System.out.print("Alfa : ");
		alfa = scan.nextInt();

		System.out.println("Alan : " + (pi * (Math.pow(yariCap, 2) * alfa) / 360));
	}
}
