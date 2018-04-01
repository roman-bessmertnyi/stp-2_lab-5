package brs;

public class Pallet implements Visitable {
	private double area;
	
	private int number;
	
	private double price;
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}


	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Pallet [area=" + area + ", number=" + number + ", price=" + price + "]";
	}

}
