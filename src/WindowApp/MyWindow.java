package WindowApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.WindowConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class MyWindow extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JLabel textLabel = new JLabel(" ");
	
	public MyWindow(String title){
		super(title);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	}
	public void display(String text){
		textLabel.setText(text);
	}
	
	public void createFlowLayout(){
		Container content = getContentPane();
		FlowLayout flow = new FlowLayout();//responsive design
		flow.setAlignment(FlowLayout.LEFT);
		flow.setVgap(20);
		flow.setHgap(20);
		content.setLayout(flow);
		for(int i = 1; i < 6; i++){
			content.add(new JButton("Spausk"+i));
		}
	}
	public void createBorderLayout(){
		Container content = getContentPane();
		BorderLayout borderLayout = new BorderLayout(10, 10);
		content.setLayout(borderLayout);
//		content.add(new JButton("Spausk i rytus"), BorderLayout.EAST);
//		content.add(new JButton("Spausk i vakarus"), BorderLayout.WEST);
		content.add(new JButton("Spausk i siaure"), BorderLayout.NORTH);
		content.add(new JButton("Spausk i pietus"), BorderLayout.SOUTH);
		content.add(new JButton("Spausk i centra"));
	}
	public void createGridLayout(){
		Container content = getContentPane();
		GridLayout gridLayout = new GridLayout(3, 4, 30, 20);
		content.setLayout(gridLayout);
		for(int i = 1; i < 10; i++){
			content.add(new JButton("Spausk"+i));
		}
	}
	public void createBoxLayout(){
		Container content = getContentPane();
		Box left = Box.createVerticalBox();
		
		JRadioButton button;	
		ButtonGroup radioGroup = new ButtonGroup();
		
		button = new JRadioButton("Red");
		button.setForeground(Color.red);
		left.add(Box.createVerticalStrut(30));//space between elements RadioBox
		left.add(button);
		radioGroup.add(button);
		
		button = new JRadioButton("Greed");
		button.setForeground(Color.green);
		left.add(Box.createVerticalStrut(30));
		left.add(button);
		radioGroup.add(button);
		
		button = new JRadioButton("Blue");
		button.setForeground(new Color(14, 45, 160));
		left.add(Box.createVerticalStrut(30));
		left.add(button);
		radioGroup.add(button);
		
		button = new JRadioButton("Pink");
		button.setForeground(new Color(255, 105, 180));//colors with objects
		left.add(Box.createVerticalStrut(30));
		left.add(button);
		radioGroup.add(button);//sets radioButton behavior to "ONE MARK"
		left.add(Box.createVerticalStrut(30));
		left.add(Box.createVerticalGlue());//pushes and fills empty space.
//		content.add(left);	
		
		Box right = Box.createVerticalBox();
		right.add(Box.createVerticalStrut(30));
		right.add(new JCheckBox("Dashed"));
		right.add(Box.createVerticalStrut(30));
		right.add(new JCheckBox("Thick"));
		right.add(Box.createVerticalStrut(30));
		right.add(new JCheckBox("Round"));
		right.add(Box.createVerticalGlue());//pushes and fills empty space.
		
		JPanel leftPanel = new JPanel(new BorderLayout());
		leftPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Color"));
		leftPanel.add(left); 
		
		JPanel rightPanel = new JPanel(new BorderLayout());
		rightPanel.setBorder(new TitledBorder(new EtchedBorder(), "Line Properties"));
		rightPanel.add(right); 
		
		Box top = Box.createHorizontalBox();
		top.add(Box.createHorizontalStrut(5));
		top.add(leftPanel);
		top.add(Box.createHorizontalStrut(5));
		top.add(rightPanel);
		top.add(Box.createHorizontalStrut(5));
		
		content.add(top);
		
		JPanel button1 = new JPanel();
		Dimension size = new Dimension(80, 20);// width, height
		JButton b;
		button1.add(b = new JButton("Click"));
		b.setPreferredSize(size);
		button1.add(b = new JButton("Cancel"));
		b.setPreferredSize(size);
		
		content.add(button1, BorderLayout.SOUTH);
		
					/* *** MENU *** */
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu fileMenu = new JMenu("File");
		JMenu toolsMenu = new JMenu("Tools");
		menuBar.add(fileMenu);
		menuBar.add(toolsMenu);
		
		JMenuItem newItem = fileMenu.add("New");
		JMenuItem openItem = fileMenu.add("Open");
		JMenuItem closeItem = fileMenu.add("Close");
		JMenuItem exitItem = fileMenu.add("Exit");
		
		//Menu Tools with RadioMuneItem
		JRadioButtonMenuItem shapeItem;
		ButtonGroup shapeGroup = new ButtonGroup();
		toolsMenu.add(shapeItem = new JRadioButtonMenuItem("Line", true));
		shapeGroup.add(shapeItem);
		toolsMenu.add(shapeItem = new JRadioButtonMenuItem("Rectangle", true));
		shapeGroup.add(shapeItem);
		toolsMenu.add(shapeItem = new JRadioButtonMenuItem("Circle", true));
		shapeGroup.add(shapeItem);
		toolsMenu.add(shapeItem = new JRadioButtonMenuItem("Curve", false));
		shapeGroup.add(shapeItem);
	}
}
