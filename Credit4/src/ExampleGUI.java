import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ExampleGUI {

	private JFrame frame;
	private JTextField otd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExampleGUI window = new ExampleGUI();
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
	public ExampleGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel td = new JLabel("Enter Two Digits");
		td.setBounds(23, 58, 114, 14);
		panel.add(td);
		
		otd = new JTextField();
		otd.setBounds(23, 95, 86, 20);
		panel.add(otd);
		otd.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setBounds(23, 165, 361, 47);
		panel.add(dis);
		
		JButton c = new JButton("Clear");
		c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				otd.setText(" ");
			}
		});
		c.setBounds(295, 106, 89, 48);
		panel.add(c);
		
		JButton E = new JButton("Enter");
		E.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String td = otd.getText(); //record the two digits
				int otd = Integer.parseInt(td); //get the integer part
				int d1 = otd / 10; //record the first digit
				int d2 = otd % 10; //record the second digit
				
				int sum = d1 + d2; //record the sum
				
				int prod = d1*d2; //record the product
				
				int check = sum + prod; //record the sum and the product
				
				if(check == otd)
				{
					dis.setText(otd + " is a special two digit number"); //display original two digit number with text
				}
				else
				{
					dis.setText(otd + " is not a special two digit number");
				}
			}
		});
		E.setBounds(295, 24, 89, 48);
		panel.add(E);
	}
}
