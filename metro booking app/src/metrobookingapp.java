import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metrobookingapp {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metrobookingapp window = new metrobookingapp();
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
	public metrobookingapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(128, 128, 128));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(70, 49, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(190, 46, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("source");
		lblNewLabel_1.setBounds(70, 95, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("destination");
		lblNewLabel_2.setBounds(70, 137, 66, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("num tickts");
		lblNewLabel_3.setBounds(70, 183, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "miyapur", "lb nagar", "dilsuknagar", "hitech city", "new market"}));
		cb1.setBounds(190, 91, 86, 18);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"select", "lb nagar", "dilsuknagar", "New market", "miyapur"}));
		cb2.setBounds(190, 133, 86, 20);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6", "7"}));
		cb3.setBounds(190, 179, 86, 20);
		frame.getContentPane().add(cb3);
		
		JLabel lblNewLabel_4 = new JLabel("METRO BOOKING APP");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(130, 11, 189, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\download.png"));
		lblNewLabel_5.setBounds(302, 0, 122, 261);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String)cb1. getSelectedItem();
				String destination=(String)cb2.getSelectedItem();
				String nt=(String)cb3.getSelectedItem();
				int numbertickts=Integer.parseInt(nt);
				int bill=0;
				if(source.equals(destination))
				{

					JOptionPane.showMessageDialog(btnNewButton,"please check stations");
				}
				else
				{
					bill=bill+45*numbertickts;
					JOptionPane.showConfirmDialog(btnNewButton,"name "+name+"\n source "+source+"\n destination "+destination+"\n num tickts "+nt+"\n bill "+bill);
				}
				
			}
		});
		btnNewButton.setBounds(142, 210, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
