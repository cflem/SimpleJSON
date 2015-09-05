package json;

public class JSONTokenException extends RuntimeException {
	private static final long serialVersionUID = -3914150643236139654L;
	String token;
	
	public JSONTokenException (char c) {
		this.token = "\'"+c+"\'";
	}
	
	public JSONTokenException (String token) {
		this.token = "\'"+token+"\'";
	}
	
	public String getMessage () {
		return "Unexpected JSON token: "+token;
	}
}
