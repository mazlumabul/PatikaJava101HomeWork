package hipotenusBul;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,c, alan, cevre;
		
		System.out.print("A kenarý : ");
		a = scanner.nextDouble();
		
		System.out.print("B kenarý : ");
		b = scanner.nextDouble();
		
		System.out.print("C kenarý : ");
		c = scanner.nextDouble();
		
		cevre = (a+b+c)/2;
		 
		System.out.println("Çevre : " + cevre);
		
		alan = Math.sqrt(cevre * (cevre-a) * (cevre-b) * (cevre-c));
		System.out.println("Alan : " + alan);
	}
}
