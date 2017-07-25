package WindowApp;

//import java.awt.Dimension;
//import java.awt.Toolkit;
//
//import javax.swing.WindowConstants;


public class WindowThread implements Runnable {

	@Override
	public void run() {
//		MyWindow window = new MyWindow("Mano pirmas langas");
//		window.setSize(800, 600);
//		window.setVisible(true);
//		window.setLocation(200, 200);//set location to display window
//		window.setMinimumSize(new Dimension(800, 600));
//		window.setLocationRelativeTo(null);// set size based on the windown screen
//		//window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Close program with console
//		//window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); Unable to close.
//		//window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); erase existing object in window
//		//window.setDefaultCloseOperation(JFrame.HDIE_ON_CLOSE); close program, but works in background
//									/* WINDOWN CONSTANS */
//		window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
//									/* WINDOWN TOOLKIT */
//		Toolkit toolkit = window.getToolkit();// gains access to elements 
//		Dimension screenSize = toolkit.getScreenSize();
//		//method that set the size of window
//		window.setBounds(screenSize.width/4, screenSize.height/4, screenSize.width/2, screenSize.height/2);
		MyWindowListener windowListener = new MyWindowListener();
		MyWindow window = new MyWindow("Mano pirmas langas");
		
		//window.setLocation(200, 200);
		//window.setSize(800, 600);
		
//		window.createFlowLayout();
//		window.createBorderLayout();
//		window.createGridLayout();
		window.createBoxLayout();
		

		
		window.addWindowListener(windowListener);
		window.pack();
		window.setMinimumSize(window.getPreferredSize());
		
		window.setLocationRelativeTo(null);
		
		/*Toolkit toolkit = window.getToolkit();
		Dimension screenSize = toolkit.getScreenSize();
		window.setBounds(screenSize.width/4, screenSize.height/4, screenSize.width/2, screenSize.height/2);*/
		
		
		
		window.setVisible(true);
	}

}

