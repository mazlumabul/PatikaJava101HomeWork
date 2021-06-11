package main;
//Java dilinde, dizideki elemanlarýn kaç kez tekrar edildiðini yani frekanslarýný bulan programý yazýnýz.
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		//Scanner scanner = new Scanner(System.in);
		//System.out.print("Dizi Boyutu : ");
		
		/*
		 * int diziBoyut = scanner.nextInt(); int[] list = new int[diziBoyut];
		 * 
		 * for (int i = 0; i < list.length; i++) { System.out.print((i + 1) +
		 * " eleman : "); list[i] = scanner.nextInt(); }
		 */
		int sayac = 0;
		int[] list = { 1, 2, 3, 2, 8, 7, 8, 9, 9 };
		Arrays.sort(list);
		for (int j = 0; j < list.length; j++) {
			for (int k = 0; k < list.length; k++) {
				if (list[j] == list[k]) {
					sayac++;
					
				}
			}
			System.out.println(list[j] + " sayýsý " + sayac + " kere tekrar edilidi");
			sayac = 0;

		}

	}

}
