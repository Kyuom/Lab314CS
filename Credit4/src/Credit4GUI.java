import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Credit4GUI {

	private JFrame frame;
	private JTextField ln;
	private JTextField fn;
	private JTextField a;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Credit4GUI window = new Credit4GUI();
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
	public Credit4GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 742, 452);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(43, 28, 655, 361);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FN = new JLabel("First name");
		FN.setBounds(23, 14, 75, 14);
		FN.setVerticalAlignment(SwingConstants.TOP);
		panel.add(FN);
		
		fn = new JTextField();
		fn.setBounds(108, 14, 132, 20);
		fn.setColumns(10);
		panel.add(fn);
		
		JLabel LN = new JLabel("Last name");
		LN.setBounds(23, 84, 75, 14);
		panel.add(LN);
		
		ln = new JTextField();
		ln.setBounds(108, 84, 132, 20);
		panel.add(ln);
		ln.setColumns(10);
		
		JLabel A = new JLabel("Age");
		A.setBounds(23, 148, 75, 14);
		A.setVerticalAlignment(SwingConstants.TOP);
		panel.add(A);
		
		a = new JTextField();
		a.setBounds(108, 148, 132, 20);
		a.setColumns(10);
		panel.add(a);
		
		JLabel dis = new JLabel("");
		dis.setBounds(23, 247, 610, 90);
		panel.add(dis);
		
		JButton S = new JButton("Submit");
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = ln.getText();
				String A = a.getText();
			
				dis.setText("First name: " + FN + " Last name: " + LN + " Age: " + A);
			}
		});
		S.setBounds(282, 14, 154, 63);
		panel.add(S);
		
		JButton C = new JButton("Clear");
		C.setBounds(282, 108, 154, 63);
		panel.add(C);
		
	}
}
