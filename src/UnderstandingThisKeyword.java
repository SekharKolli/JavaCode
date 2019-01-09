import java.util.Date;

/**
 * Purpose : Talks about the this keyword and its usage
 *
 * Date: 28-December-2018
 */

class CreditCard {
	long no;
	String name;
	Date expiry;

	
	public CreditCard() { // Default constructor
		this(0, "Default Name", new Date()); // this calls the constructor here this acts as a method
	}

	// We use the this keyword to reference instance variables
	public CreditCard(long no, String name, Date expiry) { // Parameterized constructor
		this.no = no;
		this.name = name;
		this.expiry = expiry;
	}

	@Override
	public String toString() { return "CreditCard [no=" + no + ", name=" + name + ", expiry=" + expiry + "]"; }
	
} // EO CreditCard

public class UnderstandingThisKeyword {

	public static void main(String[] args) {
		CreditCard myCard = new CreditCard();
		
		System.out.println(myCard);

	}	
	
}
