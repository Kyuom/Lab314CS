import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PizzaCostGUI {

	private JFrame frame;
	private JTextField UD;
	private JLabel dis;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaCostGUI window = new PizzaCostGUI();
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
	public PizzaCostGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		dis = new JLabel("");
		dis.setBounds(35, 125, 376, 104);
		panel.add(dis);
		
		JLabel Promt = new JLabel("Enter the diameter of the pizza in inches: ");
		Promt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Promt.setBounds(35, 57, 237, 15);
		panel.add(Promt);
		
		UD = new JTextField();
		UD.setFont(new Font("Tahoma", Font.PLAIN, 12));
		UD.setBounds(282, 55, 86, 20);
		panel.add(UD);
		UD.setColumns(10);
		
		JButton S = new JButton("Submit");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				int ud = Integer.parseInt(UD.getText()); //record the user pizza diameter
				
				float labor = 0.75f; // The labor cost of the pizza
				float rent = 1.00f; // The rent cost of the pizza
				float materials = 0.05f * ud * ud; // The material cost calculation of the pizza
				float cost = labor + rent + materials; //The total cost calculation of the pizza
				
				dis.setText("The cost of the pizza is: $" + cost);
			}
		});
		S.setBounds(460, 32, 142, 78);
		panel.add(S);
		
		JButton C = new JButton("Clear");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				UD.setText(" ");
			}
		});
		C.setBounds(460, 151, 142, 78);
		panel.add(C);
		
	}
}
