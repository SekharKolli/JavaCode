
class SomeClass {
	String str;
	
	static void aStaticMethod() {
		System.out.println("In StaticMethod : You have successfully called me");
	}

	void regularMethod() {
		System.out.println("In RegularMethod : You have successfully called me");
		System.out.println("...Now RegularMethod is calling a static method");
		SomeClass.aStaticMethod(); // Calling a static method in a regular method. Is this what you were asking about?
	}

	static void aStaticMethodCallingRegularMethod() {
		(new SomeClass()).regularMethod(); // a static method can call a regular method also. Only requirement is object instantiation.  
		// Only requirement is an object instantiation happening with "(new Someclass())" 
	}
	
	static void aStaticMethodCallingString() {
		SomeClass someClass = new SomeClass();
		someClass.regularMethod(); // a static method can call a regular method also. Only requirement is object instantiation.
		System.out.println(someClass.str); // Able to access a string as well 
	}
	
}

public class CanWeCallStaticMethods {

	public static void main(String[] args) {

		System.out.println("===================== Calling a static method directly! =====================");
		SomeClass.aStaticMethod(); // Calling a static method using class outside class declaration

		System.out.println("\n===================== Calling a static method which is calling a regular method!=====================");
		SomeClass.aStaticMethodCallingRegularMethod();
		
		
		System.out.println("\n=====================Calling all methods using a class object! =====================");
		SomeClass obj = new SomeClass();
		obj.regularMethod(); // Calling a regular method that is calling a static method
		obj.aStaticMethod(); // We get a warning, however an object of a class is able to call the static method as well
		obj.aStaticMethodCallingRegularMethod();
	}

}
