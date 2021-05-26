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
		
		System.out.println("-----İşlemler-----");
		System.out.println();
		System.out.print("Toplama  için 1 \nÇıkarma için 2\nÇarpma için 3\nBölme için 4 e basınız:  ");
		
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
				System.out.println("Number2 0 dan farklı olmak zorunda");
				break;
			} else {
				System.out.println("Sonuc : " + number1 +  " * " + number2 + " = " + (result));
				break;
			}
		default :
			System.out.println("Yanlış tuşa bastınız. Lütfen yeniden deneyin");
			
		}
		
		 
	}
}
