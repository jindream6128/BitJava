package Day08;
//public > protected > default > private

public class Super {
	public int publicData;
	protected int protectedData; // 후손들만 접근할수도 있지만, 같은패키지에서 접근가능하다
	int defaultData;
	private int privateData;
	
}
