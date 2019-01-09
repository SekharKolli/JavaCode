package if_Condition;

import java.util.Scanner;
public class EvenOrOdd {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a number : ");
		int i = input.nextInt();
		
		if ((i % 2)==0) {
			System.out.println("Number entered is Even!");
		} else {
			System.out.println("Number entered is Odd!");
		}
		
		input.close(); // To prevent any resource leak
	}

}