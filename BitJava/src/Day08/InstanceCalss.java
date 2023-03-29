package Day08;

public class InstanceCalss {
	//같은 패키지인데, 상속받지 않고 있는곳
	public InstanceCalss() {
		Super s= new Super();
		s.publicData = 10;
		s.protectedData=10;
		s.defaultData=10;
//		s.privateData = 10;
		
		
	}
	
}
