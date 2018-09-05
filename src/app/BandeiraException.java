package app;

public class BandeiraException extends ParametroException{
	public static final String msg = "Bandeirada nao informada!";
	
	public BandeiraException() {
		super(msg);
	}
	
	public BandeiraException(String msg) {
		super(msg);
	}


}
