package Day06_2;

public class StaticEx2 {
	
	public static void staticShow() {
		System.out.println("StaticEx2staticShow");
	}
	
	public static void main(String[] args){
		StaticEx2.staticShow();
		System.out.println(StaticEx1.data);
	}
	
}

