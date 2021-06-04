package asalMi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi giriniz : ");
		int sayi = scanner.nextInt();
		
		System.out.println(asalMi(sayi,2));
		
	}
	public static boolean asalMi(int sayi, int bolen) {
		if(sayi==bolen || sayi ==1) {
			System.out.println(sayi+ " sayýsý ASALDIR! ");
			return true;
		}
			
		if(sayi % bolen ==0)
		{
			System.out.println(sayi+ " sayýsý ASAL deðildir ");
			return false;
		}
	
		return asalMi(sayi, bolen+1);
	}
}
