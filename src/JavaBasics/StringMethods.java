/*
 * String is immutable class
 */

package JavaBasics;

public class StringMethods {

	public static void main(String[] args) {
		doString();
		doStringBuffer();
		doStringBuilder();
	}

	// javap java.lang.StringBuffer. Will list synchronized methods
	private static void doStringBuffer() { // thread safe and it is synchronized. Otherwise StringBuffer is the same as StringBuilder
		System.out.println("------------------ In StringBuffer Class ------------------ ");
		
		StringBuffer str = new StringBuffer("edureka");
		
		System.out.println(" length( = "+str.length());
		System.out.println(" capacity() = "+str.capacity());
		System.out.println(" length() = "+str.length());
		System.out.println(" charAt(1) = "+str.charAt(1));
		System.out.println(" substring(3, 7) = "+str.substring(3, 7));
		System.out.println("indexOf(\"e\" = )"+str.indexOf("e"));
	}

	private static void doStringBuilder() { // not thread safe (not synchronized). Otherwise same as StringBuffer
		System.out.println("------------------ In StringBuilder Class ------------------ ");
		
		StringBuilder str = new StringBuilder("edureka");
		
		System.out.println(" length() = "+str.length());
		System.out.println(" capacity() = "+str.capacity());
		System.out.println(" length() = "+str.length());
		System.out.println(" charAt(1) = "+str.charAt(1));
		System.out.println(" substring(3, 7) = "+str.substring(3, 7));
		System.out.println("indexOf(\"e\" = )"+str.indexOf("e"));
	}

	private static void doString() {
		System.out.println("------------------ In StringBuffer Class ------------------");
		
		String str = "edureka";
	
		System.out.println("Original String = "+str);
		System.out.println("length() = "+str.length());
		System.out.println("Char At 0 = "+str.charAt(0));
		System.out.println("indexOf(\"e\" = )"+str.indexOf("e"));
		System.out.println("indexOf(\"e\" = )"+str.lastIndexOf('e'));
		System.out.println("IsEmpty() = "+str.isEmpty());
		System.out.println("toLowerCase() = "+str.toLowerCase());
		System.out.println("toUpperCase() = "+str.toUpperCase());
		System.out.println("replace('e', '*') = "+str.replace('e', '*'));
	}

}

