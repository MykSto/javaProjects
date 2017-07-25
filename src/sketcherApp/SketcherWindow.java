package sketcherApp;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

import sketcher.domain.Shape;
import sketcher.domain.Sketcher;

public class SketcherWindow extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Sketcher sketcher;

	private Color currentColor = Color.BLACK;

	public SketcherWindow(String title, final Sketcher sketcher) {
		super(title);
		this.sketcher = sketcher;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);

		// MENU BAR
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		// FILE MENU
		JMenu fileMenu = new JMenu("File");
		menuBar.add(fileMenu);
		JMenuItem saveItem = fileMenu.add("Save...");
		saveItem.addActionListener(new SaveActionListener(sketcher, this));
		JMenuItem loadItem = fileMenu.add("Load...");
		loadItem.addActionListener(new LoadActionListener(sketcher, this));
		fileMenu.addSeparator();
		JMenuItem exitItem = fileMenu.add("Exit");

		saveItem.setAccelerator(KeyStroke.getKeyStroke('S', InputEvent.CTRL_DOWN_MASK));
		loadItem.setAccelerator(KeyStroke.getKeyStroke('L', InputEvent.CTRL_DOWN_MASK));
		exitItem.setAccelerator(KeyStroke.getKeyStroke('X', InputEvent.CTRL_DOWN_MASK));

		exitItem.addActionListener(this);

		// TOOLS MENU
		JMenu toolsMenu = new JMenu("Tools");
		menuBar.add(toolsMenu);
		JMenuItem colorItem = toolsMenu.add("Pick Color...");
		colorItem.addActionListener(new ColorActionListener(this));

		JMenu shapeMenu = new JMenu("Pick Shape...");
		ButtonGroup shapeGroup = new ButtonGroup();
		toolsMenu.add(shapeMenu);
		JRadioButtonMenuItem circleItem = new JRadioButtonMenuItem("Circle",
				(sketcher.getCurrentShapeType() == Shape.CIRCLE));
		circleItem.addActionListener(new ShapeTypeListener(Shape.CIRCLE, sketcher));
		JRadioButtonMenuItem rectangleItem = new JRadioButtonMenuItem("Rectangle",
				(sketcher.getCurrentShapeType() == Shape.RECTANGLE));
		rectangleItem.addActionListener(new ShapeTypeListener(Shape.RECTANGLE, sketcher));
		shapeMenu.add(circleItem);
		shapeGroup.add(circleItem);
		shapeMenu.add(rectangleItem);
		shapeGroup.add(rectangleItem);

		toolsMenu.addSeparator();
		//Clear surface
		JMenuItem clearItem = toolsMenu.add("Clear Surface");

		clearItem.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				sketcher.removeShapes();
				repaint();
			}
		});

	}

	public Color getCurrentColor() {
		return currentColor;
	}

	public void setCurrentColor(Color currentColor) {
		this.currentColor = currentColor;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setStroke(new BasicStroke(3.0f));
		sketcher.drawAll(g2d);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
		System.exit(0);
	}

}
