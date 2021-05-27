package artikYil;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Yýl giriniz : ");
		int year = scanner.nextInt();
		
	    // 400 bölümünden kalan sýfýr veya
		// 4 blünecek ve 100 e tam bölünmeyecek
		if((year % 400 ==0) || ((year %4==0) && (year %100 != 0))) {
			System.out.print(year + " bir artýk yýldýr ! ");
		} else {
			System.out.print(year + " bir artýk yýl  deðildir ! ");
		}
	}
}
