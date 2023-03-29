package Day05_2;

public class ActionFactory { // ActionFactory 는 명령에따라서 Action을 만들어주는거
	private static ActionFactory actionFactory;

	public static ActionFactory getInstance() {//싱글톤
		if (actionFactory == null) {
			actionFactory = new ActionFactory();
		}
		return actionFactory;
	}

	public static Action getAction(String command) {
		if (command.equals("login")) {
			return new LoginAction("loginView", true); //Action action = new ListAction(); LoginAction(excute Action(excute))
 		}

		if (command.equals("list")) {
			return new LoginAction("listView", false); //Action action = new ListAction(); ListAction(excute Action(excute)) 
		}
		return null;
	}

}
