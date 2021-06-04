package palindrom;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Sayi gir : ");
		int number = scanner.nextInt();
		
		isPalindrom(number);
		
		
	}
	public static boolean isPalindrom(int number) {
		int temp = number, reverseNumber=0, lastNumber;
		while(temp !=0) {
			lastNumber = temp %10;
			reverseNumber = (reverseNumber*10) + lastNumber;
			temp /= 10;
		}
		if(number == reverseNumber) {
			System.out.println(number + " sayısı palindromdur");
			return true;
		} else {
			System.out.println(number + " sayısı palindrom değildir");
			return false;
		}
			
		
	}
}
