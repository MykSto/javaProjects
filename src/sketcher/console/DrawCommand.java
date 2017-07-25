package sketcher.console;

import sketcher.domain.Sketcher;

public class DrawCommand extends AbstractCommand{

	private Sketcher sketcher;
	
	public DrawCommand(String commandToken, Sketcher sketcher) {
		super(commandToken);
		this.sketcher = sketcher;
	}
	
	@Override
	public void parseParameters(String[] commandParameters) {
		// Do nothing
	}
	
	@Override
	public void execute() {
		sketcher.drawAll();
	}
	
}
