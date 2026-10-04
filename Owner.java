package real_estate;

public class Owner extends Person {
	
	    private String propertyType;

	    public Owner(String name, String phone, String propertyType) {

	        super(name, phone);

	        this.propertyType = propertyType;
	    }

	    public void displayOwner() {

	        System.out.println("----- OWNER DETAILS -----");

	        displayPerson();

	        System.out.println("Property Type : " + propertyType);
	    }
	}


