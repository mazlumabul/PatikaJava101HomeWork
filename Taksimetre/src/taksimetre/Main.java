package taksimetre;

import java.util.Scanner;

/*
 * Java ile gidilen mesafeye (KM) g�re taksimetre tutar�n� ekrana yazd�ran program� yaz�n.

Taksimetre KM ba��na 2.20 TL tutmaktad�r.

Minimum �denecek tutar 20 TL'dir. 

20 TL alt�nda ki �cretlerde yine 20 TL al�nacakt�r.

Taksimetre a��l�� �creti 10 TL'dir.
 */
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double mesafe, kmBasinaUcret = 2.20, baslangicTutar=10, tutar;
		
		System.out.print("Gidilen mesafe ka� km : ");
		mesafe = scanner.nextDouble();
		tutar =  baslangicTutar + (kmBasinaUcret* mesafe);
		
		
		if(tutar <=20) {
			System.out.println("Tutar : 20 tl");
		} else if(tutar>20) {
			System.out.println("Tutar : " + tutar + " tl");
			
		} else {
			System.out.println("Ge�ersiz mesafe...");
		}
		
	}
}
