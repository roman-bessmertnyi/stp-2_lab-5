package brs;

public class Parcel implements Visitable {
	private double price;
	
	private double weight;
	
	private double volume;
	
	
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


	public double getVolume() {
		return volume;
	}


	public void setVolume(double volume) {
		this.volume = volume;
	}


	@Override
	public String toString() {
		return "Parcel [price=" + price + ", weight=" + weight + ", volume=" + volume + "]";
	}

}
