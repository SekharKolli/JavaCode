package if_Condition;

import java.util.Scanner;

public class Eligible_Voting {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
			
		System.out.print("Enter you age : ");
		int i = input.nextInt();
		if (i<18) {
			System.out.println("You'll need to wait for "+(18-i)+" more yrs to vote!");
		}else {
			System.out.println("with "+i+" age You can vote. Find your voter card and vote this season!");
		}
		
		input.close(); // To prevent any resource leak
	}

}
