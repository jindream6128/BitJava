package Day4.obj1;

//overloading 과정

public class ObjectEx2 {

	public void add(int x) {
		System.out.println("void add(int x) x: "+ x);
	}

	public void add(int x, long y) {
		System.out.println("void add(int x, long y) x: " + x + " " + y);
	}
	
	public void add(long x, int y) {
		System.out.println("void add(long x, int y) x: " + x + " " + y);
	}
	
	public void add(int x, int y) {
		System.out.println("void add(int x, int y) x: " + x + " " + y);
	}
	
//	public void add(int x) {
//		System.out.println("void add(int x) x: "+ x);
//	}
//
//	public void add(short x) {
//		System.out.println("void add(short x) x: " + x);
//	}

	public static void main(String[] args) {
		ObjectEx2 o = new ObjectEx2();
		o.add(10);
		o.add(10,20);
		o.add(10,20L);
		o.add(10L,20);
	}
}
