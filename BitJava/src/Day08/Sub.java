package Day08;

public class Sub extends Super {
	
	//생성자 , Super의 후손 영역
	public Sub() {//후손 생성자 영역
		this.publicData=10;
		this.protectedData=10;
		this.defaultData=10;
		//this.privateData = 10;
	}
	
}
