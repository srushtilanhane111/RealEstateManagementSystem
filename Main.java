package real_estate;

public class Main {

	    public static void main(String[] args) {
	        
	        RealEstateManager manager = new RealEstateManager(10);

	       
	        House house1 = new House(
	                101,
	                "Pune",
	                5000000,
	                3,
	                true
	        );

	        Apartment apartment1 = new Apartment(
	                102,
	                "Mumbai",
	                7000000,
	                2,
	                5
	        );

	        House house2 = new House(
	                103,
	                "Nagpur",
	                3500000,
	                2,
	                false
	        );

	      
	        manager.addProperty(house1);
	        manager.addProperty(apartment1);
	        manager.addProperty(house2);

	        
	        manager.displayAllProperties();

	       
	        System.out.println("\n===== SEARCH =====");

	        manager.searchProperty(102);

	        
	        Buyer buyer1 = new Buyer(
	                "Rahul",
	                "9876543210",
	                8000000
	        );

	  
	        System.out.println();

	        buyer1.displayBuyer();

	    
	        System.out.println("\n===== BUY PROPERTY =====");

	        manager.buyProperty(102, buyer1);

	        
	        System.out.println("\n===== PROPERTY COUNT =====");

	        manager.displayPropertyCount();
	    }
	}


