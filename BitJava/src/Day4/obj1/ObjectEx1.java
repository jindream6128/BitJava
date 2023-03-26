package Day4.obj1;

//?˜ˆ?•½?–´ ? •?•´? ¸?ˆ?Š” keyword
//?´?˜?Š¤ 
//ObjectEx1 ?´?˜?Š¤ ? •?˜
//newë¥? ?†µ?•´?„œ ?ƒ?„±
//class -> ?„¤ê³„ë„ -> ë¬¶ìŒ -> ?†?„±ê³?, ê¸°ëŠ¥?„ ì§? ë¬¶ìŒ.
//?ƒ?„±? -> ë©”ëª¨ë¦¬í• ?‹¹ -> ?¸?Š¤?„´?Š¤ ë³??ˆ˜ ì´ˆê¸°?™”
//ê°ì²´?Š” -> ?‚¬ë¬? ê·¸ìì²? -> ê°ì²´?Š” ?´?˜?Š¤ë¥? ?†µ?•´?„œ ë§Œë“¤?–´ì§„ë‹¤. 


//abstract?? interface?˜ ì°¨ì´ ? œ?¼ ì¤‘ìš”!!!!!!!!

public class ObjectEx1 {
	private char[] value;
	
	public ObjectEx1(char[] value) {
		this.value = value;
	}
	
	public char charAt(int index) {
		if(index <0 || index>value.length-1) {
			throw new StringIndexOutOfBoundsException();
		}
		return this.value[index];
	}
	
	public boolean equals(Object obj) {
		if(this == obj) return true;
		
		if(obj instanceof String) {
			char[] tmp = ((String)(obj)).toCharArray();
			if(tmp.length != this.value.length) return false;
			for(int i = 0;i<tmp.length;i++) {
				if(tmp[i]!=value[i]) return false;
			}
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		String s1 = new String("abc".toCharArray());
		String s2 = new String("def".toCharArray());
		
		System.out.println(s2.equals(s1));
	}
	
	
}
