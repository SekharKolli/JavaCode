/*
 * Purpose : Demos the effect of the final keyword on method overloading
 *
 * Date: 20-December-2018
 */

package JavaBasics;

/*
 * class AForFinal { int a; final void display() { System.out.println(a); } }
 * 
 * class BForFinal extends AForFinal{ // CE : Cannot override the final method
 * from AForFinal void display() { System.out.println(a); } }
 */

/*
 * final class AForFinal { int a; void display() { System.out.println(a); } }
 * 
 * //CE. The type B cannot subclass the final class AForFinal class B extends
 * AForFinal{ }
 */

class AForFinal {
	int a = 10;

	final void display() { System.out.println("Regular display" + a); }

	final void display(int i) { System.out.println("Overloaded display : " + a + i); }

}

public class MyConcepts_Final {

	public static void main(String[] args) {

		AForFinal obj = new AForFinal();

		obj.display(20);

	}

}
