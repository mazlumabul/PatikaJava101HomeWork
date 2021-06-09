package diziOrtlamaBul;

public class Main {
	public static void main(String[] args) {
		int[] list = { 1, 2, 3, 4, 5, 6};
		double avarage;
		double sum = 0;
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
		avarage = sum / list.length;
		System.out.println(avarage);

	}
}
