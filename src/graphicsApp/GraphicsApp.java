package graphicsApp;

import javax.swing.SwingUtilities;

public class GraphicsApp {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new WindowThread());
	}

}
