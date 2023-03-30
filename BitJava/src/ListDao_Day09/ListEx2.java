package ListDao_Day09;

import java.util.ArrayList;
import java.util.Iterator;

public class ListEx2 {
	public void listProcess1() {
		ArrayList<String> list1 = new ArrayList<String>(10);
		// 순차 -> 선형 -> 인덱스로 구분한다 데이터를
		list1.add("지현");
		list1.add("진근");
		list1.add("경민");
		list1.add("가영");
	
		
		//Iterator도 하나의 패턴이다. 노드상관없이 반복되는거 하나씩 객체를 만든다 
		Iterator<String> i = list1.iterator();
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		System.out.println(i.next());
		
//		list1.remove;
		
//		System.out.println(list1.toString());
	}

	public static void main(String[] args) {
		ListEx2 list = new ListEx2();
		list.listProcess1();
	}
}
