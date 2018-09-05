package app;

public class KMException extends ParametroException {
	public static final String msg = "KM igual a 0!";
	
	public KMException() {
		super(msg);
	}
	
	public KMException(String msg) {
		super(msg);
	}

}
