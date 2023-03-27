package Day06_0327.obj3;

//extends -> 하는 이유 -> 선조와 후손으로 relation을 맺는거다. 
//추상클래스는 -> 객체를 생성할수 없다. -> 근데 생성자는 있다. 
//추상클래스를 만드는 이유는 -> 확장을 하기 위해서 만드는거다!
//Override를 하던가, 똑같이 추상화 하던가.
public abstract class AbstractSubClass extends AbstractSuperClass {
	public void abstractSubMethod() {};
	
}
