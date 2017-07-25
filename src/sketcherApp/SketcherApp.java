package sketcherApp;

import javax.swing.SwingUtilities;

public class SketcherApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new SketcherThread());

	}

}
