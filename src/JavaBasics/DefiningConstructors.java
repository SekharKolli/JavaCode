/*
 * Covers the following items
 * 1. Demonstrates the use of "this" keyword 
 * 2. this.variable name
 * 3. this(args) to call classes constructor
 * 4. this(args) call has to be the first line in the constructor method. Placing it anywhere else generates a compilation error
 */

package JavaBasics;

class MyClass {

	int i;
	float f;
	double d;
	String s;
	boolean b;

	public MyClass() { // Empty Constructor
		System.out.println("In constructor : public public MyClass()");
	}

	public MyClass(int i) {
		this.i = i;
		System.out.println("In constructor : public MyClass(int i)");
	}

	public MyClass(int i, float f) {
		this(i);
		this.f = f;
		System.out.println("In constructor : public MyClass(int i, float f)");
	}

	public MyClass(int i, float f, double d) {
		this(i, f);
		this.d = d;
		System.out.println("In constructor : public MyClass(int i, float f, double d)");
	}

	public MyClass(int i, float f, double d, String s) {
		this(i, f, d);
		this.s = s;
		System.out.println("In constructor : public MyClass(int i, float f, double d, String s)");
	}

	public MyClass(int i, float f, double d, String s, boolean b) {
		this(i, f, d, s);
		this.b = b;
		System.out.println("In constructor : public MyClass(int i, float f, double d, String s, boolean b)");
	}

} // EO MyClass

public class DefiningConstructors {

	public static void main(String[] args) {

		System.out.println("---------------------Program Starts------------------------");
		
		//	MyClass mc = new MyClass();
		MyClass mc = new MyClass(10,10.0f,10.0d,"My Awesome String",true);
		
		System.out.println(mc.toString());

		System.out.println("Lesson : Even though I'm calling a constructor with all arguments, sequence starts with the first one (& not in reverse)");
		System.out.println("---------------------Program Ends------------------------");

	}

}
