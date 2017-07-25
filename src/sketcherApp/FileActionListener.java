package sketcherApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import sketcher.domain.Sketcher;

public abstract class FileActionListener implements ActionListener {

	protected Sketcher sketcher;
	protected SketcherWindow window;
	protected JFileChooser chooser = new JFileChooser();
	
	public FileActionListener(Sketcher sketcher, SketcherWindow window){
		this.sketcher = sketcher;
		this.window = window;
		FileNameExtensionFilter filter = new FileNameExtensionFilter("SKEF files", "skef");
		chooser.setFileFilter(filter);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		chooser.setSelectedFile(new File("myDrawing.skef"));
		int returnVal = doShowDialog();
		if(returnVal == JFileChooser.APPROVE_OPTION){
			String filePath = chooser.getSelectedFile().getAbsolutePath();
			doProcessData(filePath);
		}
	}
	
	protected abstract int doShowDialog();
	
	protected abstract void doProcessData(String filePath);

}
