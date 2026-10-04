package real_estate;

public class Buyer extends Person {


	    private double budget;

	    public Buyer(String name, String phone, double budget) {

	        super(name, phone);

	        this.budget = budget;
	    }

	    public void displayBuyer() {

	        System.out.println("----- BUYER DETAILS -----");

	        displayPerson();

	        System.out.println("Budget : " + budget);
	    }

	    public double getBudget() {
	        return budget;
	    }
	}

