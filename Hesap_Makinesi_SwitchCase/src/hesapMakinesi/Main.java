package hesapMakinesi;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double number1, number2,result;
		int select;
		
		System.out.print("Number 1 : ");
		number1 = scanner.nextDouble();
		
		System.out.print("Number 2 : ");
		number2 = scanner.nextDouble();
		
		System.out.println();
		
		System.out.println("-----��lemler-----");
		System.out.println();
		System.out.print("Toplama  i�in 1 \n��karma i�in 2\n�arpma i�in 3\nB�lme i�in 4 e bas�n�z:  ");
		
		select = scanner.nextInt();
		
		switch(select) {
		case 1:
			result = number1+number2;
			System.out.println("Sonuc : " + number1 +  " + " + number2 + " = " + (result));
			break;
		case 2:
			result = number1-number2;
			System.out.println("Sonuc : " + number1 +  " - " + number2 + " = " + (result));
			break;
		case 3:
			result = number1*number2;
			System.out.println("Sonuc : " + number1 +  " * " + number2 + " = " + (result));
			break;
		case 4:
			result = number1 / number2;
			if(number2 ==0) {
				System.out.println("Number2 0 dan farkl� olmak zorunda");
				break;
			} else {
				System.out.println("Sonuc : " + number1 +  " * " + number2 + " = " + (result));
				break;
			}
		default :
			System.out.println("Yanl�� tu�a bast�n�z. L�tfen yeniden deneyin");
			
		}
		
		 
	}
}
