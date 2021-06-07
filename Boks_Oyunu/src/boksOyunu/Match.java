package boksOyunu;

import java.util.Random;

public class Match {
	Fighter fighter1;
	Fighter fighter2;

	int minWeight;
	int maxWeight;

	public Match(Fighter fighter1, Fighter fighter2, int minWeight, int maxWeight) {
		this.fighter1 = fighter1;
		this.fighter2 = fighter2;
		this.minWeight = minWeight;
		this.maxWeight = maxWeight;
	}

	public void startMatch() {
		if (isCheck()) {
			Random random = new Random();
			int whoStart = random.nextInt(2);
			while (this.fighter1.health > 0 && this.fighter2.health > 0) {
				
				System.out.println("====YEN� ROUND=====");
				
				if(whoStart==0) {
					this.fighter2.health = this.fighter1.hit(this.fighter2);// kim ba�layacak

					if (isWin()) {
						break;
					}

					this.fighter1.health = this.fighter2.hit(this.fighter1);

					if (isWin()) {
						break;
					}
				} else {
					this.fighter1.health = this.fighter2.hit(this.fighter1);// kim ba�layacak

					if (isWin()) {
						break;
					}

					this.fighter2.health = this.fighter1.hit(this.fighter2);

					if (isWin()) {
						break;
					}
				}
				
				System.out.println(this.fighter1.name + " Sa�l�k : " + this.fighter1.health);
				System.out.println(this.fighter2.name + " Sa�l�k : " + this.fighter2.health);

			}
		} else {
			System.out.println("Sporcular�n sikletleri uyu�muyor");
		}
	}

	public boolean isCheck() {
		return (this.fighter1.weight >= this.minWeight && this.fighter1.weight <= this.maxWeight)
				&& (this.fighter2.weight >= this.minWeight && this.fighter2.weight <= this.maxWeight);
	}

	public boolean isWin() {
		if (this.fighter1.health == 0) {
			System.out.println(this.fighter2.name + " kazand� !");
			return true;
		}
		if (this.fighter2.health == 0) {
			System.out.println(this.fighter1.name + " kazand� !");
			return true;
		}
		return false;

	}
}
