package Day07_2;

import java.awt.AWTEvent;
import java.awt.AWTException;
import java.awt.AWTKeyStroke;
import java.awt.BufferCapabilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.Window;
import java.awt.Window.Type;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;
import java.awt.im.InputContext;
import java.awt.image.BufferStrategy;
import java.beans.PropertyChangeListener;
import java.util.EventListener;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class WindowFrameAbstract extends Frame implements WindowListener, MouseListener, KeyListener  {

	@Override
	public List<Image> getIconImages() {
		// TODO Auto-generated method stub
		return super.getIconImages();
	}

	@Override
	public synchronized void setIconImages(List<? extends Image> icons) {
		// TODO Auto-generated method stub
		super.setIconImages(icons);
	}

	@Override
	public void pack() {
		// TODO Auto-generated method stub
		super.pack();
	}

	@Override
	public void setMinimumSize(Dimension minimumSize) {
		// TODO Auto-generated method stub
		super.setMinimumSize(minimumSize);
	}

	@Override
	public void setSize(Dimension d) {
		// TODO Auto-generated method stub
		super.setSize(d);
	}

	@Override
	public void setSize(int width, int height) {
		// TODO Auto-generated method stub
		super.setSize(width, height);
	}

	@Override
	public void setLocation(int x, int y) {
		// TODO Auto-generated method stub
		super.setLocation(x, y);
	}

	@Override
	public void setLocation(Point p) {
		// TODO Auto-generated method stub
		super.setLocation(p);
	}

	@Override
	public void reshape(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.reshape(x, y, width, height);
	}

	@Override
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		super.setVisible(b);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		super.show();
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		super.hide();
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		super.dispose();
	}

	@Override
	public void toFront() {
		// TODO Auto-generated method stub
		super.toFront();
	}

	@Override
	public void toBack() {
		// TODO Auto-generated method stub
		super.toBack();
	}

	@Override
	public Toolkit getToolkit() {
		// TODO Auto-generated method stub
		return super.getToolkit();
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return super.getLocale();
	}

	@Override
	public InputContext getInputContext() {
		// TODO Auto-generated method stub
		return super.getInputContext();
	}

	@Override
	public void setCursor(Cursor cursor) {
		// TODO Auto-generated method stub
		super.setCursor(cursor);
	}

	@Override
	public Window getOwner() {
		// TODO Auto-generated method stub
		return super.getOwner();
	}

	@Override
	public Window[] getOwnedWindows() {
		// TODO Auto-generated method stub
		return super.getOwnedWindows();
	}

	@Override
	public void setModalExclusionType(ModalExclusionType exclusionType) {
		// TODO Auto-generated method stub
		super.setModalExclusionType(exclusionType);
	}

	@Override
	public ModalExclusionType getModalExclusionType() {
		// TODO Auto-generated method stub
		return super.getModalExclusionType();
	}

	@Override
	public synchronized void addWindowListener(WindowListener l) {
		// TODO Auto-generated method stub
		super.addWindowListener(l);
	}

	@Override
	public synchronized void addWindowStateListener(WindowStateListener l) {
		// TODO Auto-generated method stub
		super.addWindowStateListener(l);
	}

	@Override
	public synchronized void addWindowFocusListener(WindowFocusListener l) {
		// TODO Auto-generated method stub
		super.addWindowFocusListener(l);
	}

	@Override
	public synchronized void removeWindowListener(WindowListener l) {
		// TODO Auto-generated method stub
		super.removeWindowListener(l);
	}

	@Override
	public synchronized void removeWindowStateListener(WindowStateListener l) {
		// TODO Auto-generated method stub
		super.removeWindowStateListener(l);
	}

	@Override
	public synchronized void removeWindowFocusListener(WindowFocusListener l) {
		// TODO Auto-generated method stub
		super.removeWindowFocusListener(l);
	}

	@Override
	public synchronized WindowListener[] getWindowListeners() {
		// TODO Auto-generated method stub
		return super.getWindowListeners();
	}

	@Override
	public synchronized WindowFocusListener[] getWindowFocusListeners() {
		// TODO Auto-generated method stub
		return super.getWindowFocusListeners();
	}

	@Override
	public synchronized WindowStateListener[] getWindowStateListeners() {
		// TODO Auto-generated method stub
		return super.getWindowStateListeners();
	}

	@Override
	public <T extends EventListener> T[] getListeners(Class<T> listenerType) {
		// TODO Auto-generated method stub
		return super.getListeners(listenerType);
	}

	@Override
	protected void processEvent(AWTEvent e) {
		// TODO Auto-generated method stub
		super.processEvent(e);
	}

	@Override
	protected void processWindowEvent(WindowEvent e) {
		// TODO Auto-generated method stub
		super.processWindowEvent(e);
	}

	@Override
	protected void processWindowFocusEvent(WindowEvent e) {
		// TODO Auto-generated method stub
		super.processWindowFocusEvent(e);
	}

	@Override
	protected void processWindowStateEvent(WindowEvent e) {
		// TODO Auto-generated method stub
		super.processWindowStateEvent(e);
	}

	@Override
	public boolean isAlwaysOnTopSupported() {
		// TODO Auto-generated method stub
		return super.isAlwaysOnTopSupported();
	}

	@Override
	public Component getFocusOwner() {
		// TODO Auto-generated method stub
		return super.getFocusOwner();
	}

	@Override
	public Component getMostRecentFocusOwner() {
		// TODO Auto-generated method stub
		return super.getMostRecentFocusOwner();
	}

	@Override
	public boolean isActive() {
		// TODO Auto-generated method stub
		return super.isActive();
	}

	@Override
	public boolean isFocused() {
		// TODO Auto-generated method stub
		return super.isFocused();
	}

	@Override
	public Set<AWTKeyStroke> getFocusTraversalKeys(int id) {
		// TODO Auto-generated method stub
		return super.getFocusTraversalKeys(id);
	}

	@Override
	public boolean getFocusableWindowState() {
		// TODO Auto-generated method stub
		return super.getFocusableWindowState();
	}

	@Override
	public void setFocusableWindowState(boolean focusableWindowState) {
		// TODO Auto-generated method stub
		super.setFocusableWindowState(focusableWindowState);
	}

	@Override
	public void setAutoRequestFocus(boolean autoRequestFocus) {
		// TODO Auto-generated method stub
		super.setAutoRequestFocus(autoRequestFocus);
	}

	@Override
	public boolean isAutoRequestFocus() {
		// TODO Auto-generated method stub
		return super.isAutoRequestFocus();
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.addPropertyChangeListener(listener);
	}

	@Override
	public void addPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		// TODO Auto-generated method stub
		super.addPropertyChangeListener(propertyName, listener);
	}

	@Override
	public boolean isValidateRoot() {
		// TODO Auto-generated method stub
		return super.isValidateRoot();
	}

	@Override
	public boolean postEvent(Event e) {
		// TODO Auto-generated method stub
		return super.postEvent(e);
	}

	@Override
	public boolean isShowing() {
		// TODO Auto-generated method stub
		return super.isShowing();
	}

	@Override
	public void applyResourceBundle(ResourceBundle rb) {
		// TODO Auto-generated method stub
		super.applyResourceBundle(rb);
	}

	@Override
	public void applyResourceBundle(String rbName) {
		// TODO Auto-generated method stub
		super.applyResourceBundle(rbName);
	}

	@Override
	public void setType(Type type) {
		// TODO Auto-generated method stub
		super.setType(type);
	}

	@Override
	public Type getType() {
		// TODO Auto-generated method stub
		return super.getType();
	}

	@Override
	public void setLocationRelativeTo(Component c) {
		// TODO Auto-generated method stub
		super.setLocationRelativeTo(c);
	}

	@Override
	public void createBufferStrategy(int numBuffers) {
		// TODO Auto-generated method stub
		super.createBufferStrategy(numBuffers);
	}

	@Override
	public void createBufferStrategy(int numBuffers, BufferCapabilities caps) throws AWTException {
		// TODO Auto-generated method stub
		super.createBufferStrategy(numBuffers, caps);
	}

	@Override
	public BufferStrategy getBufferStrategy() {
		// TODO Auto-generated method stub
		return super.getBufferStrategy();
	}

	@Override
	public void setLocationByPlatform(boolean locationByPlatform) {
		// TODO Auto-generated method stub
		super.setLocationByPlatform(locationByPlatform);
	}

	@Override
	public boolean isLocationByPlatform() {
		// TODO Auto-generated method stub
		return super.isLocationByPlatform();
	}

	@Override
	public void setBounds(int x, int y, int width, int height) {
		// TODO Auto-generated method stub
		super.setBounds(x, y, width, height);
	}

	@Override
	public void setBounds(Rectangle r) {
		// TODO Auto-generated method stub
		super.setBounds(r);
	}

	@Override
	public float getOpacity() {
		// TODO Auto-generated method stub
		return super.getOpacity();
	}

	@Override
	public Shape getShape() {
		// TODO Auto-generated method stub
		return super.getShape();
	}

	@Override
	public Color getBackground() {
		// TODO Auto-generated method stub
		return super.getBackground();
	}

	@Override
	public boolean isOpaque() {
		// TODO Auto-generated method stub
		return super.isOpaque();
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
	}

	/* -----------------keyListener---------------- */
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	/*-------------------MouseListener----------------------*/
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	/*--------------------WindowListener--------------------*/
	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
