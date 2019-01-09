/*
 * 
 * 
 * 
 */

package JavaBasics;

public class AStaticBlock {

	{ // Regular Block in class
		System.out.println(" In Regular Block A...(placed before main)...will appear only and always when an obj of this class is instantiated");
	}

	static { // static Block A
		System.out.println(
				"Static Block A : In the Static Block!. And this gets executed the moment the class gets loaded! and only once!");
	}

	public static void main(String[] args) {
		System.out.println("---------- Main Starts ----------");

		System.out.println("Instantiating obj1");
		AStaticBlock obj1 = new AStaticBlock(); // Only b'cos of obj instantiation does the regular block get called.
		//	Comment the above line and non-static blocks do not get executed
		
		System.out.println("Instantiating obj2");
		AStaticBlock obj2 = new AStaticBlock(); // Only b'cos of obj instantiation does the regular block get called.

		System.out.println("---------- Main Ends   ----------");
	}

	static { // static Block B
		System.out.println("Static Block B : a separate Static Block. Placed after the main function. "
				+ "And still gets executed before main is called, but after the Static block A");
	}

	{ // Regular Block in class, will get executed only if an obj of this class is instantiated
		System.out.println(" In Regular Block B (placed after main)...will appear only and always when an obj of this class is instantiated");
	}
}
