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
import java.awt.Font;

public class DeleteBooking extends JFrame {

	private JPanel contentPane;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	private JButton btnDeleteAllBookings;
	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the frame.
	 * @param list 
	 */
	public DeleteBooking(LinkedList list2) {
		
		list = list2;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("Delete First Booking");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				 
 		        
 		       list.delete_first();
			}
		});
		btnNewButton.setBounds(95, 134, 215, 29);
		contentPane.add(btnNewButton);
		
		btnDeleteAllBookings = new JButton("Delete All Bookings");
		btnDeleteAllBookings.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnDeleteAllBookings.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				list.delete_all();
			}
		});
		btnDeleteAllBookings.setBounds(95, 251, 215, 29);
		contentPane.add(btnDeleteAllBookings);
		setSize(441,442);    setVisible(true);
	}
}
