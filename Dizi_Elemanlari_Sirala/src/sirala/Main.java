package sirala;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Dizi Boyutu : ");
		int diziBoyutu = scanner.nextInt();

		int[] list = new int[diziBoyutu];

		for (int i = 0; i < list.length; i++) {

			System.out.print((i + 1) + ". eleman : ");
			list[i] = scanner.nextInt();
		}

		Arrays.sort(list);
		for(int i : list) {
			System.out.println(i);
		}
	}
}
