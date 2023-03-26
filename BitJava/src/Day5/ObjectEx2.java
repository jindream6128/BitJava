package Day5;

public class ObjectEx2 {
	private String message;
	private static ObjectEx2 instance;
	
	
	//?‹±ê¸??†¤
	public static ObjectEx2 getInstance() {
		if(instance == null) {
			instance = new ObjectEx2();
		}
		return instance;
	}
	
	private ObjectEx2() {
		message="Hi";
	}
	
	
	public void setMessage(String message){
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}
