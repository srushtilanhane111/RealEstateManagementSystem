package real_estate;

public class Property {
	
	    private int propertyId;
	    private String location;
	    private double price;
	    private String status;

	   
	    static int propertyCount = 0;

	    
	    final String PROPERTY_TYPE = "REAL ESTATE";

	
	    public Property(int propertyId, String location, double price) {

	        this.propertyId = propertyId;
	        this.location = location;
	        this.price = price;
	        this.status = "Available";

	        propertyCount++;
	    }

	    
	    public int getPropertyId() {
	        return propertyId;
	    }

	    public String getLocation() {
	        return location;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getStatus() {
	        return status;
	    }

	    
	    public void setStatus(String status) {
	        this.status = status;
	    }

	    
	    public void displayDetails() {

	        System.out.println("Property ID : " + propertyId);
	        System.out.println("Location    : " + location);
	        System.out.println("Price       : " + price);
	        System.out.println("Status      : " + status);
	    }
	}

