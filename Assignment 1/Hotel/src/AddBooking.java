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

public class AddBooking extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfContact;
	private JTextField tfRoomType;
	private JTextField tfRoomNumber;

	LinkedList list = new LinkedList();
	private JButton btnNewButton;
	private JLabel lblBookingTime;
	private JTextField tfBookingTime;
	private JLabel lblAddDetails;
	private JButton button;
	/**
	 * Launch the application.
	 */
	 

	/**
	 * Create the frame.
	 * @param list 
	 */
	public AddBooking(LinkedList list2) {
		
		list = list2;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name :");
		lblName.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblName.setBounds(28, 109, 96, 21);
		contentPane.add(lblName);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Calibri", Font.PLAIN, 20));
		tfName.setBounds(197, 107, 343, 21);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblContactNumber = new JLabel("Contact Number :");
		lblContactNumber.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblContactNumber.setBounds(28, 152, 159, 27);
		contentPane.add(lblContactNumber);
		
		tfContact = new JTextField();
		tfContact.setFont(new Font("Calibri", Font.PLAIN, 20));
		tfContact.setBounds(197, 152, 227, 22);
		contentPane.add(tfContact);
		tfContact.setColumns(10);
		
		JLabel lblRoomType = new JLabel("Room Type :");
		lblRoomType.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblRoomType.setBounds(28, 196, 127, 26);
		contentPane.add(lblRoomType);
		
		tfRoomType = new JTextField();
		tfRoomType.setFont(new Font("Calibri", Font.PLAIN, 20));
		tfRoomType.setBounds(197, 197, 165, 21);
		contentPane.add(tfRoomType);
		tfRoomType.setColumns(10);
		
		JLabel lblRoomnumber = new JLabel("RoomNumber :");
		lblRoomnumber.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblRoomnumber.setBounds(28, 244, 143, 26);
		contentPane.add(lblRoomnumber);
		
		tfRoomNumber = new JTextField();
		tfRoomNumber.setFont(new Font("Calibri", Font.PLAIN, 20));
		tfRoomNumber.setBounds(197, 244, 80, 22);
		contentPane.add(tfRoomNumber);
		tfRoomNumber.setColumns(10);
		
		btnNewButton = new JButton("Add Booking");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String n = tfName.getText();
				String c = tfContact.getText();
				int rn = Integer.parseInt(tfRoomNumber.getText());
				String rt = tfRoomType.getText();
				String time=tfBookingTime.getText();
                int indexOf=time.indexOf(":");
 		        String part1=time.substring(0,indexOf);
 		        String part2=time.substring(indexOf+1);
 		        int h=Integer.parseInt(part1);
 		        int m=Integer.parseInt(part2);   
 		        
 		       list.insert(n, c, h, m, rn, rt);
			}
		});
		btnNewButton.setBounds(214, 362, 148, 35);
		contentPane.add(btnNewButton);
		
		lblBookingTime = new JLabel("Booking Time :");
		lblBookingTime.setFont(new Font("Calibri", Font.PLAIN, 20));
		lblBookingTime.setBounds(28, 294, 137, 21);
		contentPane.add(lblBookingTime);
		
		tfBookingTime = new JTextField();
		tfBookingTime.setFont(new Font("Calibri", Font.PLAIN, 20));
		tfBookingTime.setBounds(197, 292, 159, 21);
		contentPane.add(tfBookingTime);
		tfBookingTime.setColumns(10);
		
		lblAddDetails = new JLabel("Add Details");
		lblAddDetails.setFont(new Font("Calibri", Font.BOLD, 25));
		lblAddDetails.setBounds(213, 28, 143, 35);
		contentPane.add(lblAddDetails);
		
		button = new JButton("New button");
		button.setBounds(472, 370, 85, 21);
		contentPane.add(button);
		setSize(609,466);    setVisible(true);
	}
}
