package sketcher.console;

import java.util.ArrayDeque;
import java.util.Queue;

import sketcher.domain.Sketcher;

public class ShapeCommand extends AbstractCommand{
	
	protected Queue<Integer> parameters = new ArrayDeque<Integer>();

	protected Sketcher sketcher;
	
	public ShapeCommand(String [] commandParameters, Sketcher sketcher) {
		super(commandParameters[0]);
		this.sketcher = sketcher;
		parseParameters(commandParameters);
	}
	
	public void parseParameters(String [] commandParameters){
		parameters.clear();
		try {
			boolean first = true;
			for (String parameter : commandParameters) {
				if(first){
					first = false;
				}else{
					parameters.add(Integer.valueOf(parameter));
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("Parameters are not numerical!");
		}
	}

	@Override
	public void execute() {
		if(parameters.size() >= 2){
			sketcher.createShape(parameters.poll(), parameters.poll());
		}else{
			System.out.println("There are some parameters missing! No shapes were created!");
		}
	}
	
}
