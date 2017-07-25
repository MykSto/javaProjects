package sketcherApp;

import sketcher.domain.Sketcher;

public class SketcherThread implements Runnable {

	@Override
	public void run() {
		Sketcher sketcher = new Sketcher();
		SketcherWindow sketcherWindow = new SketcherWindow("Braižyklė v1.0", sketcher);
		DrawingMouseListener drawingListener = new DrawingMouseListener(sketcherWindow, sketcher);
		sketcherWindow.addMouseListener(drawingListener);
		sketcherWindow.addMouseMotionListener(drawingListener);
		sketcherWindow.setSize(800, 600);
		sketcherWindow.setLocationRelativeTo(null);
		sketcherWindow.setVisible(true);
	}

}
