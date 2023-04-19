package factory_methos_pattern;

public class ChocolateBar implements Treat {
	

	private Ingredient ingredient;
	
	public ChocolateBar(Ingredient ingredient) {

		this.ingredient = ingredient;
	}
	@Override
	public Ingredient getIngredient() {
		return ingredient;
	}
}
