/**
 * Purpose : use polymorphism on intefaces. Use the declaration of interface variable and assign child classes to it. 
 * Basically wrote this program to mimic how use Runnable gets used in (Concept : threads)
 */

interface Rules {
	public void someRules();
}

class WorkingHard implements Rules {

	@Override
	public void someRules() {
		System.out.println("Here are some rules that need to get implemented!");
	}

}

class MoreWork {
	void doMoreWork() {
		System.out.println("Doing More Work()");
	}

	void doMoreWork(String s) {
		System.out.println("Doing More Work() + " + s);
	}
}

class WorkingHarder extends MoreWork implements Rules {
	@Override
	public void someRules() {
		System.out.println("Implementing rules when working harder is tough, but still finished it!");

		// here are ways to access methods of
		// 1) create an object and then call
//		MoreWork m = new MoreWork();
//		m.doMoreWork();
//
//		// 2) using anonymous object
//		new MoreWork().doMoreWork();
//
//		// 3) using the this keyword. Over here
		this.doMoreWork();

	}
}

public class MyPolymorphicInterface {

	public static void main(String[] args) {

		Rules i;
		
		//This will be an error

		i = new WorkingHard(); // B'cos of runtime polymorphism, we can assign a new object of a child class to the parent interface class
		i.someRules(); // Calling someRules using Rule interface i. This is what gets used when using the Runnable interface when implementing threads

		i = new WorkingHarder(); // Now pointing the reference of i to a different object
		i.someRules(); // Calling someRules using Rule interface i. This is what gets used when using the Runnable interface when implementing threads

	}

}
