package Day06_0327.obj3;

//interface 속성 + 기능 -> 속성은 static final 기능은 static
//구현 못하는 친구한테 구현하라고 하면 안된다. 구현은 class에서
//인터페이스끼리는 연결은 extends를 한다. 
public interface InterfaceEx2 extends InterfaceEx1 {
	//interface 이므로 abstract로 안써도 된다.
	public abstract void interfaceEx2Method();
	
	//jdk 8.0 부터 default가 들어간다
	//jdk 8.0 부터 default에서 구현 메서드를 쓰지만 사용하지 않는다.
	//default를 쓰는 이유 -> 인터페이스를 사용할떄 그럼 인터페이스에 있는걸 전부 Override해서
	//사용해야 한다. 그래서 default 라는 메서드를 사용해서 그런걸 방지한다.
	public default void showDefaultMethod() {
	
	}
	
}
