package Day07_2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowFrame2 extends Frame {
	private Pan pan = new Pan(); //외부는 내부를 가질수 없으므로 외부에서 그냥 내부를 가져버린다
	
	public WindowFrame2() {
		this.add(pan);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.out.println("widnowClosing");
				System.exit(0);
			}
		});
		
		this.setUndecorated(true);
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0, d.width, d.height);
		this.setVisible(true);
		
	}
	//Member innner Class
	public class Pan extends Canvas{
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();

		public Pan() {
			this.setBackground(Color.GREEN);
		}

		@Override
		public void paint(Graphics g) {
			
			for(int i = 1; i <d.height;i++ ) g.drawRect(10*i, 10*i, 60*i, 60*i);
			
		}

		@Override
		public void update(Graphics g) {

		}
		
	}
	
	public static void main(String[] args) {
		new WindowFrame2();
	}

}
