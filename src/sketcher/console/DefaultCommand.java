package sketcher.console;

public class DefaultCommand extends AbstractCommand{
	
	public DefaultCommand() {
		super("");
	}

	public DefaultCommand(String commandToken) {
		super(commandToken);
	}

	@Override
	public void parseParameters(String[] commandParameters) {
		// Do nothing
	}
	
	@Override
	public void execute() {
		if(evaluate(AbstractCommand.HELP)){
			System.out.println("## SKETCHER v1.0 ##");
			System.out.println("# Available commands:");
			System.out.println("# " + AbstractCommand.CIRCLE + " <x> <y> - creates circle at provided coordinates.");
			System.out.println("# " + AbstractCommand.RECTANGLE + " <x> <y> - creates rectangle at provided coordinates.");
			System.out.println("# " + AbstractCommand.DRAW + " - draws all created figures.");
			System.out.println("# " + AbstractCommand.MOVE + " <dx> <dy> - updates current figure position.");
			System.out.println("# " + AbstractCommand.SELECT + " <index> - select figure by its index.");
			System.out.println("# " + AbstractCommand.HELP + " - prints title and available commands.");
			System.out.println("# " + AbstractCommand.EXIT + " - quits the program.");
		}else if(!evaluate(AbstractCommand.EXIT)){
			System.out.println("Unrecognized command!");
		}
	}

}
