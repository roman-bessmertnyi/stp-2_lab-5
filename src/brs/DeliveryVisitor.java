package brs;

public class DeliveryVisitor implements Visitor {
	private double totalDeliveryCost;


	private final double baseCost = 50;
	
	private final double costPerMeterSq = 2;
	
	private final double costPerMeterQube = 20;
	
	private final double costPerKilo = 5;
	
	private final double insuranceFactor = 0.05;
	
	public DeliveryVisitor() {
		totalDeliveryCost = baseCost;
	}
	
	public double getTotalDeliveryCost() {
		return totalDeliveryCost;
	}
	
	@Override
	public void visit(Parcel parcel) {
		totalDeliveryCost += parcel.getPrice() * insuranceFactor;
		totalDeliveryCost += parcel.getVolume() * costPerMeterQube;
		totalDeliveryCost += parcel.getWeight() * costPerKilo;
	}

	@Override
	public void visit(Letter letter) {
		totalDeliveryCost += letter.getPrice() * insuranceFactor;
		totalDeliveryCost += letter.getWeight() * costPerKilo;
	}

	@Override
	public void visit(Pallet pallet) {
		totalDeliveryCost += pallet.getPrice() * insuranceFactor;
		totalDeliveryCost += pallet.getArea() * costPerMeterSq * pallet.getNumber();
	}

}
