package Day08_2;
//import보다 패키지가 먼저다

import java.io.BufferedOutputStream;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;
import Day08.Super;
//package Day08_2; 가 항상 import 보다 먼저 와야한다.

public class InstanceClass {
	public InstanceClass() { //package가 다른 일반 영역
		Super s = new Super(); //Super 도 여러개 있을때 어디서 가져올지 package까지 import해야함
		s.publicData=10;
		ArrayList<Integer> arr = new ArrayList<>();
		Vector<String> vec = new Vector<>();
		Stack<String> st =new Stack<String>();
		BufferedOutputStream bs;
	}
}
