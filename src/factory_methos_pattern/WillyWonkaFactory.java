package factory_methos_pattern;

public class WillyWonkaFactory {
	// TODO Create the createTreat() method
	
	public Treat createTreat(Ingredient firstIngredient, Ingredient secondIngredient) throws UnknownRecipeException {
		
		
		if (firstIngredient == null && secondIngredient == Ingredient.SPECIAL_INGREDIENT) {
			return new JellyBean(secondIngredient);
		} else if (firstIngredient == Ingredient.CHOCOLATE && secondIngredient == Ingredient.SPECIAL_INGREDIENT) {
			return new ChocolateBar(firstIngredient);
		} else if (firstIngredient == Ingredient.SPECIAL_INGREDIENT && secondIngredient == Ingredient.CHOCOLATE) {
			return new ChocolateBar(secondIngredient);
		} else if (firstIngredient == Ingredient.SPECIAL_INGREDIENT && secondIngredient == Ingredient.GELATINE) {
			return new JellyBean(secondIngredient);
		} else if (firstIngredient == Ingredient.GELATINE && secondIngredient == Ingredient.SPECIAL_INGREDIENT) {
			return new JellyBean(firstIngredient);
		} else  {
			throw new UnknownRecipeException("The special ingredient is missing!");
		}
			
			
		
			
		
		
		
		
		
	}
}
