package task0006_coin.main;

import task0006_coin.action.CompareCoin;
import task0006_coin.bean.Coin;

public class CoinMain {
	public static void main(String[] args) {
	Coin coin1 = new Coin();
	coin1.setDiameter(22); // correct
	coin1.setWeight(150);
	Coin coin2 = new Coin();
	coin2.setDiameter(15);
	coin2.setWeight(170);
	CompareCoin compare = new CompareCoin();
	compare.compareDiameter(coin1, coin2);
	compare.compareWeight(coin1, coin2);
	}	
}
