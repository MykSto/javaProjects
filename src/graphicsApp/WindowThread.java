package graphicsApp;


public class WindowThread implements Runnable {

	@Override
	public void run() {
		PaintArea paintArea = new PaintArea();
		paintArea.addMouseMotionListener(new MouseDragListener(paintArea));
		PaintWindow window = new PaintWindow("Piešimo langas", paintArea);
		window.setSize(700, 500);
		window.setLocationRelativeTo(null);
		window.setVisible(true);
	}
}
