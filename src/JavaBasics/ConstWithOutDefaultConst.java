/*
 * Can we define a parameterized constructor without defining a default constructor? - yes we can.
 * 
 * If no constructor is defined and we instantiate an object with new, ??compiler?? defines a default constructor
 * 
$> javap ConstWithOutDefaultConst.class
Compiled from "ConstWithOutDefaultConst.java"
public class JavaBasics.ConstWithOutDefaultConst {
  public JavaBasics.ConstWithOutDefaultConst();
  public static void main(java.lang.String[]);
}

$> javap AClass.class
Compiled from "ConstWithOutDefaultConst.java"
class JavaBasics.AClass {
  short h;
  boolean b;
  java.lang.String s;
  JavaBasics.AClass(short, boolean, java.lang.String);
}
 */

package JavaBasics;

class AClass {
	short h;
	boolean b;
	String s;

//	AClass(short h, boolean b, String s) {
//		this.h = h;
//		this.b = b;
//		this.s = s;
//	}

}

public class ConstWithOutDefaultConst {

	public static void main(String[] args) {
//		AClass aObj = new AClass((short) 10, true, "Some String");
		AClass aObj = new AClass(); // Even if we don't define this constrctor, Java compiler constructs this constructor

		aObj.toString();
	}
}
