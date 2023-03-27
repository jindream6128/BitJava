package Day06_0327.obj3;


//완전한 추상클래스
public interface InterfaceEx1{
	//근데 static은 가능하다. 새로운 객체를 생성하진 못한다.

	//여기는 상수만 만들어진다
	final static int DATA=100;
	//구현 메서드는 못온다 -> static 은 가능
	//public static void showInterEx1() {	}
	
	//final static 을 숨기고 있다.
	public abstract void showInterEs1(); 
	
	
	
}
