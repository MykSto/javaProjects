package sketcher.console;

import sketcher.domain.Sketcher;

public class ShapeSelectCommand extends ShapeCommand{

	public ShapeSelectCommand(String[] commandParameters, Sketcher sketcher) {
		super(commandParameters, sketcher);
	}
	
	@Override
	public void execute() {
		if(!parameters.isEmpty()){
			sketcher.selectShape(parameters.poll());
		}else{
			System.out.println("Index parameter is missing! Noshapes were selected!");
		}
	}

}
