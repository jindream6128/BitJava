package Day07;

import java.util.ArrayList;

import javax.swing.JFrame;

public class WindowEx3 extends JFrame {
	// 여기서 this 는 WindowEx3 이고 WindowEx3 은 JFrame

	// 그냥 private ArrayList<String> list = new ArrayList<String>();
//이렇게 하면 오버라이딩을 못해서 익명객체로 만들어준다.
	private ArrayList<String> list = new ArrayList<String>() {

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "This toString";
		}

	};

	public void actionString() {
//		System.out.println(this.toString());
		System.out.println(list.toString());
	}

//	@Override
//	public String toString() {
//		
//		return "this ToString";
//	}

	public static void main(String[] args) {
		WindowEx3 w = new WindowEx3();
		w.actionString();

	}

}
