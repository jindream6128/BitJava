package Day11;

import java.io.*;

public class ObjectStreamEx {
	private final String PATH ="D:\\testForder\\obj5.txt"; 

	public void writeMember() {
		try(ObjectOutputStream oos = new ObjectOutputStream(new PrintStream(new File(PATH)))) {
			oos.writeObject(new Member("BLUE","name","189.9"));	
			System.out.println("Write Object Success");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(PATH),false))) {
//			oos.writeObject(new Member("Bule","name","123.123"));
//			System.out.println("write objcet");
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
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
