package hesapMakinesi_Vol1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int select;
		String menu = "1 - Toplama ��lemi\n" 
				+ "2 - ��karma ��lemi\n" 
			    + "3 - �arpma ��lemi\n" 
				+ "4 - B�lme ��lemi\n"
				+ "5 - �sl� Say� Hesaplama ��lemi\n" 
				+ "6 - Mod Alma ��lemi\n" 
				+ "7 - Dikt�rtgen Alan ve �evre Hesaplama ��lemi\n" 
				+ "0 - ��k�� Yap\n";

		while (true) {

			System.out.println(menu);
			System.out.print("Bir i�lem se�iniz : ");
			select = scanner.nextInt();
			if(select ==0) {
				System.out.println("Programdan ��k�� yap�ld�");
				break;
			}
			System.out.print("Sayi 1 : ");
			int number1 = scanner.nextInt();

			System.out.print("Sayi 2 : ");
			int number2 = scanner.nextInt();

			switch (select) {
			case 1:
				sum(number1, number2);
				break;
			case 2:
				minus(number1,number2);
				break;
			case 3:
				times(number1,number2);
				break;
			case 4:
				divided(number1,number2);	
				break;
			case 5:
				System.out.println("�s Hesab� : " + power(number1,number2));;	
				break;
			case 6:
				System.out.println("Mod Hesab� : " + mod(number1,number2));;	
				break;
			case 7:
				calc(number1, number2);					
				break;
			default:
				System.out.println("Ge�ersiz i�lem. Program sonlan�yor");

			}
			
		}

	}

	public static int sum(int a, int b) {
		int result = a + b;
		System.out.println("Toplama Sonucu = " + result);
		return result;
	}
	public static int minus(int a, int b ) {
		int result = a - b;
		System.out.println("��karma Sonucu = " + result);
		return result;
	}
	public static int times(int a, int b ) {
		int result = a * b;
		System.out.println("�arpma Sonucu = " + result);
		return result;
	}
	public static int divided(int a, int b ) {
		if(b == 0) {
			System.out.println(b + " s�f�rdan farkl� olmak zorunda");		
		}
		int result = a / b;
		System.out.println("B�lme Sonucu = " + result);
		return result;
	}
	public static int power(int a, int b) {
		int result=1;
		for(int i = 1; i<=b; i++) {
			result *=b;
		}
		return result;
	}
	public static int mod(int a, int b) {
		return a%b;
	}
	public static void calc(int a, int b) {
		System.out.println("�evresi : " + (2 *(a+b)));
		System.out.println("Alan"+ (a*b));
	}

}
