package JavaBasics;

interface XIntVarInterfc {
	int x = 20;
}

public class QuizQInterfaceImplements implements XIntVarInterfc {
	int x = 40;

	public static void main(String args[]) {
		QuizQInterfaceImplements t1 = new QuizQInterfaceImplements();
		System.out.println(t1.x);
	}
}
