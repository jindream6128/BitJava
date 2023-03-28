package Day07;

import javax.swing.JButton;
import javax.swing.JPanel;

//Member Inner, StaticInner, LocalInner, AnonyMous
public class LocalOutter extends JPanel {
	//this -> LocalOutter / LocalOutter -> JPanel / this -> JPanel
	private int value; // 인스턴스 변수
	private static final int DATA = 100;
	
	public class memberInner{
		private int innerValue;	
		public void MemberInner() {
			System.out.println(DATA+1000);
		};
	}
	
	public void method1() {
		int localValue=10;
		final int FINALVALUE=999;
		class LocalInner extends JButton{
			public LocalInner() {
				System.out.println(FINALVALUE);
				value = 10;
				//this.value = 10; -> 접근불가
				System.out.println(DATA);
				//여기서 일반 지역 변수는 가지고 올순 없다. 
				//근데 상수는 읽어올수 있다.
				
			} //LocalInner의 생성자 영역
			public void showLocal() {
				value =  30;
				//localValue = 30; -> 지역변수로는 접근이 불가능하다.
			}
		}
		LocalInner in = new LocalInner();
	}
	
	
	public static void main(String[] args) {
		LocalOutter local = new LocalOutter();
		local.method1();

		LocalOutter.memberInner test = local.new memberInner();
		test.MemberInner();
	}
}
