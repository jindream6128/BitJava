package Day5;

public class ObjectEx1 {
	//static?? ?•­?ƒ ë©”ëª¨ë¦¬ì— ë¨¼ì? ?˜¬?¼?˜¤?‹ˆê¹? static ë¸”ëŸ­?œ¼ë¡? ?ƒ?„±?ë¥? ?ƒ?„±?•œ?‹¤.
	private static final int cnt;
	
	static {
		cnt = 90;
	}
		
	public static void main(String args[]) {
		ObjectEx1 o = new ObjectEx1();
		System.out.println(o.cnt);
	}

}
