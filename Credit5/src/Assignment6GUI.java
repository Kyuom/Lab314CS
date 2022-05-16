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
		FN.setBounds(31, 34, 120, 14);
		panel.add(FN);
		
		fn = new JTextField();
		fn.setBounds(226, 31, 127, 20);
		panel.add(fn);
		fn.setColumns(10);
		
		JLabel LN = new JLabel("What is your last name? ");
		LN.setBounds(31, 69, 120, 14);
		panel.add(LN);
		
		ln = new JTextField();
		ln.setBounds(226, 66, 127, 20);
		ln.setColumns(10);
		panel.add(ln);
		
		JLabel G = new JLabel("What grade are you in?");
		G.setBounds(31, 104, 118, 14);
		G.setVerticalAlignment(SwingConstants.TOP);
		panel.add(G);
		
		JComboBox g = new JComboBox();
		g.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		g.setBounds(226, 100, 127, 22);
		panel.add(g);
		
		JLabel School = new JLabel("What school do you attend? ");
		School.setBounds(31, 138, 185, 14);
		panel.add(School);
		
		school = new JTextField();
		school.setColumns(10);
		school.setBounds(226, 135, 127, 20);
		panel.add(school);
		
		JLabel H = new JLabel("What is your favourite hobby? ");
		H.setBounds(31, 169, 185, 14);
		panel.add(H);
		
		h = new JTextField();
		h.setColumns(10);
		h.setBounds(226, 166, 127, 20);
		panel.add(h);
		
		JButton S = new JButton("Submit");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = ln.getText();
				String School = school.getText();
				String H = h.getText();
				int G = g;
				
			}
		});
		S.setBounds(402, 34, 154, 63);
		panel.add(S);
		
		JButton C = new JButton("Clear");
		C.setBounds(402, 120, 154, 63);
		panel.add(C);
		
		JLabel dis = new JLabel("");
		dis.setBounds(31, 213, 551, 108);
		panel.add(dis);
	}
}
