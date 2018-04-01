package brs;

public class Main {

	public static void main(String[] args) {
		DeliveryOrder mockOrder = new DeliveryOrder();
		
		Parcel mockParcel = new Parcel();
		mockParcel.setPrice(1500);
		mockParcel.setVolume(0.25);
		mockParcel.setWeight(10);
		
		Letter mockLetter1 = new Letter();
		mockLetter1.setPrice(100);
		mockLetter1.setWeight(0.1);
		
		Letter mockLetter2 = new Letter();
		mockLetter2.setPrice(150);
		mockLetter2.setWeight(1);
		
		Pallet mockPallet = new Pallet();
		mockPallet.setArea(2);
		mockPallet.setNumber(10);
		mockPallet.setPrice(600);
		
		mockOrder.getItems().add(mockParcel);
		mockOrder.getItems().add(mockLetter1);
		mockOrder.getItems().add(mockLetter2);
		mockOrder.getItems().add(mockPallet);
		
		System.out.println(mockOrder);
		System.out.println(mockOrder.calculateDelivery());
	}
}
