import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class Assignment6GUI {

	private JFrame frame;
	private JTextField fn;
	private JTextField ln;
	private JTextField school;
	private JTextField h;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment6GUI window = new Assignment6GUI();
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
	public Assignment6GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 626, 388);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel FN = new JLabel("What is your first name? ");
		FN.setBounds(31, 34, 229, 14);
		panel.add(FN);
		
		fn = new JTextField();
		fn.setBounds(265, 34, 127, 20);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel LN = new JLabel("What is your last name? ");
		LN.setBounds(31, 69, 229, 14);
		panel.add(LN);
		
		ln = new JTextField();
		ln.setBounds(265, 69, 127, 20);
		ln.setColumns(10);
		panel.add(ln);
		
		JLabel G = new JLabel("What grade are you in?");
		G.setBounds(31, 104, 229, 14);
		panel.add(G);
		
		JComboBox g = new JComboBox();
		g.setBounds(265, 100, 127, 22);
		g.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		panel.add(g);
		
		JLabel School = new JLabel("What school do you attend? ");
		School.setBounds(31, 138, 229, 14);
		panel.add(School);
		
		school = new JTextField();
		school.setColumns(10);
		school.setBounds(265, 138, 127, 20);
		panel.add(school);
		
		JLabel H = new JLabel("What is your favourite hobby? ");
		H.setBounds(31, 169, 229, 14);
		panel.add(H);
		
		h = new JTextField();
		h.setColumns(10);
		h.setBounds(265, 169, 127, 20);
		panel.add(h);
		
		JTextArea dis = new JTextArea();
		dis.setBounds(31, 238, 551, 83);
		panel.add(dis);
		
		JButton S = new JButton("Submit");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = ln.getText();
				String School = school.getText();
				String H = h.getText();
				int grade;
				
				if(g.getSelectedItem().equals("10"))
				{
					grade = 10;
				}
				else if(g.getSelectedItem().equals("11"))
				{
					grade = 11;
					
				}
				else 
				{
					grade = 12;
				}
				
				dis.setText("Hello, your name is "+ FN + " " + LN  + ", " + "you are currently in grade " + grade
						+ " at " + School + ". " + "\r\n" + "Your favourite hobby is " + H + "."); //Printing dialogue with user input
			}
		});
		S.setBounds(428, 34, 154, 63);
		panel.add(S);
		
		JButton C = new JButton("Clear");
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				fn.setText(" ");
				ln.setText(" ");
				school.setText(" ");
				h.setText(" ");
				dis.setText(" ");
			}
		});
		C.setBounds(428, 120, 154, 63);
		panel.add(C);

	}
}
