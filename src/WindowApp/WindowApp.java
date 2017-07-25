package WindowApp;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class WindowApp {

		public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
												/* ***WINDOWN INTERFACE *** */
			LookAndFeelInfo[] looks = UIManager.getInstalledLookAndFeels();
			for (LookAndFeelInfo lookAndFeelInfo : looks) {
				System.out.println(lookAndFeelInfo);
				if(lookAndFeelInfo.getName().equals("Window")){
					UIManager.setLookAndFeel(lookAndFeelInfo.getClassName());
				}
			}				
			
			SwingUtilities.invokeLater(new WindowThread());
	}
}
