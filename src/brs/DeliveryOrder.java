package brs;

import java.util.ArrayList;

public class DeliveryOrder {
	private ArrayList<Visitable> items = new ArrayList<Visitable>();
	
	public double calculateDelivery() {
		DeliveryVisitor visitor = new DeliveryVisitor();
		for(Visitable item: items) {
			item.accept(visitor);
		}
		
		double price = visitor.getTotalDeliveryCost();
		
		return price;
	}
	
	public ArrayList<Visitable> getItems() {
		return items;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DeliveryOrder [items=");
		builder.append(items);
		builder.append("]");
		return builder.toString();
	}
}