package sketcherApp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;

public class ColorActionListener implements ActionListener {

	private SketcherWindow sketcherWindow;
	
	public ColorActionListener(SketcherWindow sketcherWindow) {
		this.sketcherWindow = sketcherWindow;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color currentColor = sketcherWindow.getCurrentColor();
		currentColor = JColorChooser.showDialog(sketcherWindow, "Spalvos pasirinkimas", currentColor);
		sketcherWindow.setCurrentColor(currentColor);
	}

}
