import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class BookShop {

	private JFrame frame;
	private JTextField txtbname;
	private JTextField txtbedition;
	private JTextField txtpbprice;
	private JTable table;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookShop window = new BookShop();
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
	public BookShop() {
		initialize();
	}
	
	Connection con;
	PreparedStatement pst;
	
	public void Connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/bookshop", "root", "");
		}
		catch (ClassNotFoundException ex)
		{
			
		}
		catch (SQLException ex)
		{
			
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setBounds(185, 11, 178, 60);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(23, 92, 287, 134);
		panel.setBorder(new TitledBorder(null, "Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblBook = new JLabel("Book Name");
		lblBook.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblBook.setBounds(10, 30, 89, 14);
		panel.add(lblBook);
		
		JLabel lblEdition = new JLabel("Edition");
		lblEdition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEdition.setBounds(10, 65, 63, 14);
		panel.add(lblEdition);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPrice.setBounds(10, 96, 63, 14);
		panel.add(lblPrice);
		
		txtbname = new JTextField();
		txtbname.setBounds(109, 29, 150, 20);
		panel.add(txtbname);
		txtbname.setColumns(10);
		
		txtbedition = new JTextField();
		txtbedition.setColumns(10);
		txtbedition.setBounds(109, 60, 150, 20);
		panel.add(txtbedition);
		
		txtpbprice = new JTextField();
		txtpbprice.setColumns(10);
		txtpbprice.setBounds(109, 91, 150, 20);
		panel.add(txtpbprice);
		
		JButton btnsave = new JButton("Save");
		btnsave.setBounds(23, 245, 89, 23);
		frame.getContentPane().add(btnsave);
		
		JButton btnexit = new JButton("Exit");
		btnexit.setBounds(122, 245, 89, 23);
		frame.getContentPane().add(btnexit);
		
		JButton btnclear = new JButton("Clear");
		btnclear.setBounds(221, 245, 89, 23);
		frame.getContentPane().add(btnclear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(320, 82, 270, 190);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 290, 298, 68);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setBounds(21, 25, 83, 17);
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblBookId);
		
		textField_2 = new JTextField();
		textField_2.setBounds(114, 25, 159, 20);
		textField_2.setColumns(10);
		panel_1.add(textField_2);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setBounds(356, 304, 89, 46);
		frame.getContentPane().add(btnUpdate);
		
		JButton btnclear_1_1 = new JButton("Delete");
		btnclear_1_1.setBounds(475, 304, 89, 46);
		frame.getContentPane().add(btnclear_1_1);
	}
}
