/**
 * Purpose: In java we have a way to find out about class methods, constructors and details about the class itself. 
 * here is a program that attempts to play with some of them
 */


class FirstClass{
	void displayNames() {
		
		System.out.println("getSimpleName is : "+this.getClass().getSimpleName());
		System.out.println("getName is : "+this.getClass().getName());
		System.out.println("getCanonicalName is : "+this.getClass().getCanonicalName());
		
	}
}

public class GetToKnowAboutClassMethods {

	public static void main(String[] args) {

		Class<Thread> c = Thread.class;
		
		System.out.println(c.getName());
		System.out.println(c.getCanonicalName());
		
		new FirstClass().displayNames();
		
	}

}
