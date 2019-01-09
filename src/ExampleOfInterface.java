
interface StudentRecord {
	int classSize = 20; // data attributes of this interface are public static final

	void showRecord(); // Methods of this interface are automatically converted to public abstract
	void enterRecord();// Methods of this interface are automatically converted to public abstract
}

class Student implements StudentRecord{
	
	String fName, lName, email;
	int rollNo;
		
	public void showRecord() {
		System.out.println(fName+" "+lName+" with "+email+" and rollNo "+rollNo);
				System.out.println("belongs to classSize"+classSize); // we are able to access variables from interface as a final static
	}

	public void enterRecord() {
		System.out.println("Entering student detials");
		fName="TupaaKey";
		lName="Blower";
		email="someone@example.com";
		rollNo=12;
		
		//Error : final field StudentRecord.classSize cannot be assigned
		// classSize = 50; 
	}
}

public class ExampleOfInterface {

	public static void main(String[] args) {

		System.out.println("Java file with an interface!");
		System.out.println("Since interface attributes are public static final, i's value can displayed : "+StudentRecord.classSize);
	}
}
