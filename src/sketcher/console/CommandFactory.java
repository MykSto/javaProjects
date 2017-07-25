package sketcher.console;

import java.util.HashMap;
import java.util.Map;

import sketcher.domain.Shape;
import sketcher.domain.Sketcher;

public class CommandFactory {
	
	private Map<String, AbstractCommand> commandPool = new HashMap<String, AbstractCommand>();
	
	private DefaultCommand unrecognizedCommand = new DefaultCommand();
	
	private Sketcher sketcher;
	
	public CommandFactory(Sketcher sketcher) {
		this.sketcher = sketcher;
	}
	
	public AbstractCommand createCommand(String commandLine){
		String [] commandParameters = commandLine.split(" ");
		String commandToken = commandParameters[0];
		AbstractCommand command = unrecognizedCommand;
		if(commandPool.containsKey(commandToken)){
			command = commandPool.get(commandToken);
			command.parseParameters(commandParameters);
		}else{
			command = createCommand(commandParameters);
			commandPool.put(commandToken, command);
		}
		return command;
	}
	
	private AbstractCommand createCommand(String [] commandParameters){
		String commandToken = commandParameters[0];
		if(commandToken.equals(AbstractCommand.CIRCLE)){
			this.sketcher.setCurrentShapeType(Shape.CIRCLE);
			return new ShapeCommand(commandParameters, this.sketcher);
		}else if(commandToken.equals(AbstractCommand.RECTANGLE)){
			this.sketcher.setCurrentShapeType(Shape.RECTANGLE);
			return new ShapeCommand(commandParameters, this.sketcher);
		}else if(commandToken.equals(AbstractCommand.MOVE)){
			return new ShapeMoveCommand(commandParameters, sketcher);
		}else if(commandToken.equals(AbstractCommand.SELECT)){
			return new ShapeSelectCommand(commandParameters, sketcher);
		}else if(commandToken.equals(AbstractCommand.DRAW)){
			return new DrawCommand(commandToken, sketcher);
		}else if(commandToken.equals(AbstractCommand.HELP) || commandToken.equals(AbstractCommand.EXIT)){
			return new DefaultCommand(commandToken);
		}else{
			return unrecognizedCommand;
		}
	}
}
