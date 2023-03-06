package Facebook;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Panel;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class success extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblPleaseEnjoyThe;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					success frame = new success();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public success() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(""));
		setTitle("https://facebook.com/home");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 505);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 128, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("WELCOME TO FACEBOOK");
		lblNewLabel.setBounds(184, 11, 244, 23);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		contentPane.add(lblNewLabel);
		
		lblPleaseEnjoyThe = new JLabel("PLEASE HAVE FUN USING FACEBOOK <3");
		lblPleaseEnjoyThe.setBounds(106, 75, 413, 23);
		lblPleaseEnjoyThe.setHorizontalAlignment(SwingConstants.CENTER);
		lblPleaseEnjoyThe.setFont(new Font("Tahoma", Font.PLAIN, 19));
		contentPane.add(lblPleaseEnjoyThe);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Justine\\Documents\\Earl\\images__1_-removebg-preview.png"));
		lblNewLabel_1.setBounds(26, 122, 203, 208);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Justine\\Documents\\Earl\\images__2_-removebg-preview.png"));
		lblNewLabel_2.setBounds(351, 122, 229, 208);
		contentPane.add(lblNewLabel_2);
	}

}
