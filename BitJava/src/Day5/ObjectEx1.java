package Day5;

public class ObjectEx1 {
	//static?? ?­? λ©λͺ¨λ¦¬μ λ¨Όμ? ?¬?Ό?€?κΉ? static λΈλ­?Όλ‘? ??±?λ₯? ??±??€.
	private static final int cnt;
	
	static {
		cnt = 90;
	}
		
	public static void main(String args[]) {
		ObjectEx1 o = new ObjectEx1();
		System.out.println(o.cnt);
	}

}
