package Day5_2;
//부모가 추상이면 자손도 추상이거나, 구체적인 동작이 구현되어야 한다
public class LoginAction extends Action {
	private String path; //간접이동
	private boolean redirect; //직접이동
	
	

	public LoginAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}



	@Override
	public ActionForward excute() {
		// TODO Auto-generated method stub
		System.out.println("Login Action");
		return new ActionForward(path, redirect);
	}
	
	

}
