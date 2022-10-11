package task0006_coin.action;

import task0006_coin.bean.Coin;

public class CompareCoin {
	public void compareDiameter (Coin first, Coin second) {
		double delta = first.getDiameter() - second.getDiameter();
		if (delta > 0) {
			System.out.println("The first coin is more than the second for " + delta + " мм");
		} else if (delta == 0) {
			System.out.println("Coins have the same diameter");
		} else {
			System.out.println("The second coin is more than the first on " + -delta + " мм");
		}
	}

	public void compareWeight (Coin first, Coin second) {
		double delta = first.getWeight() - second.getWeight();
		if (delta > 0) {
			System.out.println("The first weight is more than the second for " + delta + " грамм");
		} else if (delta == 0) {
			System.out.println("Coins have the same weight");
		} else {
			System.out.println("The second weight is more than the first on " + -delta + " грамм");
		}
	}
}
