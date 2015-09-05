package json;

public class JSONParseException extends RuntimeException {
	private static final long serialVersionUID = -7691690053492370660L;
	private String message;
	
	public JSONParseException (String message) {
		this.message = message;
	}
	
	public String getMessage () {
		return message;
	}
	
}
