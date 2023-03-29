package Day08_4;

public class StudyExample {
	
	public static void main(String[] args) {
		String str1 = "str";
		String str2 = "str";
		System.out.println(str1==str2);
		
		str1 += "r";
		System.out.println(str1);
		String str3 = "strr";
		
		System.out.println(str1);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		System.out.println();
		
		System.out.println(str1.hashCode());
		System.out.println(str3.hashCode());
	}
}

