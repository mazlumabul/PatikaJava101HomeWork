package diziHarmonik;
//Dizideki sayýlarýn harmonik ortalamasýný hesaplayan programý yazýnýz.
public class Main {
	public static void main(String[] args) {
		double[] list = { 1, 2, 3, 4, 5 };
		double harmonikSeri = 0;
		
		for (int i = 0; i < list.length; i++) {

			harmonikSeri = harmonikSeri+ (1 / list[i]);
			
		} 
		System.out.println("Harmonik Seri : " + harmonikSeri);
		
		double harmonikOrtalama = (list.length) / (harmonikSeri);
		
		System.out.println("Harmonik Ortalama : " + harmonikOrtalama);
	}
} 
