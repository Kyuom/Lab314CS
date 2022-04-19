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
	private JTextField tdf;

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
		
		tdf = new JTextField();
		tdf.setBounds(23, 95, 86, 20);
		panel.add(tdf);
		tdf.setColumns(10);
		
		JLabel dis = new JLabel("");
		dis.setBounds(46, 165, 326, 47);
		panel.add(dis);
		
		JButton p = new JButton("Process");
		p.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		p.setBounds(295, 24, 89, 48);
		panel.add(p);
		
		JButton E = new JButton("Enter");
		E.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String td = tdf.getText();
				int tdi = Integer.parseInt(td);
				
				int d1 = tdi / 10;
				
				//int sum
				
				dis.setText("" + td);
			}
		});
		E.setBounds(295, 95, 89, 48);
		panel.add(E);
	}
}
