/**
 * Purpose : Demos that there is only one object gets created during inheritance (as opposed to two)
 * Parent constructor is called first and then the child constructor
 *
 * Date: 29-December-2018
 */

class Parent {
	Parent() {
		System.out.println("\n In the Parent constructor");
		System.out.println("Parent.toString : " + this.toString());
	}

	void wealth() { System.out.println("-----Parent's Wealth----- "+ this.toString()); }
} // EO Parent

class Child extends Parent {
	Child() {
		System.out.println("\n In the Child constructor");
		System.out.println("Child.toString : " + this.toString());
	}

	void wealth() { System.out.println("-----Child's Wealth----- " + this.toString()); }
} // EO Child

public class UnderstandingInheritance {

	public static void main(String[] args) {

		Parent p = new Child();

		System.out.println("\n P.toString : " + p.toString());

		p.wealth();
		
		// Error : Cannot use this in a static context
		// System.out.println("Calling the Main method toString"+this.toString());

	}

}
