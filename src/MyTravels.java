// Here is an example for abstract

abstract class Vacation {
	abstract void getFood();

	abstract void getDrinks();

	abstract void getThere();

	abstract void packStuff();
	
	void takeMedicine() {
		System.out.println("Got to take my medicine wherever I go!");
	}
}

class SwitzerlandVaction extends Vacation {

	void getFood() { System.out.println("Brrr....it's cold, Let's get some hot food...say hot soup!"); }

	void getDrinks() { System.out.println("Switzerland is cold...how about hot choclate "); }

	void getThere() { System.out.println("Switzerland... somebody book plane tickets"); }

	void packStuff() { System.out.println("Going to a cold country...Pack a good jacket, gloves, skies"); }

}

class BeachVacation extends Vacation {

	void getFood() { System.out.println("I'm going to Beach...let's pack sandwiches & ice-cream"); }

	void getDrinks() { System.out.println("I'm going to Beach...I'm going to take cool drinks"); }

	void getThere() { System.out.println("Pull out the car... and lets drive there"); }

	void packStuff() { System.out.println("It is going to snow...Pack sunscreen, Beach Ball, Towel"); }
}

class MyTravels {

	public static void main(String[] args) {
		
		Vacation v = new SwitzerlandVaction(); // We cannot instantiate an abstract class variables, however we can declare it and reference a child class object 
		
		v.getFood();
		v.getDrinks();
		v.getThere();
		v.packStuff();
		v.takeMedicine();
		
		System.out.println("-----It's time to go to a beach-----");
		
		v = new BeachVacation();
		v.getFood();
		v.getDrinks();
		v.getThere();
		v.packStuff();
		v.takeMedicine();
		

	}

}
