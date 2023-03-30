package Study.ConstructorEx;

public class Student extends Person{
		int point;
		String name = "우엉";
		
		public Student(int point) {
			super("감자", 26);
			this.point = point;
		}
	
		
		public void printInfo() {
			System.out.println(super.name + " " + age + " " + point);
			System.out.println(this.name);
			System.out.println(name);
		}
		public static void main(String[] args) {
			Student s = new Student(14);
			s.printInfo();
		}

}
