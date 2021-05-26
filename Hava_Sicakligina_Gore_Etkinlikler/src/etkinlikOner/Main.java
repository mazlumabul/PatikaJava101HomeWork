package etkinlikOner;

import java.util.Scanner;

/*

S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner.
S�cakl�k 5 ve 15 aras�nda ise "Sinema" etkinli�ini �ner.
S�cakl�k 10 ve 25 aras�nda ise "Piknik" etkinli�ini �ner.
S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.

*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int heat;
		System.out.print("S�cakl�k ka� derece? : ");
		
		heat = scanner.nextInt();
		
		if(heat <5) {
			System.out.println("Kayak yapabilirsiniz");
		} else if(heat >=5 && heat <=10) {
			System.out.println("Sinemaya gidebilirsiniz");
		} else if(heat >10 && heat <15) {
			System.out.println("Sinemaya gidebilir veya Piknik yapabilirsiniz");
		} else if(heat >=15 && heat <25) {
			System.out.println("Pikni�e gidebilirsiniz");
		} else {
			System.out.println("Y�zmeye gidebilirsiniz");
		}
	}
}	
