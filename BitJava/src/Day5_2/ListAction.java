package Day5_2;

public class ListAction extends Action{
	
	private String path; //간접이동
	private boolean redirect; //직접이동
	
	
	public ListAction(String path, boolean redirect) {
		super();
		this.path = path;
		this.redirect = redirect;
	}


	@Override
	public ActionForward excute() {
		// TODO Auto-generated method stub
		System.out.println("ListAction");
		return new ActionForward(path, redirect);
	}

}
