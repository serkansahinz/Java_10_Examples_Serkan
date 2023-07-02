package AraDönemOdeviSoru1;



public class PersonelTrackingException  extends RuntimeException {
	
	private final Errors errorType;

    public PersonelTrackingException(Errors errorType) {
        this.errorType = errorType;
    }

    public PersonelTrackingException(Errors errorType, String message) {
        super(message);
        this.errorType = errorType;
    }

    public Errors getErrorType() {
        return errorType;
    }

}
