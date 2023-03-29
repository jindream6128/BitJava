package Day04.obj1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ObjectEx3 {
	//?���?, ?��?��, ?��?��?��?��, ?���?, �??��, ?��, ?��?��?���?, ?��?���? ?��?��, ?��?���? ?��?��?��
	
	StringTokenizer st;
	String[] member = {"공�??��#961210-1010678#051)234-8910",
						"�?�??��#990119-2010678#02)934-8910",
						"�?민�?#580219-1010978#031)734-8910",
						"�?병훈#880323-1910678#02)634-8910",
						"박규�?#960210-1010678#051)234-8910"};
	//member.length = 5
	//?���? 객체
	String[] name = new String[member.length];
	
	//주�?�번?�� 객체
	String[] ssn = new String[member.length];
	
	//?��?��번호 객체
	String[] pn = new String[member.length];

	//?��개씩 쪼개?�� name 객체?�� ?���?
	public void tc(String[] m) {
		ObjectEx3 o = new ObjectEx3();
		for(int i= 0 ; i<member.length;i++) {
			st = new StringTokenizer(o.member[i], "#");
			System.out.println(st);
			name[i] = st.nextToken();
			ssn[i]=st.nextToken();
			pn[i]=st.nextToken();
		}
	}
	
	//?���? 
	public void name(String[] m) {
		
	}
	//?��?��
	
	//?��?�� ?��?��?���?
	
	//?���?
	
	//�??��
	
	//?��
	
	//?��?��?���?
	
	//?��?���? ?��?��
	
	//?��?���? ?��?��?��
	public static void main(String[] args) {
			ObjectEx3 o = new ObjectEx3();
			for(String i : o.name) {
				System.out.println(i);
			}
	}
}


/*
 * //2차원 배열 //?���? ?���? -> #?�� 기�??���? 배열?�� ?��?��?�� // #?�� 기�??���? 3�? 쪼개�? // [5][3] -> String
 * String[][] arr = new String[5][3];
 * 
 * //쪼개?�� 배열?�� ?���? public void tc(String[] m){ for(int i=0; i<member.length;i++) {
 * String tmp = member[i]; arr[i] = tmp.split("#"); } }
 */