/**
 * Purpose : To demo the use of multi-level inheritance
 *
 * Date: 31-December-2018
 */

package JavaBasics;

class GrandParent {
	
	int wealth = 1000;
	
	public GrandParent() {
		System.out.println("GrandParent Constructor...");

	}

} // EO GrandParent

class Parent extends GrandParent {
	public Parent() {
		System.out.println("Parent Constructor...");

	}
} // EO GrandParent

class Chile extends Parent {
	public Chile() {
		System.out.println("Child Constructor...");

	}
} // EO GrandParent

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {

		Chile c = new Chile();
		
	System.out.println("Child inherited wealth : "+c.wealth);

	}

}
