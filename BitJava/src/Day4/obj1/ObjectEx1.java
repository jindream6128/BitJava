package Day4.obj1;

//??½?΄ ? ?΄? Έ?? keyword
//?΄??€ 
//ObjectEx1 ?΄??€ ? ?
//newλ₯? ?΅?΄? ??±
//class -> ?€κ³λ -> λ¬Άμ -> ??±κ³?, κΈ°λ₯? μ§? λ¬Άμ.
//??±? -> λ©λͺ¨λ¦¬ν ?Ή -> ?Έ?€?΄?€ λ³?? μ΄κΈ°?
//κ°μ²΄? -> ?¬λ¬? κ·Έμμ²? -> κ°μ²΄? ?΄??€λ₯? ?΅?΄? λ§λ€?΄μ§λ€. 


//abstract?? interface? μ°¨μ΄ ? ?Ό μ€μ!!!!!!!!

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
