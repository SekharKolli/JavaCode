package if_Condition;

import java.util.Scanner;
public class Positive_Negetive_Zero {

		public static void main(String[] args) {
		
			Scanner input = new Scanner(System.in);
			
			System.out.print("Please enter a number : ");
			int i = input.nextInt();
			
			if (i==0) {
				System.out.println("Number entered is zero!");
			} else if(i>0) {
				System.out.println("Number entered is +ve!");
			} else {
				System.out.println("Number entered is -ve!");
			}
			
			input.close(); // To prevent any resource leak
		}

}
