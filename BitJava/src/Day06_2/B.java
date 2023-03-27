package Day06_2;

public class B extends A{
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Btest");
		super.test();
	}
	
	public static void main(String[] args) {
		B b = new B();
		b.test();
	}
}
