package sketcherApp;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import sketcher.domain.Shape;
import sketcher.domain.Sketcher;

public class DrawingMouseListener extends MouseAdapter {

	private SketcherWindow sketcherWindow;
	private Sketcher sketcher;
	private Shape shape;
	private int x;
	private int y;

	public DrawingMouseListener(SketcherWindow sketcherWindow, Sketcher sketcher) {
		this.sketcherWindow = sketcherWindow;
		this.sketcher = sketcher;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
		x = e.getX();
		y = e.getY();
		shape = sketcher.createShape(x, y);
		shape.setColor(sketcherWindow.getCurrentColor());
		sketcherWindow.repaint();
	}
	
}
