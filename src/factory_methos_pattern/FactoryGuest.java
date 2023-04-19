package factory_methos_pattern;

public final class FactoryGuest {
	private FactoryGuest() {
	}

	public static void main(String[] args) {
		// TODO Instantiate the Willy Wonka Factory
		
		WillyWonkaFactory willyWonkaFactory = new WillyWonkaFactory();

		// TODO Uncomment the following code and instantiate the objects
		// TODO Make sure the program does not crash upon exception being thrown and in such a case
		//       the error message (not the stack trace) are printed to the System.out
		// TODO Exactly after each object is instantiated call the getIngredient() method on the instance and print
		//      the output to the System.out (each on a new line)

		Treat myFirstTreat = willyWonkaFactory.createTreat(Ingredient.SPECIAL_INGREDIENT, Ingredient.CHOCOLATE);
		System.out.println(myFirstTreat.getIngredient());
		Treat mySecondTreat = willyWonkaFactory.createTreat(Ingredient.GELATINE, Ingredient.SPECIAL_INGREDIENT);
		System.out.println(mySecondTreat.getIngredient());
		try {
			Treat myThirdTreat = willyWonkaFactory.createTreat(Ingredient.GELATINE, Ingredient.CHOCOLATE);
			System.out.println(myThirdTreat.getIngredient());
		} catch (UnknownRecipeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
