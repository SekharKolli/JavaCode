/* 
 * Purpose : Simple Innerclass demo
 * 
* Date: 17-January-2019
*/
package sk.learns.InnerClasses;

class ClassOuter {
	int x = 100;

	class ClassInner {
		int y = 200;

		void display() {
			System.out.println(x + y);
		}
	}
}

public class AnotherInnerEg {
	public static void main(String args[]) {
		ClassOuter o1 = new ClassOuter();
		ClassOuter.ClassInner i1 = o1.new ClassInner();
		i1.display(); // will print 300 as it is accessible
	}
}