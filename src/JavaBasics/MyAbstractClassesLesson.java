package JavaBasics;

//Nobody will be able to create an object of this class as this is defined as abstract. 
//And we can define a class as abstract to prevent people from instantiating this class
abstract class Shape { 
	
	String color;

	Shape(String color) {
		this.color = color;
	}

	// Getter and Setter
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	
	void whatShapeAmI() {
		System.out.println("I'm a general Shape!");
	}

	// if even one method is defined abstract, the class will need to be defined as
	// an abstract class
	public abstract void area(); // Method without body is considered to be an abstract class

}

//Must define an explicit constructor, as the abstract class has a constructor
//Rectangle must implement the inherited abstract method Shape.area()
class Rectangle extends Shape {
	int l,b;
	Rectangle(String color) {
		super(color);
	}

	protected Rectangle(int l, int b, String color) {
		super(color);
		this.l = l;
		this.b = b;
	}

	@Override
	public void area() {
		
	}


} 

public class MyAbstractClassesLesson {
	public static void main(String[] args) {

		// Following will not work. Shape is an abstract class, And abstract classes
		// cannot instantiated
		// Shape s = new Shape("Green");

	}

}
