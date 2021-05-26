package etkinlikOner;

import java.util.Scanner;

/*

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

*/
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int heat;
		System.out.print("Sıcaklık kaç derece? : ");
		
		heat = scanner.nextInt();
		
		if(heat <5) {
			System.out.println("Kayak yapabilirsiniz");
		} else if(heat >=5 && heat <=10) {
			System.out.println("Sinemaya gidebilirsiniz");
		} else if(heat >10 && heat <15) {
			System.out.println("Sinemaya gidebilir veya Piknik yapabilirsiniz");
		} else if(heat >=15 && heat <25) {
			System.out.println("Pikniğe gidebilirsiniz");
		} else {
			System.out.println("Yüzmeye gidebilirsiniz");
		}
	}
}	
