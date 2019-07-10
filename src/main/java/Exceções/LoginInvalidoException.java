package Exceções;

public class LoginInvalidoException extends Exception{
	
	private static final long serialVersionUID = -2149585569203665793L;

public LoginInvalidoException(String msg) {
	super(msg);
}
}
