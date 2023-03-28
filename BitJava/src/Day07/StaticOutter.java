package Day07;

import Day07.StaticOutter.StaticInner;

public class StaticOutter {
	private static int outterStaticValue; //런타임시 로딩할때 먼저 만들어짐
	private int instacneOutterValue; //new할때 메모리 힙에 만들어짐
	
	//public static class StaticInner 를 해버리면 이너 내부의static이 가능하고,
	//outter클래스의 static변수에 접근이 가능하다
	public static class StaticInner{
		//Inner클래스는 생성 될수도 있고, 안될수도 있으니까 -> inner안에 static이 있으면
		//inner클래스 자체가 static이 되어야 한다.
		private int innerValue;//inner클래스의 instance value
		
		public StaticInner() { //inner클래스의 생성자
			
		}
		
		//내부의 inner가 생성되야지만 만들어질수있다.
		public void innerMehotd() {
			int value; //초기값은 쓰레기값
			//static int value; -> 는 안된다 why?
			//static은 맨처음에 만들어지고, 가장나중에 사라지는데 
			//저렇게 만들어보리면 inner클래스가 안만들어질수도 있고, 메서드가 호출이 안될수도 있다.
		}
		
		
	}//inner
	
	public static void main(String[] args) {
		StaticOutter.StaticInner inner =new StaticOutter.StaticInner();
		
		inner.innerMehotd();
	}
	
}//outter
