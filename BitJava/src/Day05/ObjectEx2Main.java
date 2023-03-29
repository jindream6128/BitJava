package Day05;

public class ObjectEx2Main {

	public static void main(String[] args) {
		ObjectEx2.getInstance().setMessage("Java");
		System.out.println(ObjectEx2.getInstance().getMessage());
		//getInstance -> �? ?��주면 ?��로운 객체�? 만든?��.
	}
}
