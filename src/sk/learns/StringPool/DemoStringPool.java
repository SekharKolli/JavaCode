/*
 * Purpose : Demos the use of StringPool and how strings get handaled in JAva
 * <Link>https://www.edureka.co/blog/java-string </Link>.
 * Date: 19-January-2019
 */

package sk.learns.StringPool;

import java.util.Objects;

public class DemoStringPool {

	public static void main(String[] args) {

		String s1 = "Apple";
		String s2 = "Apple";

		System.out.println("Is s1 = \"Apple\" & s2 = \"Apple\" pointing to String literal \"Apple\" " + (s1 == s2));
		System.out.println("\"Apple\".hashCode() : "+"Apple".hashCode());
		System.out.println("       s1.hashCode() : "+s1.hashCode());
		System.out.println("       s2.hashCode() : "+s2.hashCode());
		

		boolean flag;

		// These two have the same value
		flag = new String("test").equals("test"); // --> true
		System.out.println("{new String(\"test\").equals(\"test\");} evaluates to --> " + flag);

		// ... but they are not the same object
		flag = new String("test") == "test"; // --> false
		System.out.println("{new String(\"test\") == \"test\";} evaluates to --> " + flag);

		// ... neither are these
		flag = new String("test") == new String("test"); // --> false
		System.out.println("{new String(\"test\") == new String(\"test\");} evaluates to --> " + flag);

		// ... but these are because literals are interned by the compiler and thus refer to the same object
		flag = "test" == "test"; // --> true
		System.out.println("{\"test\" == \"test\";} evaluates to --> " + flag);

		// ... string literals are concatenated by the compiler and the results are interned.
		flag = "test" == "te" + "st"; // --> true
		System.out.println("{\"test\" == \"te\" + \"st\";} evaluates to --> " + flag);

		// ... but you should really just call Objects.equals()
		Objects.equals("test", new String("test")); // --> true
		Objects.equals(null, "test"); // --> false
		Objects.equals(null, null); // --> true

	}

}
