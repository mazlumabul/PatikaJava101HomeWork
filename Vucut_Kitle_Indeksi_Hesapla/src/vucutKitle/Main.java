package vucutKitle;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = scan.nextDouble();
		
		System.out.print("L�tfen kilonuzu giriniz :");
		double kilo = scan.nextDouble();
		
		System.out.println("V�cut Kitle �ndeksiniz : " + kilo * Math.pow(boy, 2));
	}
}
