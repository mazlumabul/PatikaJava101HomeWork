package artikYil;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Y�l giriniz : ");
		int year = scanner.nextInt();
		
	    // 400 b�l�m�nden kalan s�f�r veya
		// 4 bl�necek ve 100 e tam b�l�nmeyecek
		if((year % 400 ==0) || ((year %4==0) && (year %100 != 0))) {
			System.out.print(year + " bir art�k y�ld�r ! ");
		} else {
			System.out.print(year + " bir art�k y�l  de�ildir ! ");
		}
	}
}
