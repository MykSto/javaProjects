package sketcherApp;

import sketcher.domain.Sketcher;

public class SaveActionListener extends FileActionListener {

	public SaveActionListener(Sketcher sketcher, SketcherWindow window) {
		super(sketcher, window);
	}

	@Override
	protected int doShowDialog() {
		return chooser.showSaveDialog(window);
	}

	@Override
	protected void doProcessData(String filePath) {
		sketcher.saveData(filePath);
	}

}
