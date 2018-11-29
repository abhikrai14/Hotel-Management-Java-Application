import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Font;

public class ShowBooking extends JFrame {

	private JPanel contentPane;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the frame.
	 * @param list 
	 */
	public ShowBooking(LinkedList list2) {
		
		list = list2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Calibri", Font.PLAIN, 15));
		textArea.setBounds(46, 145, 608, 264);
		contentPane.add(textArea);
		
		JLabel lblCount = new JLabel(" ");
		lblCount.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblCount.setBounds(207, 90, 271, 21);
		contentPane.add(lblCount);
		
		btnNewButton = new JButton("Show Bookings");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
 		        
 		       int c = list.count();
 		      lblCount.setText(" Total Bookings "+ c);
 		      
 		      list.printlist();
 		      
 		      String res = list.getlist();
 		      textArea.setText(res);
			}
		});
		btnNewButton.setBounds(261, 34, 166, 27);
		contentPane.add(btnNewButton);
		setSize(720,485);    setVisible(true);
		
	}
}
