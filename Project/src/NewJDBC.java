import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.*;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import javax.swing.JScrollPane;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class NewJDBC {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	PreparedStatement pst;
	Connection con;
	ResultSet rs;
	private JTable table;
	private JTextField t4;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewJDBC window = new NewJDBC();
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
	
	public void connect() throws Exception {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/t1","root","root");
		System.out.println("Connection successful..!");
	}
	
	public void tableLoad() throws Exception {
		pst = con.prepareStatement("select * from st1");
		rs = pst.executeQuery();
		table.setModel(DbUtils.resultSetToTableModel(rs));
		
	}
	
	public NewJDBC() throws Exception {
		initialize();
		connect();
		tableLoad();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 907, 498);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Student CURD");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(76, 35, 173, 25);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Roll No:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(28, 92, 74, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(28, 138, 67, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Marks:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(28, 181, 69, 13);
		frame.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBounds(112, 92, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(112, 138, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(112, 181, 96, 19);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		JButton b1 = new JButton("Insert");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rno,name,marks;
				
				rno = t1.getText();
				name = t2.getText();
				marks = t3.getText();
				
				try {
					pst = con.prepareStatement("insert into st1 values(?,?,?)");
					pst.setString(1, rno);
					pst.setString(2, name);
					pst.setString(3, marks);
					pst.executeUpdate();
					try {
						tableLoad();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                    JOptionPane.showMessageDialog(null, "Record Inserted..!");
                    t1.setText(null);
                    t2.setText(null);
                    t3.setText(null);

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(28, 259, 96, 21);
		frame.getContentPane().add(b1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(378, 44, 364, 298);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Roll No", "Name", "Marks"
			}
		));
		
		t4 = new JTextField();
		t4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				int rno;
				
		}
		});
		t4.setBounds(112, 212, 96, 19);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("RNO to search record");
		lblNewLabel_4.setBounds(39, 218, 45, 13);
		frame.getContentPane().add(lblNewLabel_4);
	}
}





















