/*
 * 1. Abstract classes are declared with the abstract keyword, which precedes
 * the class keyword 
 * 2. Even one abstract method in the class, which cause the
 * compiler to define the class as abstract 
 * 3. abstract classes can be instantiated iff all the abstract methods have been defined (see line 26 & 27), else we'll get an error
 * 4. If you don't define all the methods the compiler will throw an error, which could explain why people may believe that
 * abstract classes cannot be instantiated
 * 5. abstract can be extended only if we define abstract methods of the class else the base class will need to contain the abstract keyword
 */

package JavaBasics;

abstract class GeneralAbstractClass {
	int a = 0;

	void work() { // Concrete Method
		System.out.println("In GeneralAbstractClass.work()");
		System.out.println("Abstact class variable a's value after incrementing : " + (a + 1));
	}

	abstract void workShow(); // abstract method
}


public class MyAbstractClassInstantiation {

	public static void main(String[] args) {

		GeneralAbstractClass gac = new GeneralAbstractClass() { // To instantiate we need to define all the methods of
																// the abstract class
			@Override
			void workShow() {
				System.out.println(
						"Have to implement abstract method workShow(), to instantiate abstract class GeneralAbstractClass");
				System.out.println("Else we get an error!");
			}
		};

		gac.work(); // concreate method
		gac.workShow(); // abstract method which was define when creating a new object

	}

}

// We are able to extend abstract classes.
class SubClassEntendingAbstract1 extends GeneralAbstractClass {
	
	@Override
	void workShow() {} // Overriding and implementing the parent abstract class methods
	
} // EO SubClassEntendingAbstract

// Abstract class extensible if child class defines itself as abstract
abstract class SubClassEntendingAbstract2 extends GeneralAbstractClass {
	
} // EO SubClassEntendingAbstract

