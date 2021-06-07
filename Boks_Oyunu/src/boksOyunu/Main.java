package boksOyunu;



public class Main {
	public static void main(String[] args) {
		Fighter fighter1 = new Fighter("Mazlum", 10, 120, 100,30);
		Fighter fighter2 = new Fighter("Alican", 20, 85, 85,40);
	
		Match match = new Match(fighter1, fighter2, 85, 100);
		match.startMatch();
		
		 

	}
}
 