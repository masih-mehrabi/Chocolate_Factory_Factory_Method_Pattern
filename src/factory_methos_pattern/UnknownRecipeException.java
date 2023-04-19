package factory_methos_pattern;

public class UnknownRecipeException extends RuntimeException {
	
	public UnknownRecipeException(String exceptionMessage) {
		super(exceptionMessage);
	}
}
