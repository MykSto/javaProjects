package windowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.BoxLayout;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyJFrame extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyJFrame frame = new MyJFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MyJFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
				JMenuItem mntmNew = new JMenuItem("New");
				mnFile.add(mntmNew);
				
				JMenuItem mntmNewMenuItem = new JMenuItem("Open");
				mnFile.add(mntmNewMenuItem);
				
				JMenuItem mntmNewMenuItem_1 = new JMenuItem("Close");
				mnFile.add(mntmNewMenuItem_1);
				
				JMenuItem mntmNewMenuItem_2 = new JMenuItem("Exit");
				mntmNewMenuItem_2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						dispose();
						System.exit(0);
					}
				});
				mnFile.add(mntmNewMenuItem_2);
		
		JMenu mnTools = new JMenu("Tools");
		menuBar.add(mnTools);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem = new JRadioButtonMenuItem("Line");
		buttonGroup.add(rdbtnmntmNewRadioItem);
		mnTools.add(rdbtnmntmNewRadioItem);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_1 = new JRadioButtonMenuItem("Rectangle");
		buttonGroup.add(rdbtnmntmNewRadioItem_1);
		mnTools.add(rdbtnmntmNewRadioItem_1);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_2 = new JRadioButtonMenuItem("Circle");
		buttonGroup.add(rdbtnmntmNewRadioItem_2);
		mnTools.add(rdbtnmntmNewRadioItem_2);
		
		JRadioButtonMenuItem rdbtnmntmNewRadioItem_3 = new JRadioButtonMenuItem("Curve");
		buttonGroup.add(rdbtnmntmNewRadioItem_3);
		mnTools.add(rdbtnmntmNewRadioItem_3);
		
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Box horizontalBox = Box.createHorizontalBox();
		contentPane.add(horizontalBox);
				
				JPanel panel_1 = new JPanel();
				panel_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Line Color", TitledBorder.LEADING, TitledBorder.TOP, null, null));
				horizontalBox.add(panel_1);
				panel_1.setLayout(new BorderLayout(0, 0));
				
				Box verticalBox = Box.createVerticalBox();
				panel_1.add(verticalBox);
				
						Component verticalStrut_4 = Box.createVerticalStrut(20);
						verticalBox.add(verticalStrut_4);
						
						JRadioButton rdbtnNewRadioButton = new JRadioButton("Red");
						rdbtnNewRadioButton.setForeground(Color.RED);
						buttonGroup.add(rdbtnNewRadioButton);
						verticalBox.add(rdbtnNewRadioButton);
						
						Component verticalStrut = Box.createVerticalStrut(20);
						verticalBox.add(verticalStrut);
						
						JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Green");
						rdbtnNewRadioButton_1.setForeground(Color.GREEN);
						buttonGroup.add(rdbtnNewRadioButton_1);
						verticalBox.add(rdbtnNewRadioButton_1);
						
						Component verticalStrut_1 = Box.createVerticalStrut(20);
						verticalBox.add(verticalStrut_1);
						
						JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Blue");
						rdbtnNewRadioButton_2.setForeground(Color.BLUE);
						buttonGroup.add(rdbtnNewRadioButton_2);
						verticalBox.add(rdbtnNewRadioButton_2);
						
						Component verticalStrut_2 = Box.createVerticalStrut(20);
						verticalBox.add(verticalStrut_2);
						
						JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Yellow");
						rdbtnNewRadioButton_3.setForeground(Color.YELLOW);
						buttonGroup.add(rdbtnNewRadioButton_3);
						verticalBox.add(rdbtnNewRadioButton_3);
						
						Component verticalStrut_3 = Box.createVerticalStrut(20);
						verticalBox.add(verticalStrut_3);
						
						Component verticalGlue = Box.createVerticalGlue();
						verticalBox.add(verticalGlue);
						
						JPanel panel_2 = new JPanel();
						panel_2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Line Properties", TitledBorder.LEADING, TitledBorder.TOP, null, null));
						horizontalBox.add(panel_2);
						panel_2.setLayout(new BorderLayout(0, 0));
						
						Box verticalBox_1 = Box.createVerticalBox();
						panel_2.add(verticalBox_1);
						
								Component verticalStrut_5 = Box.createVerticalStrut(20);
								verticalBox_1.add(verticalStrut_5);
								
								JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Dashed");
								verticalBox_1.add(chckbxNewCheckBox_1);
								
								Component verticalStrut_6 = Box.createVerticalStrut(20);
								verticalBox_1.add(verticalStrut_6);
								
								JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Thick");
								verticalBox_1.add(chckbxNewCheckBox_2);
								
								Component verticalStrut_7 = Box.createVerticalStrut(20);
								verticalBox_1.add(verticalStrut_7);
								
								JCheckBox chckbxNewCheckBox = new JCheckBox("Rounded");
								verticalBox_1.add(chckbxNewCheckBox);
								
								Component verticalStrut_8 = Box.createVerticalStrut(20);
								verticalBox_1.add(verticalStrut_8);
								
								Component verticalGlue_1 = Box.createVerticalGlue();
								verticalBox_1.add(verticalGlue_1);
				
				
				JPanel panel = new JPanel();
				contentPane.add(panel, BorderLayout.SOUTH);
				
				JButton btnNewButton = new JButton("Defaults");
				panel.add(btnNewButton);
				
				JButton btnNewButton_1 = new JButton("OK");
				panel.add(btnNewButton_1);
				
				JButton btnNewButton_2 = new JButton("Cancel");
				panel.add(btnNewButton_2);	
				
		
		
	
	}

}
