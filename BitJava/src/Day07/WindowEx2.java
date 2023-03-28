package Day07;

import javax.swing.JFrame;

public class WindowEx2 extends JFrame {
	MouseAdapterEx instance;
	private int x;

	public WindowEx2() {
		instance = new MouseAdapterEx() { //내부 클래스
			
			@Override
			public void mouseClick() {
				
				x=100;
				
			}
		}; //Anonymous 영역
		

	}
	
}
