package usluSayi;

import java.util.Scanner;

/*
Java ile kullan�c�n�n girdi�i de�erler ile �sl� say� hesaplayan program� 
"For D�ng�s�" kullanarak yap�n�z.
*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int total=1;
		System.out.print("�ss� al�nacak sayi : ");
		int n = scanner.nextInt();
		
		System.out.print("�s : ");
		int k = scanner.nextInt();
		
		for(int i = 1;i<=k;i++) {
			total *= n;
		}
		System.out.println("Cevap : " + total);
	}
}
