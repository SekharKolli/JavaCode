package JavaBasics;

interface AddInterface {
	int add(int x, int y);
}

interface DoAdditionInterface extends AddInterface {
	int add(int x, int y);
}

public class InterfaceQuizQuestion implements DoAdditionInterface {
	public int add(int x, int y) {
		return 0;
	}

	public int sub(int a, int b) {
		return 0;
	}

	public static void main(String args[]) {
		
	}
}