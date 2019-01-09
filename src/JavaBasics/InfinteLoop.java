package JavaBasics;

//public class InfinteLoop {
//	public static void main(String[] args) {
//		while (1) // Results in a compilation error
//			System.out.println("Inside Infinite Loop");
//	}
//}

public class InfinteLoop {
	public static void main(String[] args) {
		int i = 0;
		for (; i < 4;) {
			System.out.println("i=" + i);
		}
	}
}