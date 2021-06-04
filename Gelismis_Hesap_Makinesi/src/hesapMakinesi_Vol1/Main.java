package hesapMakinesi_Vol1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int select;
		String menu = "1 - Toplama Ýþlemi\n" 
				+ "2 - Çýkarma Ýþlemi\n" 
			    + "3 - Çarpma Ýþlemi\n" 
				+ "4 - Bölme Ýþlemi\n"
				+ "5 - Üslü Sayý Hesaplama Ýþlemi\n" 
				+ "6 - Mod Alma Ýþlemi\n" 
				+ "7 - Diktörtgen Alan ve Çevre Hesaplama Ýþlemi\n" 
				+ "0 - Çýkýþ Yap\n";

		while (true) {

			System.out.println(menu);
			System.out.print("Bir iþlem seçiniz : ");
			select = scanner.nextInt();
			if(select ==0) {
				System.out.println("Programdan çýkýþ yapýldý");
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
				System.out.println("Üs Hesabý : " + power(number1,number2));;	
				break;
			case 6:
				System.out.println("Mod Hesabý : " + mod(number1,number2));;	
				break;
			case 7:
				calc(number1, number2);					
				break;
			default:
				System.out.println("Geçersiz iþlem. Program sonlanýyor");

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
		System.out.println("Çýkarma Sonucu = " + result);
		return result;
	}
	public static int times(int a, int b ) {
		int result = a * b;
		System.out.println("Çarpma Sonucu = " + result);
		return result;
	}
	public static int divided(int a, int b ) {
		if(b == 0) {
			System.out.println(b + " sýfýrdan farklý olmak zorunda");		
		}
		int result = a / b;
		System.out.println("Bölme Sonucu = " + result);
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
		System.out.println("Çevresi : " + (2 *(a+b)));
		System.out.println("Alan"+ (a*b));
	}

}
