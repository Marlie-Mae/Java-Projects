import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;

public class BookShop {

	private JFrame frame;
	private JTextField txtbname;
	private JTextField txtbedition;
	private JTextField txtbprice;
	private JTable table;
	private JTextField txtbid;

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
		Connect();
		table_load();
	}
	
	Connection con;
	PreparedStatement pst;
	ResultSet rs;
	
	public void Connect() {
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        con = DriverManager.getConnection("jdbc:mysql://localhost:3307/javacrud", "root", "");
	        System.out.println("Database connected successfully.");
	    } catch (ClassNotFoundException ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Database Driver not found!");
	    } catch (SQLException ex) {
	        ex.printStackTrace();
	        JOptionPane.showMessageDialog(null, "Failed to connect to database! Check your connection settings.");
	    }
	}
	
	public void table_load () 
	{
		try {
			pst = con.prepareStatement("select * from book");
			rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setSize(745, 420);
		frame.getContentPane().setBackground(new Color(85, 107, 47));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Book Shop");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(278, 11, 203, 60);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 35));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 204, 0));
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
		
		txtbprice = new JTextField();
		txtbprice.setColumns(10);
		txtbprice.setBounds(109, 91, 150, 20);
		panel.add(txtbprice);
		
		JButton btnsave = new JButton("Save");
		btnsave.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnsave.setForeground(new Color(0, 0, 0));
		btnsave.setBackground(new Color(255, 204, 51));
		btnsave.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String bname, edition, price;
		        
		        bname = txtbname.getText();
		        edition = txtbedition.getText();
		        price = txtbprice.getText();
		        
		        try {
		            pst = con.prepareStatement("insert into book(name,edition,price)values(?,?,?)");
		            pst.setString(1, bname);
		            pst.setString(2, edition);
		            pst.setString(3, price);
		            pst.executeUpdate();
		            JOptionPane.showMessageDialog(null, "Record Added!");
		            
		            // Clear the input fields
		            txtbname.setText("");
		            txtbedition.setText("");
		            txtbprice.setText("");
		            txtbname.requestFocus();
		            
		            // Refresh the table to show the new record
		            table_load();
		        } catch (SQLException e1) {
		            e1.printStackTrace();
		        }
		    }
		});	
		
		btnsave.setBounds(23, 245, 89, 23);
		frame.getContentPane().add(btnsave);
		
		JButton btnexit = new JButton("Exit");
		btnexit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnexit.setForeground(new Color(0, 0, 0));
		btnexit.setBackground(new Color(255, 204, 51));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnexit.setBounds(122, 245, 89, 23);
		frame.getContentPane().add(btnexit);
		
		JButton btnclear = new JButton("Clear");
		btnclear.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnclear.setForeground(new Color(0, 0, 0));
		btnclear.setBackground(new Color(255, 204, 51));
		btnclear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtbname.setText("");
				txtbedition.setText("");
				txtbprice.setText("");
				txtbname.requestFocus();
				
			}
		});
		btnclear.setBounds(221, 245, 89, 23);
		frame.getContentPane().add(btnclear);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBackground(new Color(204, 204, 0));
		scrollPane.setBounds(320, 82, 386, 190);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBackground(new Color(255, 255, 255));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(204, 204, 0));
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(24, 290, 298, 68);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblBookId = new JLabel("Book ID");
		lblBookId.setBounds(21, 25, 83, 17);
		lblBookId.setFont(new Font("Tahoma", Font.BOLD, 14));
		panel_1.add(lblBookId);
		
		txtbid = new JTextField();
		txtbid.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				 try {
                     
                     String id = txtbid.getText();
                         pst = con.prepareStatement("select name,edition,price from book where id = ?");
                         pst.setString(1, id);
                         ResultSet rs = pst.executeQuery();
                     if(rs.next()==true)
                     {
                       
                         String name = rs.getString(1);
                         String edition = rs.getString(2);
                         String price = rs.getString(3);
                         
                         txtbname.setText(name);
                         txtbedition.setText(edition);
                         txtbprice.setText(price);
 
                     }   
                     else
                     {
                         txtbname.setText("");
                         txtbedition.setText("");
                         txtbprice.setText("");
                          
                     }
                 } 
             
              catch (SQLException ex) {
                    
                 }		
			}
		});
		txtbid.setBounds(114, 25, 159, 20);
		txtbid.setColumns(10);
		panel_1.add(txtbid);
		
		JButton btnupdate = new JButton("Update");
		btnupdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnupdate.setForeground(new Color(0, 0, 0));
		btnupdate.setBackground(new Color(204, 153, 102));
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String bname,edition,price,bid;
                
                bname = txtbname.getText();
                edition = txtbedition.getText();
                price = txtbprice.getText();
                bid  = txtbid.getText();
                
                 try {
                        pst = con.prepareStatement("update book set name= ?,edition=?,price=? where id =?");
                        pst.setString(1, bname);
                        pst.setString(2, edition);
                        pst.setString(3, price);
                        pst.setString(4, bid);
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(null, "Record Update!");
                        table_load();
                       
                        txtbname.setText("");
                        txtbedition.setText("");
                        txtbprice.setText("");
                        txtbname.requestFocus();
                    }

                    catch (SQLException e1) {
                        
                        e1.printStackTrace();
                    }
			}
		});
		btnupdate.setBounds(413, 304, 89, 46);
		frame.getContentPane().add(btnupdate);
		
		JButton btndelete = new JButton("Delete");
		btndelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btndelete.setForeground(new Color(0, 0, 0));
		btndelete.setBackground(new Color(204, 153, 102));
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		           String bid;
		           
		           bid  = txtbid.getText();
		           
		            try {
		                   pst = con.prepareStatement("delete from book where id =?");
		           
		                   pst.setString(1, bid);
		                   pst.executeUpdate();
		                   JOptionPane.showMessageDialog(null, "Record Delete!");
		                   table_load();
		                  
		                   txtbname.setText("");
		                   txtbedition.setText("");
		                   txtbprice.setText("");
		                   txtbname.requestFocus();
		               }

		               catch (SQLException e1) {
		                   
		                   e1.printStackTrace();
		               }
			}
		});
		btndelete.setBounds(554, 304, 89, 46);
		frame.getContentPane().add(btndelete);
	}
}
