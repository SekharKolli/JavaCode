package JavaBasics;

class Counting {
	int count;
	static int sCount;
	
	Counting(){
		count=1;
		sCount=1;
	}
	
	void incrementCounts() {
		count++;
		sCount++;
	}

	void showCount() {
		System.out.println(this.toString()+" : count : "+count+" | sCount : "+sCount);
	}
} // EOClass

public class StaticDemoAgain {

	public static void main(String[] args) {
		
		Counting cObj1 = new Counting();
		Counting cObj2 = new Counting();
		
		Counting cObj3 = cObj1; // reference copy. Here cObj3 will be pointing to the same object pointed by cObj1. And will output the same address
		
		Counting cObj4 = null;
		cObj4 = cObj1; 
		cObj4 = new Counting();
		
		cObj1.incrementCounts();
		cObj2.incrementCounts();
		cObj3.incrementCounts();
		cObj4.incrementCounts();

		cObj1.showCount();
		cObj2.showCount();
		cObj3.showCount();
		cObj4.showCount();
		
	}

}
