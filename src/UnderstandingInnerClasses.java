/**
 * Example of Inner classes and Outer classes
 * We use the object of the outer class to create an object of the inner class
 *
 */

class Outer {
	void show() {
		System.out.println("This is Outer Class");
	}
	
	// This is a nested class or an inner class
	class Inner {
		void show() {
			System.out.println("This is Inner Class");
		}
		
		// This is a nested class within a nested class 
		class EvenMoreInner{
			void show() {
				System.out.println("This is an even more Inner Class");
			}
		}
	}
	
	//we can also have multiple Inner classes
	class multipleInner {
		
	}
	
	void someFunction() {
		
		// Having a class in a function is called a local class
		class Local {
			void show() {
				System.out.println("This is local Class and is local to the function. Available only when someFunction is called");
			}
		}
		
		Local local = new Local();
		local.show();
	}
	
	interface InnerInterface { // we can also have interfaces 
		void show();
	}
	
	class OneMoreInner implements InnerInterface { // and classes that implement interfaces
		@Override
		public void show() {
			System.out.println("Inner class Implementing an Interface");
		}
	}
	
	private class ClassPrivate { } // We can also have access modifiers
	protected class ClassProtected { } // We can also have access modifiers
	public class ClassPublic { } // We can also have access modifiers
	class ClassDefault extends ClassPrivate{ } // We can also have access modifiers and extend classes
}

public class UnderstandingInnerClasses {

	public static void main(String[] args) {
		
		Outer outRef = new Outer(); // Declaring an object of outer class
		Outer.Inner inRef = outRef.new Inner(); // Using the object created we are creating an object of inner class
		Outer.Inner.EvenMoreInner evRef = inRef.new EvenMoreInner(); // We are using parent object to instantiate an object
		
		outRef.show(); // calls outer method
		inRef.show(); // calls inner method
		evRef.show(); // calls inner method
		
		outRef.someFunction(); // local class to someFunction
		
		Outer.OneMoreInner omiRef = outRef.new OneMoreInner();
		omiRef.show();
		
		
		

	}

}
