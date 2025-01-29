import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;

import net.proteanit.sql.DbUtils;

import java.awt.Color;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Student {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t5;
	private JTextField t6;
	private JTable table;
     PreparedStatement pst;
	 Connection con;
	 ResultSet rs;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void connect() throws ClassNotFoundException, SQLException  {
		 String url = "jdbc:mysql://localhost:3306/t1";
         String user = "root";
         String pass = "root";
         Class.forName("com.mysql.cj.jdbc.Driver");
         con = DriverManager.getConnection(url,user,pass);
         System.out.println("Connection Successful!!!");
	}
	
	public void tableLoad() throws Exception {
		 
		
	}
	
	public Student() throws Exception {
		initialize();
		connect();
		tableLoad();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(128, 255, 255));
		frame.setBounds(100, 100, 1134, 652);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Sid");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(39, 60, 123, 13);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(39, 101, 114, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter Mo. Number");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(39, 141, 154, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter Birthdate");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(39, 185, 154, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter Marks");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(39, 226, 154, 13);
		frame.getContentPane().add(lblNewLabel_4);
		
		t1 = new JTextField();
		t1.setBounds(240, 49, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(240, 101, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(240, 141, 96, 19);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(240, 226, 96, 19);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		JDateChooser t4 = new JDateChooser();
		t4.setBounds(240, 179, 96, 19);
		frame.getContentPane().add(t4);
		
		t6 = new JTextField();
		t6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				try {
					String t = t6.getText();
					
				
					if (!t.isEmpty()) {
		
						int id = Integer.parseInt(t6.getText());
						pst = con.prepareStatement("select * from student where id="+id);
						
						rs = pst.executeQuery();
						
						if(rs.next()) {
							t1.setText(rs.getString(1));
							t2.setText(rs.getString(2));
							t3.setText(rs.getString(3));
							t4.setDate(rs.getDate(4));
							t5.setText(rs.getString(5));
						}else {
							t1.setText(null);
							t2.setText(null);
							t3.setText(null);
							t4.setDate(null);
							t5.setText(null);
						}
					}else {
						t1.setText(null);
						t2.setText(null);
						t3.setText(null);
						t4.setDate(null);
						t5.setText(null);
					}
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				
			}
		
		});
		t6.setBounds(240, 265, 96, 19);
		frame.getContentPane().add(t6);
		t6.setColumns(10);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id,name,MoNumber,marks;
				java.util.Date Birthdate ;
				
				
				id = t1.getText();
			    name = t2.getText();
				MoNumber = t3.getText();
				Birthdate = t4.getDate();
				marks = t5.getText();
				
				if(Birthdate!=null){
			          java.sql.Date  date = new java.sql.Date(Birthdate.getTime());

				try {
					pst = con.prepareStatement("insert into student values(?,?,?,?,?)");
					pst.setString(1,id);
					pst.setString(2,name);
					pst.setString(3,MoNumber);
					pst.setDate(4, date);
					pst.setString(5,marks);
					pst.executeUpdate();
					tableLoad();
					JOptionPane.showMessageDialog(null, "Record Inserted");
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
					t4.setDate(null);
					t5.setText(null);


				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}	
			}
				}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(36, 324, 85, 21);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Update");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                String id,name,MoNumber,marks;
                java.util.Date Birthdate ;
				
				id = t1.getText();
			    name = t2.getText();
				MoNumber = t3.getText();
				Birthdate = t4.getDate();
				marks = t5.getText();
				java.sql.Date  date = new java.sql.Date(Birthdate.getTime());
				try {
					pst = con.prepareStatement("update student set name=?,mono=?,Birthdate=?,marks=? where id=?");
					pst.setString(5, id);
					pst.setString(1,name);
					pst.setString(2,MoNumber);
					pst.setDate(3,date);
					pst.setString(4,marks);
					pst.executeUpdate();
					try {
						tableLoad();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					JOptionPane.showMessageDialog(null, "Record Updated");
					t1.setText(null);
					t2.setText(null);
					t3.setText(null);
					t4.setDate(null);
					t5.setText(null);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(128, 324, 105, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_2.setBounds(247, 324, 105, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		JButton btnNewButton_3 = new JButton("Delete");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String id,name,MoNumber,Birthdate,marks;
					
					id = t1.getText();
				    name = t2.getText();
					MoNumber = t3.getText();
					Birthdate = t4.getToolTipText();
					marks = t5.getText();
					
					try {
						pst = con.prepareStatement("delete from student where id=?");
						pst.setString(1, id);
						pst.executeUpdate();
						try {
							tableLoad();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						JOptionPane.showMessageDialog(null, "Record Deleted");
						t1.setText(null);
						t2.setText(null);
						t3.setText(null);
						t4.setDate(null);
						t5.setText(null);
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_3.setBounds(373, 324, 105, 21);
		frame.getContentPane().add(btnNewButton_3);
		
		JScrollPane scrollPane = 
				new JScrollPane();
		scrollPane.setBounds(613, 47, 481, 376);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"ID", "Name", "Mo. Number", "Birthdate", "Marks"
			}
		));
		
		JLabel lblNewLabel_5 = new JLabel("Enter sid to get record");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(39, 265, 191, 21);
		frame.getContentPane().add(lblNewLabel_5);
	}
}
