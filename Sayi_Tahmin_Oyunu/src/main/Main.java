package main;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int number = random.nextInt(100);

		int right = 0;
		int selected;
		int[] wrongNumbers = new int[5];
		boolean isWin = false;
		boolean isWrong = false;
		System.out.println(number);

		while (right < 5) {
			System.out.print("L�tfen tahmininizi girin : ");
			selected = scanner.nextInt();
			if (selected < 0 || selected > 99) {
				System.out.println("1-100 aras�nda sayi giriniz");
				if(isWrong) {
					right++;
					System.out.println("�ok fazla hatal� giri� yapt�n�z. Kalan hak :" +(5-right));
					
				}else {
					isWrong = true;
					System.out.println("Bir dahaki hatal� giri�inizde hakk�n�zdan d���lecektir");
				}
				continue;
			}
			if (selected == number) {
				System.out.println("Tebrikler, do�ru tahmin! " + number);
				isWin = true;
				break;
			} else {
				System.out.println("Hatal� bir say� girdiniz ");
				if (selected > number) {
					System.out.println(selected + " say�s�, gizli say�dan b�y�kt�r");
				} else {
					System.out.println(selected + " say�s�, gizli say�dan k���kt�r");
				}
				wrongNumbers[right] = selected;
				right++;
				System.out.println("Kalan hakk�n�z : " + (5 - right));
			}
			
		}
		if (!isWin) {
			System.out.println("Kaybettiniz ");
			System.out.println("Tahminleriniz :" + Arrays.toString(wrongNumbers));
		}
	}
}
