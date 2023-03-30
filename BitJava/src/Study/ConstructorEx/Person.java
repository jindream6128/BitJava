package Study.ConstructorEx;

public class Person {
	String name;
	int age;
	
//	public Person() {
//		
//	}
	
	Person(String name){
		this.name = name;
	}
	
	Person(String name, int age){
		this(name);
		this.age = age;
	}
}

