package real_estate;

public class RealEstateManager {
	
	    
	    private Property[] properties;

	    private int count = 0;

	   
	    public RealEstateManager(int size) {

	        properties = new Property[size];
	    }

	    public void addProperty(Property property) {

	        if (count < properties.length) {

	            properties[count] = property;
	            count++;

	            System.out.println("Property added successfully.");

	        } else {

	            System.out.println("Property limit is full.");
	        }
	    }

	    
	    public void displayAllProperties() {

	        if (count == 0) {

	            System.out.println("No properties available.");

	        } else {

	            System.out.println("\n===== ALL PROPERTIES =====");

	            for (int i = 0; i < count; i++) {

	                properties[i].displayDetails();

	                System.out.println("-------------------------");
	            }
	        }
	    }

	   
	    public void searchProperty(int id) {

	        boolean found = false;

	        for (int i = 0; i < count; i++) {

	            if (properties[i].getPropertyId() == id) {

	                System.out.println("\nProperty Found!");

	                properties[i].displayDetails();

	                found = true;
	                break;
	            }
	        }

	        if (found == false) {

	            System.out.println("Property not found.");
	        }
	    }

	   
	    public void buyProperty(int id, Buyer buyer) {

	        for (int i = 0; i < count; i++) {

	            if (properties[i].getPropertyId() == id) {

	                if (properties[i].getStatus().equals("Available")) {

	                    if (buyer.getBudget() >= properties[i].getPrice()) {

	                        properties[i].setStatus("Sold");

	                        System.out.println("Property purchased successfully.");

	                    } else {

	                        System.out.println("Buyer does not have enough budget.");
	                    }

	                } else {

	                    System.out.println("Property is already sold.");
	                }

	                return;
	            }
	        }

	        System.out.println("Property not found.");
	    }

	   
	    public void displayPropertyCount() {

	        System.out.println("Total Properties: " + Property.propertyCount);
	    }
	}


