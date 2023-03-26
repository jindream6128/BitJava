package Day4.obj1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ObjectEx3 {
	//?´ë¦?, ?‚˜?´, ?˜¤?Š˜?ƒ?¼, ?„±ë³?, ì§??—­, ? , ?‚˜?´?‰ê·?, ?‚˜?´ë³? ? •? ¬, ?„±?”¨ë³? ?¸?›?ˆ˜
	
	StringTokenizer st;
	String[] member = {"ê³µì??˜„#961210-1010678#051)234-8910",
						"ê¹?ê°??˜#990119-2010678#02)934-8910",
						"ê¹?ë¯¼ì?#580219-1010978#031)734-8910",
						"ê¹?ë³‘í›ˆ#880323-1910678#02)634-8910",
						"ë°•ê·œë¯?#960210-1010678#051)234-8910"};
	//member.length = 5
	//?´ë¦? ê°ì²´
	String[] name = new String[member.length];
	
	//ì£¼ë?¼ë²ˆ?˜¸ ê°ì²´
	String[] ssn = new String[member.length];
	
	//? „?™”ë²ˆí˜¸ ê°ì²´
	String[] pn = new String[member.length];

	//?•œê°œì”© ìª¼ê°œ?„œ name ê°ì²´?— ?„£ê¸?
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
	
	//?´ë¦? 
	public void name(String[] m) {
		
	}
	//?‚˜?´
	
	//?˜¤?Š˜ ?ƒ?¼?¸ì§?
	
	//?„±ë³?
	
	//ì§??—­
	
	//? 
	
	//?‚˜?´?‰ê·?
	
	//?‚˜?´ë³? ? •? ¬
	
	//?„±?”¨ë³? ?¸?›?ˆ˜
	public static void main(String[] args) {
			ObjectEx3 o = new ObjectEx3();
			for(String i : o.name) {
				System.out.println(i);
			}
	}
}


/*
 * //2ì°¨ì› ë°°ì—´ //?•œì¤? ?½ê³? -> #?„ ê¸°ì??œ¼ë¡? ë°°ì—´?— ?„£?–´?¼ // #?„ ê¸°ì??œ¼ë¡? 3ê°? ìª¼ê°œê¸? // [5][3] -> String
 * String[][] arr = new String[5][3];
 * 
 * //ìª¼ê°œ?„œ ë°°ì—´?— ?„£ê¸? public void tc(String[] m){ for(int i=0; i<member.length;i++) {
 * String tmp = member[i]; arr[i] = tmp.split("#"); } }
 */