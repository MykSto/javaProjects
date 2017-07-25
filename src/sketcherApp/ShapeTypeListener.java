package sketcherApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import sketcher.domain.Sketcher;

class ShapeTypeListener  implements ActionListener{
	
	private int shapeType;
	private Sketcher sketcher;
	
	public ShapeTypeListener(int shapeType, Sketcher sketcher) {
		this.shapeType = shapeType;
		this.sketcher = sketcher;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		sketcher.setCurrentShapeType(shapeType);
	}
}

