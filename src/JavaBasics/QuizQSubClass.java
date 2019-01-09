/* ??i think the learning here is that when a method is overridden, the Exception throwed by the method should match or be of the same tree??
 * 
 * 
 * 
 */

package JavaBasics;

class SuperClass {
	public int doIt(String str, int data) throws ArrayIndexOutOfBoundsException {
		String signature = "(String, Integer[])";
		System.out.println(str + "  " + signature);
		return 1;
	}
}

public class QuizQSubClass extends SuperClass {
	//public int doIt(String str, int data) throws Exception { // Exception Exception is not compatible with throws clause in SuperClass.doIt(String, int)
	public int doIt(String str, int data) throws ArrayIndexOutOfBoundsException { // 
		String signature = "test";
		System.out.println("Overridden: " + str + " " + signature);
		return 0;
	}

	public static void main(String args[]) {
		SuperClass sb = new QuizQSubClass();
		try {
			sb.doIt("hello", 3);
		} catch (Exception e) {
		}
	}
}
