package graphicsApp;

import javax.swing.JFrame;


public class PaintWindow extends JFrame {
	
	

	/**
	 * 
	 */
private static final long serialVersionUID = 1L;
	
	public PaintWindow(String title, PaintArea paintArea) {
		super(title);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().add(paintArea);
	}
	
}

