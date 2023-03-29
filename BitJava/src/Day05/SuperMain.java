package Day05;

public class SuperMain {
	public static void main(String[] args) {
//		SuperClass sp = new SuperClass()
		//SubClass1 sc1 = new SubClass1(); Subclass1(Object())
		
//		SubClass2 sc2 = new SubClass2(); //Subclass2(SuperClass(Object( )))
//		SubClass3 sc3 = new SubClass3();
	
		//?��?��게는 그냥 ?��?��?��?��.
//		SubClass2 sc2 = (SubClass2)new SuperClass(); //SuperCalss(Object())
//		sc2.actionProcess();

//		SuperClass sp = (SuperClass)new SubClass1(); //UPCASE SubClass1(SuperClass(Object()))
//		sp.actionProcess();
//		
//		SuperClass s1 = new SubClass1(); //SubClass1(actionProcess SuperClass(actionProcess Object() ) )
//		s1.actionProcess();
//		
//		SuperClass s2 = new SubClass2();
//		s2.actionProcess();
//		
//		SuperClass s3 = new SubClass3();
//		s3.actionProcess();
//		s3.Sub3Action();
//		
//		
//		SuperClass su = new SuperClass();
//		su.actionProcess();
		
//		SubClass1 s1 = new SubClass1(); 
//		System.out.println(s1.toString());
		
		String str1 = "abc";
		String str2 = "abc";
		
		System.out.println(str1==str2);
		
		String str3 = new String("def");
		String str4 = new String("def");
		
		System.out.println(str3.hashCode() == str4.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
