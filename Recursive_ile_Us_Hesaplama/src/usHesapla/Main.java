package usHesapla;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Taban de�eri : ");
		int taban = scanner.nextInt();
		
		System.out.print("�s de�eri : ");
		int us = scanner.nextInt();
		
		int sonuc = usHesapla(taban, us);
		System.out.println("Sonu� : " + sonuc);
	}
	public static int usHesapla(int taban, int us) {
		if(us ==1) {
			return taban;
		}
		return taban *(usHesapla(taban, us-1));
		
	}
}
