package ListDao_Day09;

import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.Vector;

public class ListEx3 {

	public void listEx1() {
//		Vector<Integer> list = new Vector<Integer>();
//		list.add(0,10);
//		list.add(1,13);

//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//
//		for (int j = 0; j < arr.length; j++) {
//			list.add(j, arr[j]);
//		}
//		for (int k = 0; k < list.size(); k++) {
//			System.out.println(list.elementAt(k));
//		}
//		
//		Iterator<Integer> ir =list.iterator();
//		while(ir.hasNext()) {
//			System.out.println(ir.next());
//		}
//		System.out.println("-------------------------");
//		
//		Enumeration<Integer> e = list.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//		}
		
		
//		StringTokenizer st = new StringTokenizer("Java oracle mysql servlet","m");
//		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
		}
		
//	}
	
	public void listEx2() {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.add(10);
		stack.add(20);
		stack.add(10);
		stack.add(40);
		stack.add(30);
//		System.out.println(stack.pop());
//		System.out.println(stack.peek());
		System.out.println(stack.search(40));
		
	}

	public static void main(String[] args) {
//		ArrayList<String> list;
//		LinkedList<String> linkedlist;
//		Stack stack;
		ListEx3 list = new ListEx3();
		list.listEx2();
	}
}
