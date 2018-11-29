
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MyFrame extends JFrame implements ActionListener{
	private JLabel l0 = new JLabel("  Hotel Booking Application  ");
	private int index=0;

	private LinkedList list=new LinkedList();

	public MyFrame(String s){
		super(s);
		//init_Flight_list();
		Container content=getContentPane();
		Font f=new Font("TimesRoman", Font.BOLD,20);
		getContentPane().setLayout(null);
		l0.setBounds(64, 45, 308, 27);
		l0.setFont(new Font("Calibri", Font.BOLD, 25));  
		content.add(l0);
		
		JButton btnNewButton = new JButton("Add Booking");
		btnNewButton.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AddBooking addbook = new AddBooking(list);
			}
		});
		btnNewButton.setBounds(110, 136, 184, 27);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Show Bookings");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ShowBooking showbook = new ShowBooking(list);
			}
		});
		btnNewButton_1.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_1.setBounds(110, 194, 184, 27);
		getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search Booking");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				SearchBooking searchbook = new SearchBooking(list);
			}
		});
		btnNewButton_2.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_2.setBounds(110, 254, 184, 27);
		getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Delete Booking");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				DeleteBooking searchbook = new DeleteBooking(list);
			}
		});
		btnNewButton_3.setFont(new Font("Calibri", Font.PLAIN, 20));
		btnNewButton_3.setBounds(110, 311, 184, 27);
		getContentPane().add(btnNewButton_3);
		setSize(441,442);    setVisible(true);}

	public void actionPerformed(ActionEvent e)
	{
		 Object target=e.getSource();
	}
	


}