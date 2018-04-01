package brs;

public class Letter implements Visitable {
	private double price;
	
	private double weight;
	
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Letter [price=" + price + ", weight=" + weight + "]";
	}

}
