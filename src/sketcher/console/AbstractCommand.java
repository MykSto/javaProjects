package sketcher.console;

public abstract class AbstractCommand {
	
	public static final String EXIT = "exit";

	public static final String CIRCLE = "circle";

	public static final String RECTANGLE = "rectangle";
	
	public static final String DRAW = "draw";

	public static final String SELECT = "select";
	
	public static final String MOVE = "move";
	
	public static final String HELP = "help";
	
	protected String commandToken;

	public AbstractCommand(String commandToken) {
		this.commandToken = commandToken;
	}

	public boolean evaluate(String commandToken){
		return this.commandToken.equals(commandToken);
	}
	
	public abstract void parseParameters(String [] commandParameters);
	
	public abstract void execute();
}
