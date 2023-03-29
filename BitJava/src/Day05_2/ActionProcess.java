package Day05_2;

import java.util.Scanner;

//ActionProcess 가 Controller 역할을 한다고 생각
public class ActionProcess {
	private Scanner scanner = new Scanner(System.in);

	public void menu() {
		String command = "";
		while (true) {
			System.out.println("1.login 2.List 3.Delete 4.modify 5.Exit");
			switch(scanner.nextInt()) {
			case 1: 
				command ="login"; break;
			case 2: 
				command ="list"; break;
			case 3: 
				command ="delete"; break;
			case 4: 
				command ="modify"; break;
			case 5: 
				return;
			}
			Action action = ActionFactory.getInstance().getAction(command);
			ActionForward af = action.excute();
			
			if(af.isRedirect()){
				System.out.println(af.getPath() + "직업 이용");
			}else {
				System.out.println(af.getPath()+ "간접 이동");
			}
		}
	}

	public static void main(String[] args) {
		new ActionProcess().menu();
	}
}
