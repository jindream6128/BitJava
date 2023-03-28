package Day07_2;

import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;

public class WindowFrame extends WindowFrameAbstract {

	WindowFrameAbstract addapter = new WindowFrameAbstract() {

		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			System.out.println("mouseClicked");
		}
		
		
	};

	public WindowFrame() {
		this.addWindowListener(addapter);
		this.addMouseListener(addapter);
		
		// 여기를 감지하라 this -> 여기서 this는 Frame
		this.setBounds(100, 200, 500, 500);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		WindowFrame w = new WindowFrame();

	}
}
