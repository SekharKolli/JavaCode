/*
 * 1. once a final instance variable or local variable is initialized, its value will not be allowed to change during the execution of the program
 * 2. 
 * 3. a blank final variable can be initialized only in a constructor or the initialization has to happen at variable declaration and it has to be 
 * 4. and as to happen as the first line
 * 
 * 
 * 
 */

package JavaBasics;

import java.util.Scanner;

public class FinalConcept {
	
	final String finalMemberVariable; // if we just declare and leave compiler will throw error "The blank final field finalMemberVariable may not have been initialized"
	
	// above Error disappears when I define constructor 
	public FinalConcept(String finalMemberVariable) { // Get the value of the final variable
		int i=1; // testing if final variable initilization has to be the first line in the constructor - ans : no
		
		this.finalMemberVariable = finalMemberVariable; // Initialize the final variable 
		
		i++; // Do something with i
	}

	static {
		final String name = "Sekhar Kolli";
		System.out.println("Static Block FInal Name : " + name);

		Scanner kb = new Scanner(System.in);
		System.out.print("Enter your grade : ");
		final String grade = kb.next();

		System.out.println("Static Block : " + name + " received grade " + grade);
		kb.close();

		//
		// x=0; // Can I initialize a blank final variable

	}

	public static void main(String[] args) {
		final int x; // This is called a blank final variable and compilation will fail
		final int n = 25;

		// n = 26; //The final local variable n cannot be assigned. It must be blank and
		// not using a compound assignment

		// variables name and grade not visible here
		// System.out.println("Static Block : "+name + " received grade "+grade);

	}

}
