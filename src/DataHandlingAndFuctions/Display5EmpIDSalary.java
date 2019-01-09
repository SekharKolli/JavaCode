package DataHandlingAndFuctions;

import java.util.Scanner;

public class Display5EmpIDSalary {

	public static void main(String[] args) {

		Scanner fkb = new Scanner(System.in);

		System.out.print("Enter the # of employees : ");
		int size = fkb.nextInt();

		int[] ids = new int[size];
		String[] names = new String[size];
		double[] salaries = new double[size];

		System.out.print("Auto generate " + size + " employees (y/n)? : ");
		char ans = fkb.next().charAt(0);

		if (ans == 'Y' || ans == 'y') {
			createSampleData(ids, names, salaries); // Autogenerate names to save testing time
		} else { // You want to enter the names of the employees
			fkb.reset();
			for (int i = 0; i < size; i++) {
				ids[i] = i + 1;

				System.out.println("Enter Salary for employee " + (i + 1) + " and press enter : ");
				salaries[i] = fkb.nextDouble();

				System.out.println("Enter Name for employee " + (i + 1) + " and press enter : ");
				names[i] = fkb.next();

				System.out.println("");
			}
		}

		display(ids, names, salaries);
		display(ids, names);

		fkb.reset();
		display(names);
		System.out.println("Enter name whose details you'd like to pull out : ");
		String findName = fkb.next();
		display(findName, ids, names, salaries);

		fkb.close();
	}

	// Auto Populating data to test & increase coding speed
	static void createSampleData(int[] ids, String[] names, double[] salaries) {
		String[] sampleNames = { "John", "Clark", "Nancy", "Joe", "Mary", "Dory", "Hopper", "Peter" };

		for (int i = 0; i < ids.length; i++) {
			ids[i] = i + 1;
			names[i] = sampleNames[i];
			salaries[i] = 200000 * (i + 1);
		}

	}

	static void display(String[] names) {
		System.out.print("Available Employees : ");

		for (String name : names) {
			System.out.print(" | " + name);
		}

		System.out.println(" | ");
	}

	static void display(int[] ids, String[] names) {
		System.out.println("ids \t names ");
		System.out.println("------------------");
		for (int i = 0; i < ids.length; i++) {
			System.out.printf("%03d\t%s\n", ids[i], names[i]);
		}
		System.out.println("");
	} // display only two values

	static void display(int[] ids, String[] names, double[] salaries) {

		System.out.println("ids \t names \t\t salaries");
		System.out.println("-------------------------------------");
		for (int i = 0; i < ids.length; i++) {
			System.out.printf("%03d\t%s\t%.2f\n", ids[i], names[i], salaries[i]);
		}
		System.out.println("");
	} // display table

	static void display(String findName, int[] ids, String[] names, double[] salaries) {

		int i = 0;

		for (String name : names) {
			if (findName.equalsIgnoreCase(name)) {
				System.out.println("ids \t names \t\t salaries");
				System.out.println("-------------------------------------");
				System.out.printf("%03d\t%s\t\t%.2f\n", ids[i], names[i], salaries[i]);
				return;
			}

			i++;
		}
		System.out.println("Employee " + findName + " not found!");

		System.out.println("");
	} // display table

} // EOClass
