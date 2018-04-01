package brs;

public interface Visitor {
	public void visit(Parcel parcel);
	public void visit(Letter letter);
	public void visit(Pallet pallet);
}