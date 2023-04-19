package factory_methos_pattern;

public class JellyBean implements Treat {
	
	private Ingredient ingredient;
	
	public JellyBean(Ingredient ingredient) {
		
		this.ingredient = ingredient;
	}
	
	@Override
	public Ingredient getIngredient() {
		return ingredient;
	}
}
