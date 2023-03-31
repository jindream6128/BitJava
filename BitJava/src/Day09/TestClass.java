package Day09;

public class TestClass {
	
	int v1 = 3;
	public TestClass() {
		System.out.println(v1);
		//System.out.println(Inner.v2);
	}
	
	class Inner {
		
		
		int v1 = 2;
		int v2 = 4;
		
		public Inner() {
			System.out.print(this.v1);
			System.out.println(TestClass.this.v1);
		}
	}
}
