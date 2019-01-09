/**
 * Purpose : To demo the instantiation of a static Inner class and an inner class
 * UnderstandingInnerClasses.java - will give more information about InnerClasses in general
 *
 * Date: 30-December-2018
 */

package JavaBasics;

import JavaBasics.OuterClass.InnerClass;

class OuterClass {

	String str = "In the outer World Free!";
	void show() { System.out.println("you are accessing show() from OuterClass..."); }

	
	class InnerClass {
		String innerString = "Deeper Inner String";
		void show() { System.out.println("you are accessing show() from InnerClass..."); }

	}

	static class InnerStaticClass {
		String staticString = "Here is a principle that will continue to remain same for life";
		void show() { System.out.println("you are accessing show() from InnerStaticClass..."); }
	
	}

} // EO OuterClass

public class UnderstandingStaticInnerClasses {

	public static void main(String[] args) {

		// 1. Here is how to instantiate an innerclass
		OuterClass outerRef = new OuterClass(); // Create the outer class object
		InnerClass innerRef = outerRef.new InnerClass(); // Create the innerclass object using the instantiated outer
															// class object
		outerRef.show();
		System.out.println(outerRef.str);
		innerRef.show();
		System.out.println(innerRef.innerString);

		// 2. To instantiate an inner Static Class, we access it as we would access
		// class static methods using classname.staticMembers method
		OuterClass.InnerStaticClass innerStatref = new OuterClass.InnerStaticClass(); // accessing
																						// classname.staticMembers
		innerStatref.show();
		System.out.println(innerStatref.staticString);

	}

}
