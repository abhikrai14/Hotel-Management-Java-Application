
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Start extends JFrame implements ActionListener{
	private int index=0;

	private LinkedList list=new LinkedList();

	public Start(String s){
		super(s);
		//init_Flight_list();
		Container content=getContentPane();
		getContentPane().setLayout(null);
		
		JLabel lblWelcomeToHotel = new JLabel("Welcome to Hotel Booking Manager");
		lblWelcomeToHotel.setFont(new Font("Calibri", Font.BOLD, 25));
		lblWelcomeToHotel.setBounds(60, 81, 389, 39);
		getContentPane().add(lblWelcomeToHotel);
		Font f=new Font("TimesRoman", Font.BOLD,20);
		setSize(526,427);    setVisible(true);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setFont(new Font("Calisto MT", Font.PLAIN, 20));
		btnNewButton.setBounds(163, 229, 156, 39);
		getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				  MyFrame f = new MyFrame("");
				  
				  f.setVisible(true);
				  dispose();
				  
			}
		});	 
}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		this.setVisible(false);
	}}
	
	