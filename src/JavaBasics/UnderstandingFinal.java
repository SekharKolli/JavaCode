/**
 * Purpose : Usage of the final keyword
 *
 * Date: 30-December-2018
 */

package JavaBasics;

class FinalDemo {
	final String finalStr; // Will generate an error if the constructor is not defined

	public FinalDemo(String finalStr) { // A final method can be initialized
		this.finalStr = finalStr;
		System.out.println(this.finalStr);

	}

// a function can be final, and it will prevent any overridding
	final void aMethodusingFinalParameter(final int x) { // Parameter names can be final
		// x++; // CE : "The final local variable x cannot be assigned. It must be blank
		// and not using a compound assignment"
		System.out.print(" And even if you ask me " + x + " times. My answer is still the same!");
	}
	
	final void aMethodusingFinalParameter(final String s) { // final methods can be overloaded without any issue
		System.out.println("This is a final method, which is overloaded, receiving final String "+s);
	}	

} // EO FinalDemo

public class UnderstandingFinal {

	public static void main(String[] args) {

		// ?? is this Method Chaining ??
		new FinalDemo("This is my final decision string").aMethodusingFinalParameter(100);
		new FinalDemo("Awesome Final Method").aMethodusingFinalParameter("String");

	}

}
