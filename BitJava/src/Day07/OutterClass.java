package Day07;
//MemberInner, StaticInner, LocalInner, AnonyMous(익명의)

import javax.swing.JFrame;

public class OutterClass extends JFrame { // Outter Class 
	//Member영역
	
	//Member변수 -> 인스턴스변수와 같은개념 
	//인스턴스 변수가 모여서 인스턴스가 된다 -> 인스턴스 현재 실행중인 값
	
	private int outterValue; //Member변수 or 인스턴스변수
	private int x;
	
	//생성자 
	public OutterClass() {
		System.out.println("OutterClass()");
		x=1000000;
		this.setBounds(100, 200, 300, 400);
		//innerMethod();
	}
	
	//메서드
	private void outterMethod() {
		System.out.println("outterMethod");
		System.out.println("x: "+ x + "  outterValue: " + outterValue);
		System.out.println();
	}
	
	//이너 클래스 -> 접근제한자와 무관하게 Friend개념의 클래스가 필요할때
	//접근 제한자와 상관없이 접근 가능한거 -> Inner클래스
	//Inner클래스랑 상속이랑은 다른 개념this로 다름 
	//생략 가능
	public class Inner{ //Member Inner
		private int innerValue;
		private int x;
		public Inner() {
			System.out.println("Inner()");
			System.out.println();
		}
		
		public void innerMethod() {
//			outterValue = 100; //외부의 OuuterValue
//			this.x = 100; //this .x -> Inner의 x 
			x = 1000;
			OutterClass.this.x = 22222; //이 x는 왜부의 x
			outterValue = 100;
			setBounds(100,200,300,400);
			System.out.println("inner X: " +x);
			System.out.println("inner x (this.x): " + this.x);
			System.out.println("Outter X: " + OutterClass.this.x);
			outterMethod();
		}
	}
	
	public static void main(String[] args) {
		//내부 클래스는 -> 외부가 생성되고 나서 만들어짐 즉 외부없이 존재할수 없음
		//외부클래스는 내부클래스의 접근제한자와 상관없이 접근할수 있다.
		//접근제한자의 상관없이 접근이 가능한건 ->내부에서 외부로
		new OutterClass(); // 외부만 생성 가능
		new OutterClass().new Inner(); //내부는 외부주소. 내부
		OutterClass.Inner inner = new OutterClass().new Inner();
		inner.innerMethod(); //이렇게 접근하기
		//new InnerClass(); 이렇게 안된다.
	}
	
}
