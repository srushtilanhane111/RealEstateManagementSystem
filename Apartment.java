package real_estate;

public class Apartment extends Property {

    private int rooms;
    private int floor;

    
    public Apartment(int propertyId, String location, double price,
                     int rooms, int floor) {

        super(propertyId, location, price);

        this.rooms = rooms;
        this.floor = floor;
    }

 
    @Override
    public void displayDetails() {

        System.out.println("----- APARTMENT DETAILS -----");

        super.displayDetails();

        System.out.println("Rooms       : " + rooms);
        System.out.println("Floor       : " + floor);
    }
}

