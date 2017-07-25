package MyCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator  {

	private JFrame frame;
	private JTextField textField;
	
	double firstnum;
	double result;
	double plusminus;
	double secondnum;
	String answer;
	String operations;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 254, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(20, 11, 210, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		//------------NUMBERS-------------------------------------
		//---------------------------1----------------------------
		final JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setBounds(20, 126, 45, 23);
		frame.getContentPane().add(btn1);
		
		//----------------------------2---------------------------
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setBounds(75, 126, 45, 23);
		frame.getContentPane().add(btn2);

		//----------------------------3---------------------------
		
		final JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setBounds(130, 126, 45, 23);
		frame.getContentPane().add(btn3);

		//----------------------------4---------------------------
		
		final JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setBounds(20, 159, 45, 23);
		frame.getContentPane().add(btn4);

		//----------------------------5---------------------------
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setBounds(75, 159, 45, 23);
		frame.getContentPane().add(btn5);

		//----------------------------6---------------------------
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setBounds(130, 159, 45, 23);
		frame.getContentPane().add(btn6);

		//----------------------------7---------------------------
		
		final JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn7.setBounds(20, 193, 45, 23);
		frame.getContentPane().add(btn7);

		//----------------------------8---------------------------
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setBounds(75, 193, 45, 23);
		frame.getContentPane().add(btn8);

		//----------------------------9---------------------------
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setBounds(130, 193, 45, 23);
		frame.getContentPane().add(btn9);

		//----------------------------0---------------------------
		
		final JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setBounds(20, 227, 45, 23);
		frame.getContentPane().add(btn0);

		//----------------------------COMMA---------------------------
		
		JButton btnComma = new JButton(",");
		btnComma.setBounds(75, 227, 45, 23);
		frame.getContentPane().add(btnComma);

		//----------------------------EQUALS---------------------------
		
		JButton btnEqua = new JButton("=");
		btnEqua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				secondnum = Double.parseDouble(textField.getText());
				if (operations == "+"){
					result = firstnum + secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "-"){
					result = firstnum - secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "/"){
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "*"){
					result = firstnum * secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if (operations == "%"){
					result = firstnum % secondnum;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				
			}
		});
		btnEqua.setBounds(130, 227, 45, 23);
		frame.getContentPane().add(btnEqua);

		//----------------------------DIVIDE---------------------------
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "/";
			}
		});
		btnDiv.setBounds(185, 42, 45, 32);
		frame.getContentPane().add(btnDiv);

		//----------------------------PLUS---------------------------
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "+";
			}
		});
		btnPlus.setBounds(185, 193, 45, 57);
		frame.getContentPane().add(btnPlus);

		//----------------------------SUBSTRACT---------------------------
		
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "-";
			}
		});
		btnSub.setBounds(185, 126, 45, 60);
		frame.getContentPane().add(btnSub);

		//----------------------------PERCENTAGE---------------------------
		
		final JButton btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "%";
			}
		});
		btnPer.setBounds(130, 83, 45, 32);
		frame.getContentPane().add(btnPer);

		//----------------------------MULTIPLY---------------------------
		
		JButton btnMul = new JButton("*");
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				firstnum = Double.parseDouble(textField.getText());
				textField.setText("");
				operations = "*";
			}
		});
		btnMul.setBounds(185, 83, 45, 32);
		frame.getContentPane().add(btnMul);

		//----------------------------CLEAR---------------------------
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(null);
			}
		});
		btnC.setBounds(75, 83, 45, 32);
		frame.getContentPane().add(btnC);

		//----------------------------BACKSPACE---------------------------
		
		JButton btnBack = new JButton("B");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backspace = null;
				if(textField.getText().length() > 0 ){
					StringBuilder strb = new StringBuilder(textField.getText());
					strb.deleteCharAt(textField.getText().length() - 1);
					backspace = strb.toString();
					textField.setText(backspace);
				}
			}
		});
		btnBack.setBounds(20, 83, 45, 32);
		frame.getContentPane().add(btnBack);

		//----------------------------PLUSMINUS---------------------------
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				plusminus = Double.parseDouble(String.valueOf(textField.getText()));
				plusminus = plusminus * (-1);
				textField.setText(String.valueOf(plusminus));
				
			}
		});
		btnPM.setBounds(130, 42, 45, 32);
		frame.getContentPane().add(btnPM);
	}
}
