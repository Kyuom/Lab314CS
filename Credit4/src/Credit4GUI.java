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
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

public class Credit4GUI {

	private JFrame frame;
	private JTextField ln;
	private JTextField fn;

	ImageIcon img1 = new ImageIcon("C:/Users/1005244507/git/Lab314CS/Credit4/src/imaginarybeast1-600x600.png");
	
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
		panel.setBounds(10, 11, 688, 378);
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
		
		JLabel dis = new JLabel("");
		dis.setBounds(23, 222, 643, 117);
		panel.add(dis);
		
		JLabel GD =new JLabel("Grade");
		GD.setBounds(23, 148, 75, 14);
		GD.setVerticalAlignment(SwingConstants.TOP);
		panel.add(GD);
		
		JComboBox gd = new JComboBox();
		gd.setBounds(108, 144, 132, 22);
		gd.setModel(new DefaultComboBoxModel(new String[] {"10", "11", "12"}));
		panel.add(gd);
		
		JLabel pic = new JLabel("");
		pic.setBounds(475, 14, 159, 157);
		panel.add(pic);
		
		JButton S = new JButton("Submit");
		S.setBounds(282, 14, 154, 63);
		S.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String FN = fn.getText();
				String LN = ln.getText();
				int grade;
				
				if(gd.getSelectedItem().equals("10"))
				{
					grade = 10;
					pic.setIcon(img1);
				}
				else if(gd.getSelectedItem().equals("11"))
				{
					grade = 11;
				}
				else 
				{
					grade = 12;
				}
				
				dis.setText("First name: " + FN + " Last name: " + LN 
						+ " and your grade is: " + grade);
			}
		});
		panel.add(S);
		
		JButton C = new JButton("Clear");
		C.setBounds(282, 108, 154, 63);
		C.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				fn.setText(" ");
				ln.setText(" ");	
			}
		});
		panel.add(C);
		

	}
}
