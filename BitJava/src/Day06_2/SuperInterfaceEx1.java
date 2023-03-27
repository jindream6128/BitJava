package Day06_2;

public interface SuperInterfaceEx1 {
	//static 메소드는 오버라이딩이 금지되어 있다. 
	public void interAbstract();
	
	public void test1();
	
//	public void test2() {
//		
//	};
	//구현부가 있더라도 static은 JVM에 로딩될때 올라가는가기 때문에 가능하다
	public static void test3() {};
	
	
}
