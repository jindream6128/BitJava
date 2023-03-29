package Day08_4;

public class ElementClass implements Cloneable{
	private int count;
	private String msg;
	
	public ElementClass() {
		super();
	}
	//생성자 만들기 alt shift s o
	public ElementClass(int count, String msg) {
		super();
		this.count = count;
		this.msg = msg;
	}
	
	public void method() {
		ElementClass ec = new ElementClass(100,"class");
		System.out.println(ec);
		try {
			System.out.println(ec.clone());
		}catch(CloneNotSupportedException e ) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "ElementClass [count=" + count + ", msg=" + msg + "]";
	}
	
	public static void main(String[] args) {
		ElementClass e = new ElementClass();
		e.method();
		
	}
	
}
