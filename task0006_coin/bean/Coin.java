package task0006_coin.bean;

public class Coin {
	private double diameter;
	private double weight;

	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double value) {
		if (value>0) {
			diameter = value;
			System.out.println("Positive diameter: " + diameter + " мм");
		} else {
			System.out.println("Negative diameter");
		}
	}
	
	public double getWeight() {
		return weight;
	}
	public void setWeight(double value) {
		if (value>0) {
			weight = value;
			System.out.println("Positive weight: " + weight + " грамм");
		} else {
			System.out.println("Negative weight");
		}
	}
}

