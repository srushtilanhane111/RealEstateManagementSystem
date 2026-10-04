package real_estate;

public class House extends Property {

	private int rooms;
	private boolean parking;

	public House(int propertyId, String location, double price, int rooms, boolean parking) {

		super(propertyId, location, price);

		this.rooms = rooms;
		this.parking = parking;
	}

	@Override
	public void displayDetails() {

		System.out.println("----- HOUSE DETAILS -----");

		super.displayDetails();

		System.out.println("Rooms       : " + rooms);
		System.out.println("Parking     : " + parking);
	}
}
