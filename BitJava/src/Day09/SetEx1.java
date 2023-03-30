package Day09;

import java.util.HashSet;
import java.util.Iterator;

public class SetEx1 {
	public void setProcess1() {
		String[] lesson = {"Java", "DataBase", "Servlet", "Spring", "Css", "Java", "Css"};
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();

		for(int i =0;i<lesson.length;i++) {
			if(!set1.add(lesson[i])) {
				set2.add(lesson[i]);
			}
		}
		
//		for(String str : set1) {
//			System.out.print(str+ " ");
//		}
		
		Iterator<String> i = set1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println();
		
		HashSet<String> set3 = (HashSet<String>) set2.clone();
		
//		System.out.println(set3);
//		System.out.println(set2.contains("Java"));
//		System.out.println(set2.contains(new String("Java")));
	}
	public static void main(String[] args) {
		SetEx1 s = new SetEx1();
		
		s.setProcess1();
			
		
	}
}
