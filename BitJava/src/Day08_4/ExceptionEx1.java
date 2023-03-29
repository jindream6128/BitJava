package Day08_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Vector;

public class ExceptionEx1 extends Object {

	// 연산 잘못하면 나타나는 예외 divide by zero
	public void arithmeticException() {
//		System.out.println((int)(Math.random()*100 %50));
//		
//		Random random = new Random();
//		int rs = random.nextInt(10);
//		System.out.println(rs);
//		System.out.println(random.nextBoolean());

		int[] m = new int[5];
		for (int i = 0; i < m.length; i++) {
			m[i] = (int) (Math.random() * 100);
			int result = 100 / m[i];
			System.out.print(i + " " + m[i] + " ");
		}
	}

	public void numberFormatException(String message) {
		if (message.startsWith("[STONE]")) {
//			System.out.println("Game Start ...");
//			
//			System.out.println(message.substring(message.indexOf(']')+1).split(" ")[0].split("=")[1]);
//			System.out.println(message.substring(message.indexOf(']')+1).split(" ")[1].split("=")[1]);

			int x = Integer.parseInt(message.substring(message.indexOf(']') + 1).split(" ")[0].split("=")[1]);
			int y = Integer.parseInt(message.substring(message.indexOf(']') + 1).split(" ")[1].split("=")[1]);
			
			System.out.println("x값은: " + x);
			System.out.println("y값은: " + y);
		}

		if (message.startsWith("[ROOM]")) {
			System.out.println("Room ......");
			

		}
	}

	public void NullPointerException(int x, int y, int z) {
		String str = null;
//		str = (x+y+z)>=5 && (x+y+z)<=10 ? "Java":"Oracle";		
		if((x+y+z)>=5 && (x+y+z)<=10) {
			str = "java";
		}
		System.out.println(str);
//		System.out.println(str.substring(0)); //nullPointerException
//		String str = null;
//		System.out.println(str.toString());
	}

	public void arrayIndexOutOfBoundsException() {
		int[] m = new int[5];
		for (int i = 0; i <= m.length; i++) {
			try {
				System.out.println("TryStartLine");
				m[i] = 100;
				System.out.println("Data: " + m[i]);
				System.out.println("TryEndLine");

			} catch (ArrayIndexOutOfBoundsException e) {
				// e.printStackTrace();
				System.out.println(e.getMessage());
				System.out.println();

			} finally {
				System.out.println("finally");
			}

		}
	}

	public void stringIndexOutOfBoundsException(String str) {

		System.out.println(str.substring(1, 3));
//		System.out.println(str.substring(5, 3));
//		System.out.println(str.substring(-1, 3));
		
	}
	
	public void cloneNotSupportedException() {
		Vector<String> v = new Vector<String>();
		v.add("딸기");
		v.add("수박");
		System.out.println(v.clone());
	}
	
	public void noSuchElementException() {

		
		ArrayList<Integer> list1 = new ArrayList<Integer>(); //LIST
		HashSet<Integer> hs = new HashSet<Integer>(); //SET
		
		list1.add(10);
		list1.add(20);
		list1.add(40);
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		hs.add(40);
		
		list1.get(0);
		
		//반복자 = Iterator -> 하나의 디자인 패턴ㅈ
		//구조에 상관없이 구조를 품은체 반복자 객체가 만들어진다
		
//		list1.iterator();
//		hs.iterator();
		
		Iterator<Integer> i = list1.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
//		System.out.println(i.next());
//		System.out.println(i.next()); noSuchElementException

		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println();
		for(int k = 0 ; k<list1.size();k++) {
			System.out.println(list1.get(k));
		}
		System.out.println();
		for(int num : list1) {
			System.out.println(num);
		}
		System.out.println();
		
		
		
		Iterator<Integer> itor = hs.iterator();
		while(itor.hasNext()) {
			System.out.println(itor.next());
		}
		
		
	}
	
	public static void main(String[] args) {
		ExceptionEx1 e = new ExceptionEx1();
//		e.arrayIndexOutOfBoundsException();
//		e.arithmeticException();
//		e.numberFormatException("[ROOM] 안녕하세요");
//		e.numberFormatException("[STONE]x=150 y=300");
//		e.NullPointerException(0,1,5);
//		e.stringIndexOutOfBoundsException("abcd");
//		e.cloneNotSupportedException();
		e.noSuchElementException();
	}
}
