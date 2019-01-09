
public class MyPassingVariableArgs {

	public static void main(String[] args) {

		populatePlanets("Mercury", "Venus  ", "Earth  ", "Mars   ", "Pluto  ", "Jupiter", "Saturn ", "Uranus ",
				"Neptune");

	}

	private static void populatePlanets(String... planetNames) { // using a variable arguments declaration

		for (String s : planetNames)
			System.out.println(s);
	}

} // EOClass
