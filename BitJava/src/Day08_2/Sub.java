package Day08_2;

//같은 패키지가 아니라면 import 해주어야 한다
import Day08.Super;

public class Sub extends Super {
	//package가 다른 후손 영역
	public Sub() {
		this.publicData = 10;
		this.protectedData=10;
	}

}
