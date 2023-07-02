package AraDönemOdeviSoru1;

public enum Errors {
	
	    EMPTY_LIST(1001, "Empty list"),
	    NOT_IN_THE_LIST(1002, "not in the list"),
	    ALREADY_EXISTS(1003,"Already exists");


	    private int code;
	    private String message;

	    private Errors(int code, String message) {
	        this.code = code;
	        this.message = message;
	    }

	    public int getCode() {
	        return code;
	    }

	    public String getMessage() {
	        return message;
	    }
	
}
