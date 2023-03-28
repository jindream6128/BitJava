package Day07;

public class InstacneMember extends SuperInstacneMember{
	private int x;

	//생성자
	public InstacneMember() {
		this.superValidate();
	}
	
	private void outterMemberMethod() {
		System.out.println("x: "+ x);
	}
	
	//Inner는 InstacneMember이다 (X)
	public class Inner{
		private int x;
		//this = inner inner = object ;
		public Inner(){
			x = 20;
			InstacneMember.this.x = 100; //밖에꺼 가르킬때
//			this.x = 10; //이렇게하면 inner안에 x를 가르치는건데 x가 없다
			outterMemberMethod();
			superValidate();
			Innermethod();
//			superValue = 10;
		}
		public void Innermethod() {
			System.out.println("inner x: "+ x);
		}
	}//Inner
	
	public static void main(String[] args) {
		InstacneMember.Inner inner = new InstacneMember().new Inner();
	}
}//Outer
