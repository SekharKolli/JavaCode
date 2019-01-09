/*
 * Lessons / Take Away 
 * Usage between String, StringBuffer, StringBuilder classes
 */

package JavaBasics;

public class myStringTests {

	public static void main(String[] args) {
		String s1 = "Sekhar Kolli";
		String s2 = "Sekhar Kolli";
//		String s3 = "Sekhar Kolli";
//		String s4 = "Sekhar Kolli";
		
			
		System.out.println("s1 : "+s1);
		
		s1.concat("Reddy");
		System.out.println("After s1.concat(\"Reddy\") value of s1 : "+s1); // Will still remain "Sekhar Kolli" as s1 is a literal and is immutable. if we want to store this value assign it to
		
		System.out.println("s1=s2 is "+ (s1=s2));
		
	}

}
