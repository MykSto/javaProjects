package sketcher.console;

import sketcher.domain.Shape;
import sketcher.domain.Sketcher;

public class ShapeMoveCommand extends ShapeCommand{

	public ShapeMoveCommand(String[] commandParameters, Sketcher sketcher) {
		super(commandParameters, sketcher);
	}
	
	@Override
	public void execute() {
		Shape shape = sketcher.getSelectedShape();
		if(shape!=null){
			if(parameters.size() >= 2){
				shape.move(parameters.poll(), parameters.poll());
			}else{
				System.out.println("There are some parameters missing! No shapes were moved!");
			}
		}else{
			System.out.println("Nothing to move!");
		}
	}

}
