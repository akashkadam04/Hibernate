package com.main;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Account;

public class TestMain {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Scanner s = new Scanner(System.in);

		System.out.println("Enter your choice:");
		System.out.println("1.Insert \n2.Get \n3.Delete \n4.Update \n5.Deposit \n6.Withdraw \n7.Exit");
		while(true) {
			switch(s.nextInt()) {
			case 1:
				insertRecord(session, s);
				break;
				
			case 2:
				getRecord(session, s);
				break;
				
			case 3:
				deleteRecord(session, s);
				break;
				
			case 4:
				updateRecord(session, s);
				System.out.println("Enter your choice:");
				System.out.println("1.Name \n2.Address \n3.MobileNo \n4.Type \n4.Gender");		   
			    	switch(s.nextInt()) {
					case 1:
						updateName(session, s);
						break;
						
					case  2:
						updateAddress(session, s);
						break;
						
					case 3:
						updateMobileNo(session, s);
						break;
						
					case 4:
						updateType(session, s);
						break;
						
					case 5:
						updateGender(session, s);
						break;						
					}
			    
				break;
				
			case 5:
				depositAmount(session, s);
				break;
				
			case 6:
				withdrawAmount(session, s);
				break;
				
			case 7:
				System.exit(0);
				
			default:
				System.out.println("Enter valid choice");	
			}	
		}		
	}

	private static void withdrawAmount(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
		System.out.println("Enter AcNo to withdraw amount:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println("Enter withdrawal amount:");
		double w = s.nextDouble();
		if(w<acc.getBalance()) {
			acc.setBalance(acc.getBalance()-w);
			session.update(acc);
			txn.commit();
		}
		else {
			System.out.println("Insufficient Balance..!");
		}
	}

	private static void depositAmount(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
		System.out.println("Enter AcNo to deposit amount:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println("Enter deposit amount:");
		double d = s.nextDouble();
		acc.setBalance(acc.getBalance()+d);
		session.update(acc);
		txn.commit();
	}

	private static void updateGender(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
        System.out.println("Enter AcNo to update Account Gender:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println("Enter gender for updation:");
		String g = s.next();
		acc.setGender(g);
		session.update(acc);
		txn.commit();
		System.out.println("Record Updated..!");
	}

	private static void updateType(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
        System.out.println("Enter AcNo to update Account Type:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println("Enter Type for updation:");
        String t = s.next();
        acc.setAcType(t);
		session.update(acc);
		txn.commit();
		System.out.println("Record Updated..!");
	}

	private static void updateMobileNo(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
        System.out.println("Enter AcNo to update Account MobileNo:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println("Enter mobileNo for updation:");
        Long m = s.nextLong();
        acc.setMobileNo(m);
		session.update(acc);
		txn.commit();
		System.out.println("Record Updated..!");
	}

	private static void updateAddress(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
        System.out.println("Enter AcNo to update Account Address:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println("Enter address for updation:");
        String a = s.next();
        acc.setAddress(a);
		session.update(acc);
		txn.commit();
		System.out.println("Record Updated..!");
	}

	private static void updateName(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
        System.out.println("Enter AcNo to update Account Name:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println("Enter Name for updation:");
        String n = s.next();
        acc.setAcName(n);
		session.update(acc);
		txn.commit();
		System.out.println("Record Updated..!");
	}

	private static void updateRecord(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
        System.out.println("Enter AcNo to update record:");
		Account acc = session.get(Account.class, s.nextLong());
		session.update(acc);
		txn.commit();
		
	}

	private static void deleteRecord(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
        System.out.println("Enter AcNo to delete record:");
		Account acc = session.get(Account.class, s.nextLong());
        session.delete(acc);
        txn.commit();
        System.out.println("Record deleted..!");
	}

	private static void getRecord(Session session, Scanner s) {
		System.out.println("Enter AcNo to get record:");
		Account acc = session.get(Account.class, s.nextLong());
		System.out.println(acc);
	}

	private static void insertRecord(Session session, Scanner s) {
		Transaction txn = session.beginTransaction();
		
		Account acc = new Account();
		
		System.out.println("Enter acNo,acName,address,mobileNo,aadharNo,panNo,balance,acType,gender:");
		acc.setAcNo(s.nextLong());
		acc.setAcName(s.next());
		acc.setAddress(s.next());
		acc.setMobileNo(s.nextLong());
		acc.setAadharNo(s.nextLong());
		acc.setPanNo(s.next());
		acc.setBalance(s.nextDouble());
		acc.setAcType(s.next());
		acc.setGender(s.next());
		
		session.save(acc);
		txn.commit();
		System.out.println("Account Added..!");
	}

}
