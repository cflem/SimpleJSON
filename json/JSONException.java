package json;

public class JSONException extends RuntimeException {
	private static final long serialVersionUID = 6834195091637182719L;
	private String message;
	
	public JSONException (String message) {
		this.message = message;
	}
	
	public String getMessage () {
		return message;
	}

}
