package Day11;

import java.io.*;

public class ObjectStreamEx {
	private final String PATH ="D:\\testForder\\obj2.txt"; 
	//ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(PATH))) 이건 아무것도아님 걍복사
	public void writeMember() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new PrintStream(new File(PATH)))) {
			oos.writeObject(new Member("BLUE","name","189.9"));	
			System.out.println("Write Object Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void readMember() {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(PATH)))) {
			System.out.println(ois.readObject());
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	
	public static void main(String[] args) {
		ObjectStreamEx o = new ObjectStreamEx();
		o.writeMember();
		o.readMember();
	}
}
