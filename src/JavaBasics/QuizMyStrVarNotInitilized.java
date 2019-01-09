package JavaBasics;

class BankClassStr {
	int accNo;
	String accName;
	double balance;

	BankClassStr(int x) {
		accNo = x;
//		String accName; // NOT initializing the String
//		double balance; // NOT initializing the balance
	}
}

public class QuizMyStrVarNotInitilized {
	public static void main(String args[]) {

		BankClassStr obj = new BankClassStr(150);

		obj.accName = "Banking"; // Auto-Boxing in progress. String gets assigned to object

		System.out.println("Id " + obj.accNo); // accNo initialized in constructor
		System.out.println("Name " + obj.accName); // accName initialized by using =, when object is created
		System.out.println("Balance " + obj.balance); // balance was never initialized by me. JVM initialized the default value 0.0
	}
}
