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
			System.out.print("Lütfen tahmininizi girin : ");
			selected = scanner.nextInt();
			if (selected < 0 || selected > 99) {
				System.out.println("1-100 arasýnda sayi giriniz");
				if(isWrong) {
					right++;
					System.out.println("Çok fazla hatalý giriþ yaptýnýz. Kalan hak :" +(5-right));
					
				}else {
					isWrong = true;
					System.out.println("Bir dahaki hatalý giriþinizde hakkýnýzdan düþülecektir");
				}
				continue;
			}
			if (selected == number) {
				System.out.println("Tebrikler, doðru tahmin! " + number);
				isWin = true;
				break;
			} else {
				System.out.println("Hatalý bir sayý girdiniz ");
				if (selected > number) {
					System.out.println(selected + " sayýsý, gizli sayýdan büyüktür");
				} else {
					System.out.println(selected + " sayýsý, gizli sayýdan küçüktür");
				}
				wrongNumbers[right] = selected;
				right++;
				System.out.println("Kalan hakkýnýz : " + (5 - right));
			}
			
		}
		if (!isWin) {
			System.out.println("Kaybettiniz ");
			System.out.println("Tahminleriniz :" + Arrays.toString(wrongNumbers));
		}
	}
}
