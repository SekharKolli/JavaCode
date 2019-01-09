/**
 * Purpose : Constructors cannot have a return type
 *
 * Date: 28-December-2018
 */

class ClassA {
	//public ClassA() {} // Default constructor 
	
	
	// Compilation Error
	ClassA() {
		return; // just passes control. It cannot return any value
	} 
	
	// Compilation Error
	// 1. Constructor cannot have a return type
	/*void ClassA() {
		
	}*/

} // EO ClassA

public class UnderstandingConstructors {

	public static void main(String[] args) {

	}

}
