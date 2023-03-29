package Day08_4;

public class UserException extends Exception {
	public UserException(String message) {
		super(message);
	}

	public void dataValidateCheck() {
		System.out.println("dataValidate");
	}
	
	
}
