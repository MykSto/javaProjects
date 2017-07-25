package graphicsApp;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class MouseDragListener extends MouseMotionAdapter {
	
	private PaintArea paintArea;

	public MouseDragListener(PaintArea paintArea) {
		this.paintArea = paintArea;
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		paintArea.setPosition(e.getX(), e.getY());
		paintArea.repaint();
	}
}
