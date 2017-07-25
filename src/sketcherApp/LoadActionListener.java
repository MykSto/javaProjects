package sketcherApp;

import sketcher.domain.Sketcher;

public class LoadActionListener extends FileActionListener {

	public LoadActionListener(Sketcher sketcher, SketcherWindow window) {
		super(sketcher, window);
	}

	@Override
	protected int doShowDialog() {
		return chooser.showOpenDialog(window);
	}

	@Override
	protected void doProcessData(String filePath) {
		sketcher.loadData(filePath);
		window.repaint();
	}

}
