package Day04.obj1;

//?��?��?�� ?��?��?��?��?�� keyword
//?��?��?�� 
//ObjectEx1 ?��?��?�� ?��?��
//new�? ?��?��?�� ?��?��
//class -> ?��계도 -> 묶음 -> ?��?���?, 기능?�� �? 묶음.
//?��?��?�� -> 메모리할?�� -> ?��?��?��?�� �??�� 초기?��
//객체?�� -> ?���? 그자�? -> 객체?�� ?��?��?���? ?��?��?�� 만들?��진다. 


//abstract?? interface?�� 차이 ?��?�� 중요!!!!!!!!

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
