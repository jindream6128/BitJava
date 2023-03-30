package Study;

public class MemoryAddress {
	public static void main(String[] args) {
//		String s1 = "str";
//		String s2 = "str";
//		System.out.println("s1 == s2 인가");
//		System.out.println(s1==s2);
//		System.out.println();
		
		//메모리값 확인
//		System.identityHashCode()
//		
//		System.out.println("s1의 메모리 값은?" + System.identityHashCode(s1));
//		System.out.println("s2의 메모리 값은?" + System.identityHashCode(s2));
//		System.out.println();
//		
//		String s3 = new String("str");
//		System.out.println("s1 == s3 인가");
//		System.out.println(s1==s3);
//		
//		System.out.println();
//		System.out.println("s3의 메모리 값은?" + System.identityHashCode(s3));
//		
//		String s4 = new String("strr");
//		String s5 = "strr";
//		System.out.println("s4의 메모리 값은?" + System.identityHashCode(s4));
//		System.out.println();
//		
//		System.out.println("s1의 메모리값은? "+System.identityHashCode(s1));
//		s1 += "r";
//		System.out.println(s1);
//		System.out.println(s4);
//		System.out.println(s5);
//		System.out.println("s3 == s4 인가?");
//		System.out.println(s1==s4);
//		System.out.println("s1 == s5 인가?");
//		System.out.println(s1==s5);
//		
//		System.out.println("s1의 메모리값은? "+System.identityHashCode(s1));
//		System.out.println("s4의 메모리값은? "+System.identityHashCode(s4));
//		System.out.println("s5의 메모리값은? "+System.identityHashCode(s5));
		
	
		String str1 = "str";
		String str2 = "str";
		System.out.println("str1 == str2");
		System.out.println(str1==str2); //true
		
		String str3 = new String("str"); 
		System.out.println("s1, s3의 주소값");
		System.out.println("str1의 주소값 "+System.identityHashCode(str1));
		System.out.println("str3의 주소값 "+System.identityHashCode(str3));
		
		String str4 = "strr";
		String str5 = new String("strr");
		
		System.out.println("str4의 주소값 "+System.identityHashCode(str4));
		System.out.println("str5의 주소값 "+System.identityHashCode(str5));
		
		str1 += "r";
		System.out.println("str1 의 값");
		System.out.println(str1);
		
		System.out.println();
		
		System.out.println("str1의 주소값 "+System.identityHashCode(str1)); //힙
		System.out.println("str4의 주소값 "+System.identityHashCode(str4)); //힙의 String pool
 		System.out.println("str5의 주소값 "+System.identityHashCode(str5)); //힙
 		
 		System.out.println(str1.hashCode());
 		System.out.println(str4.hashCode()); //해시코드란?
 		System.out.println(str5.hashCode());//객체를 식별하는 하나의 고유 정수값 
 		
 		System.out.println(str1 == str4); //hashcode를 비교하는게 아니라  메모리 값을 비교하는것
		
	}

}
