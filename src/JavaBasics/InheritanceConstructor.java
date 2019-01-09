/* Example demonstrates the following concepts...
 * 1. Behavior of constructors during inheritance
 * 2. super() - constructor of a superclass is automatically called. And is the first item which gets called
 * 3. we can explicitly call (and pass the required args) to the parent's class constructor or superclass using the super(args). 
 *    This has to be the first line in the derived class 
 */

package JavaBasics;

class A {
	int a;
	
	A(){
		System.out.println("Class A Constructor Called...");
	}
	
	A(int someArg){
		a = someArg;
		System.out.println("Class A Constructor with an argument Called...");	
	}
}

class B extends A{
	B(){
		//super classes constructor is called automatically. 
		//super(); - if a call to super has to be made, it has to be in the first line of the constructor
		System.out.println("Class B Constructor Called...");
	}
	
	B(int bArg){
		super(bArg); // To call constructors with arguments use super and this has to be the first line in the constructor for object construction
		System.out.println("Class B Constructor with an argument Called...");	
	}
}


public class InheritanceConstructor {

	public static void main(String[] args) {
		System.out.println("----------------");

		B b1 = new B();
		B b2 = new B(100);
		
		System.out.println(b1.toString()); 
		System.out.println(b2.toString()); 
		
		System.out.println("----------------");
		
	}

}
