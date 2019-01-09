/*
 * Demos how static variable gets updated in java
 * 
 */

package JavaBasics;

class Counter {

	static int n = 10;

	void increment() {
		n = n + 1;
	}

	public static void main(String[] args) {
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();

		obj1.increment();
		obj2.increment();
		obj3.increment();

		System.out.println("obj1.n = "+obj1.n); 
		System.out.println("obj2.n = "+obj2.n);
		System.out.println("obj3.n = "+obj3.n); // only throws a warning for static member access
		System.out.println("Counter.n = "+Counter.n); // This seem to be the right want to access
	}

}
