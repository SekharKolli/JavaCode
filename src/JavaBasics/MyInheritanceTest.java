/**
 * Purpose : To demo that java does not support mulitple inheritance. So only one class can exist after the extend keyword
*
* Date: 31-December-2018
*/


package JavaBasics;

class ACls {
	void show() {
		System.out.println("");
	}
}

class BCls {
	void show() {
		System.out.println("");
	}
}


// public class MyInheritanceTest extends A,B { // Generates an error. Java doesn't support multiple inheritance. To implement multiple inheritance use interfaces
public class MyInheritanceTest extends ACls{

	public static void main(String[] args) {

	}

}
