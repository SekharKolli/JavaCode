/*
 * Lessons / Take Aways 
 * 1. Line # 16 : calling a method off an object at the allocation stage, which works
 * 2. Placement of the method function in the class. This does not matter
 * 3. Multiple return statements in the method
 */

package JavaBasics;

public class ObjectChaining {

	public static void main(String[] args) {
		Boolean b = new Boolean(true);
		Integer x = 343;
		Integer y = new ObjectChaining().go(b,x);
		System.out.println("Ans is : "+y);
	}
	
	Integer go(Boolean b, Integer x) {
		if(b)
			return x/7;
		return x/49;
	}

}
