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

public class SearchBooking extends JFrame {

	private JPanel contentPane;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	private JTextField tfNames;
	private JLabel lblSearchByName;
	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the frame.
	 * @param list 
	 */
	public SearchBooking(LinkedList list2) {
		
		list = list2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea1 = new JTextArea();
		textArea1.setFont(new Font("Calibri", Font.PLAIN, 15));
		textArea1.setBounds(52, 145, 598, 244);
		contentPane.add(textArea1);
		
		JLabel lblCount = new JLabel(" ");
		lblCount.setBounds(187, 100, 45, 13);
		contentPane.add(lblCount);
		
		tfNames = new JTextField();
		tfNames.setFont(new Font("Calibri", Font.PLAIN, 20));
		tfNames.setBounds(224, 38, 343, 27);
		contentPane.add(tfNames);
		tfNames.setColumns(10);
		
		btnNewButton = new JButton("Search");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		
 		        
 		     String name = tfNames.getText();
 		    String res =  list.search(name);
 		     if(res.length() > 0) {
 		    	textArea1.setText(res);
 		     }
 		     else {
 		    	textArea1.setText(" No Bookings Found ");
 		     }
			}
		});
		btnNewButton.setBounds(269, 91, 144, 28);
		contentPane.add(btnNewButton);
		
		lblSearchByName = new JLabel("Search by Name :");
		lblSearchByName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblSearchByName.setBounds(70, 39, 162, 26);
		contentPane.add(lblSearchByName);
		setSize(710,478);    setVisible(true);
		
		
		
	}
}
