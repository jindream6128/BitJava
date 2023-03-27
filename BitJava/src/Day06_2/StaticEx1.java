package Day06_2;

public class StaticEx1 {
	static int data= 100000;	
	//인스턴스 메서드
	public void show() {
		System.out.println("instanceshow");
	}
	//static은 컴파일시에 만들어진다. 
	public static void staticShow() {
		System.out.println("staticShow");
	}
	
	public static void main(String[] agrs) {
		StaticEx1 s1 = new StaticEx1();
		s1.show();
		staticShow();
		StaticEx1.data = 10000000;
		System.out.println(StaticEx1.data);
	}
	
}
