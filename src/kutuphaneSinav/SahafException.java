package kutuphaneSinav;

public class SahafException extends Exception {
	private String message;

	public SahafException(String message) {
		super(message);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
