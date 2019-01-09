package if_Condition;
import java.util.Scanner;

public class LargestOfTwo {

			public static void main(String[] args) {
			
				Scanner input = new Scanner(System.in);
				
				System.out.println("Please enter two number one after the other : ");
				int no1 = input.nextInt();
				int no2 = input.nextInt();
				
				if (no1==no2) {
					System.out.println("both numbers entered are same");
				} else if(no1>no2) {
					System.out.println("No1 is greater than No2");
				} else {
					System.out.println("No1 is less than No2");
				}
				
				input.close(); // To prevent any resource leak
			}

	}
