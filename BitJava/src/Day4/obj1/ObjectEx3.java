package Day4.obj1;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ObjectEx3 {
	//?΄λ¦?, ??΄, ?€???Ό, ?±λ³?, μ§??­, ? , ??΄?κ·?, ??΄λ³? ? ? ¬, ?±?¨λ³? ?Έ??
	
	StringTokenizer st;
	String[] member = {"κ³΅μ??#961210-1010678#051)234-8910",
						"κΉ?κ°??#990119-2010678#02)934-8910",
						"κΉ?λ―Όμ?#580219-1010978#031)734-8910",
						"κΉ?λ³ν#880323-1910678#02)634-8910",
						"λ°κ·λ―?#960210-1010678#051)234-8910"};
	//member.length = 5
	//?΄λ¦? κ°μ²΄
	String[] name = new String[member.length];
	
	//μ£Όλ?Όλ²?Έ κ°μ²΄
	String[] ssn = new String[member.length];
	
	//? ?λ²νΈ κ°μ²΄
	String[] pn = new String[member.length];

	//?κ°μ© μͺΌκ°? name κ°μ²΄? ?£κΈ?
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
	
	//?΄λ¦? 
	public void name(String[] m) {
		
	}
	//??΄
	
	//?€? ??Ό?Έμ§?
	
	//?±λ³?
	
	//μ§??­
	
	//? 
	
	//??΄?κ·?
	
	//??΄λ³? ? ? ¬
	
	//?±?¨λ³? ?Έ??
	public static void main(String[] args) {
			ObjectEx3 o = new ObjectEx3();
			for(String i : o.name) {
				System.out.println(i);
			}
	}
}


/*
 * //2μ°¨μ λ°°μ΄ //?μ€? ?½κ³? -> #? κΈ°μ??Όλ‘? λ°°μ΄? ?£?΄?Ό // #? κΈ°μ??Όλ‘? 3κ°? μͺΌκ°κΈ? // [5][3] -> String
 * String[][] arr = new String[5][3];
 * 
 * //μͺΌκ°? λ°°μ΄? ?£κΈ? public void tc(String[] m){ for(int i=0; i<member.length;i++) {
 * String tmp = member[i]; arr[i] = tmp.split("#"); } }
 */