/**
 * Can a final interface exist? Ans is no. Only public & abstract are permitted 
 */

// final interface IsThisFinalInterface { // Declaring an interface as final generates a compilation error. So it cannot be done
interface IsThisFinalInterface {
	void show();
}


public class CanIHaveFinalInterface implements IsThisFinalInterface{

	public void show() {
		System.out.println("We cannot have an inteface declared as final. Only Public and abstract are permitted");
	}
	
	public static void main(String[] args) {
		
		new CanIHaveFinalInterface().show();

	}

}
