/*
 * Purpose : Demos the use of Math class
 *
 * Date: 10-January-2019
 */

package JavaBasics;

// import java.lang.Math.*;

// Static Imports. From Java 5
import static java.lang.Math.*;

public class MathTest {

	public static void main(String[] args) {

// System.out.println(Math.PI);
// System.out.println(Math.E);
// System.out.println(Math.sqrt(25));
// System.out.println(Math.sin(0));
// System.out.println(Math.cos(0));
// System.out.println(Math.ceil(10.1));
// System.out.println(Math.floor(10.1));

		// B'cos of static imports the above Math.* statements can be written in the
		// following way

		System.out.println(PI);
		System.out.println(E);
		System.out.println(sqrt(25));
		System.out.println(sin(0));
		System.out.println(cos(0));
		System.out.println(ceil(10.1));
		System.out.println(floor(10.1));
	}

	// Importing System package in static mode can help us use System.out.println(floor(10.1)); as out.println(floor(10.1));

}
