package Day08_4;

public class ProcesClient {
	Process p=new Process();
	
	public void action1() {
		p.fileCheck();
		System.out.println("action");
	}
	
	public void action2() {

	}
	
	public void action3() {

	}
	
	public static void main(String[] args) {
		ProcesClient p = new ProcesClient();
		p.action1();
		p.action2();
		
	}
}
