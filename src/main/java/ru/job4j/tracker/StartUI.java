package ru.job4j.tracker;

public class StartUI {
	private static Output out;

	public StartUI(Output out) {
		StartUI.out = out;
	}

	public void init(Input input, Tracker tracker, UserAction[] actions) {
		boolean run = true;
		while (run) {
			this.showMenu(actions);
			int select = input.askInt("Select: ");
			if (select < 0 || select >= actions.length) {
				System.out.println("Wrong input, you can select: 0.." + (actions.length - 1));
				continue;
			}
			UserAction action = actions[select];
			run = action.execute(input, tracker);
		}
	}

	private void showMenu(UserAction[] actions) {
		System.out.println("Menu: ");
		for (int i = 0; i < actions.length; i++) {
			System.out.println(i + ". " + actions[i].name());
		}
	}

	public static void main(String[] args) {
		Output output = new ConsoleOutput();
		Input input = new ValidateInput(output, new ConsoleInput());
		Tracker tracker = new Tracker();
		UserAction[] actions = {new CreateAction(out), new ShowAllAction(),
				new EditAction(), new DeleteItem(output), new FindByIdAction(),
				new FindByNameAction(), new ExitAction()};
		new StartUI(out).init(input, tracker, actions);
	}
}
