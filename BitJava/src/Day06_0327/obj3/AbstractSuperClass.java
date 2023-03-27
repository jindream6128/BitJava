package Day06_0327.obj3;

//추상 메서드가 있으면 클래스도 미완성이어야 한다.
// -> 추상클래스는 확장을 위한거기 때문에 final을 사용하면 안된다.
public abstract class AbstractSuperClass {
	
	public void abstractSuperMethod() {
		System.out.println("abstractSuperMethod");
	}
	//구현부가 없어서 컴파일 에러가 뜬다. -> 지금은 일반 메서드를 쓰다가 말았다고 생각
    //public void abstractMethodSP();
	
	//이렇게 적으면 된다 -> abstract 로 적으면 추상메서드라 컴파일러가 인식한다
	//추상 메서드 -> 미완성 메서드
	public abstract void abstractMethodSP();
	
	public AbstractSuperClass() {
		
	}; 
	
}
