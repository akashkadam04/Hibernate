package com.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Account;


import net.proteanit.sql.DbUtils;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class AccSwing {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField t3;
	private JTextField t4;
	private JTextField t5;
	private JTextField t6;
	private JTextField t7;
	private JTextField t8;
	private JTextField t9;
	private JTable table;

	Connection con1;
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Scanner s = new Scanner(System.in);
	private JTextField t10;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccSwing window = new AccSwing();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void tableLoad() throws Exception {
		
	}
		
		   
	

	public AccSwing() throws Exception {
		initialize();
		tableLoad();
		
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1011, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(139, 49, 121, 29);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter acNo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(30, 104, 189, 29);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Enter acName:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(30, 143, 189, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Enter acAddress:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(30, 186, 189, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Enter MobileNo:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(30, 229, 189, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Enter AddharNo:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_5.setBounds(30, 271, 189, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Enter PanNo:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_6.setBounds(30, 319, 189, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Enter acBalance:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_7.setBounds(30, 366, 189, 22);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Enter acType:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_8.setBounds(30, 406, 189, 22);
		frame.getContentPane().add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Enter Gender:");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_9.setBounds(30, 455, 189, 22);
		frame.getContentPane().add(lblNewLabel_9);
		
		t1 = new JTextField();
		t1.setBounds(193, 112, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBounds(193, 143, 96, 19);
		frame.getContentPane().add(t2);
		t2.setColumns(10);
		
		t3 = new JTextField();
		t3.setBounds(193, 189, 96, 19);
		frame.getContentPane().add(t3);
		t3.setColumns(10);
		
		t4 = new JTextField();
		t4.setBounds(193, 234, 96, 19);
		frame.getContentPane().add(t4);
		t4.setColumns(10);
		
		t5 = new JTextField();
		t5.setBounds(193, 276, 96, 19);
		frame.getContentPane().add(t5);
		t5.setColumns(10);
		
		t6 = new JTextField();
		t6.setBounds(193, 324, 96, 19);
		frame.getContentPane().add(t6);
		t6.setColumns(10);
		
		t7 = new JTextField();
		t7.setBounds(193, 371, 96, 19);
		frame.getContentPane().add(t7);
		t7.setColumns(10);
		
		t8 = new JTextField();
		t8.setBounds(193, 411, 96, 19);
		frame.getContentPane().add(t8);
		t8.setColumns(10);
		
		t9 = new JTextField();
		t9.setBounds(193, 460, 96, 19);
		frame.getContentPane().add(t9);
		t9.setColumns(10);
		
		JButton b1 = new JButton("Insert");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				try {
                   
                    long acNo = Long.parseLong(t1.getText());
                    String acName = t2.getText();
                    String address = t3.getText();
                    long mobileNo = Long.parseLong(t4.getText());
                    long aadharNo = Long.parseLong(t5.getText());
                    String panNo = t6.getText();
                    double balance = Double.parseDouble(t7.getText());
                    String acType = t8.getText();
                    String gender = t9.getText();

     
                    Transaction txn = session.beginTransaction();

         
                    Account acc = new Account();
                    acc.setAcNo(acNo);
                    acc.setAcName(acName);
                    acc.setAddress(address);
                    acc.setMobileNo(mobileNo);
                    acc.setAadharNo(aadharNo);
                    acc.setPanNo(panNo);
                    acc.setBalance(balance);
                    acc.setAcType(acType);
                    acc.setGender(gender);


                    session.save(acc);
                    txn.commit();
                    tableLoad();
					JOptionPane.showMessageDialog(null, "Record Inserted");
					t1.setText(null);      
					t2.setText(null); 
					t3.setText(null); 
					t4.setText(null); 
					t5.setText(null); 
					t6.setText(null); 
					t7.setText(null); 
					t8.setText(null); 
					t9.setText(null); 

                } catch (Exception ex) {
                    ex.printStackTrace();
                }
				
				
				
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(30, 544, 102, 21);
		frame.getContentPane().add(b1);
		
		JButton b2 = new JButton("Delete");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					long acNo=Long.parseLong(t1.getText());
					Transaction txn = session.beginTransaction();
					String hql = "delete from Account where acNo=:acNo";
					Query q = session.createQuery(hql);
					q.setParameter("acNo", acNo);
					q.executeUpdate();
					txn.commit();				
					tableLoad();
					JOptionPane.showMessageDialog(null, "Record Deleted");
					t1.setText(null);       
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		b2.setFont(new Font("Tahoma", Font.BOLD, 18));
		b2.setBounds(155, 544, 105, 21);
		frame.getContentPane().add(b2);
		
		JButton b3 = new JButton("Update");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				long acNo=Long.parseLong(t1.getText());
				String acName = t2.getText();
				String address = t3.getText();				
				long mobileNo = Long.parseLong(t4.getText());
				long aadharNo = Long.parseLong(t5.getText());
				String panNo = t6.getText();
				double balance = Double.parseDouble(t7.getText());
				String acType = t8.getText();
				String gender = t9.getText();
				try {
					Transaction txn = session.beginTransaction();
					String hql = "update Account set acName=:acName,address=:address,mobileNo=:mobileNo where acNo=:acNo";
					Query q = session.createQuery(hql);
					System.out.println("Enter acNo to update:");
					q.setParameter("acNo", acNo);
					System.out.println("Enter new name:");
					q.setParameter("acName", acName);
					System.out.println("Enter new mobile No:");
					q.setParameter("mobileNo", mobileNo);
					q.executeUpdate();
					txn.commit();				
					tableLoad();
					JOptionPane.showMessageDialog(null, "Record Updated");
					t1.setText(null);      
					t2.setText(null); 
					t3.setText(null); 
					t4.setText(null); 
					t5.setText(null); 
					t6.setText(null); 
					t7.setText(null); 
					t8.setText(null); 
					t9.setText(null); 
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		b3.setFont(new Font("Tahoma", Font.BOLD, 18));
		b3.setBounds(281, 544, 102, 21);
		frame.getContentPane().add(b3);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(382, 75, 605, 405);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"acNo", "acName", "acAddress", "MobileNo", "AddharNo", "PANNo", "acBalance", "acType", "Gender"
			}
		));
		
		JLabel lblNewLabel_10 = new JLabel("Enter acNo to Search Record:");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(30, 500, 230, 34);
		frame.getContentPane().add(lblNewLabel_10);
		
		t10 = new JTextField();
		t10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent e) {
				
				String t = t10.getText();
				if(!t.isEmpty()) {
					long acNo=Long.parseLong(t1.getText());
					String acName = t2.getText();
					String address = t3.getText();				
					long mobileNo = Long.parseLong(t4.getText());
					long aadharNo = Long.parseLong(t5.getText());
					String panNo = t6.getText();
					double balance = Double.parseDouble(t7.getText());
					String acType = t8.getText();
					String gender = t9.getText();
					
					String hql = "from Account";
					Query q = session.createQuery(hql);
					Transaction txn = session.beginTransaction();
					 Account acc = new Account();
	                    acc.setAcNo(acNo);
	                    acc.setAcName(acName);
	                    acc.setAddress(address);
	                    acc.setMobileNo(mobileNo);
	                    acc.setAadharNo(aadharNo);
	                    acc.setPanNo(panNo);
	                    acc.setBalance(balance);
	                    acc.setAcType(acType);
	                    acc.setGender(gender);
	                    
	                    session.save(acc);
	                    txn.commit();
	                    
					
				}else {
					t1.setText(null);      
					t2.setText(null); 
					t3.setText(null); 
					t4.setText(null); 
					t5.setText(null); 
					t6.setText(null); 
					t7.setText(null); 
					t8.setText(null); 
					t9.setText(null); 
					
				}
				
				
			}
		});
		t10.setBounds(246, 510, 96, 19);
		frame.getContentPane().add(t10);
		t10.setColumns(10);
	}
}
