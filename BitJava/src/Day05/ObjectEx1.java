package Day05;

public class ObjectEx1 {
	//static?? ?��?�� 메모리에 먼�? ?��?��?��?���? static 블럭?���? ?��?��?���? ?��?��?��?��.
	private static final int cnt;
	
	static {
		cnt = 90;
	}
		
	public static void main(String args[]) {
		ObjectEx1 o = new ObjectEx1();
		System.out.println(o.cnt);
	}

}
