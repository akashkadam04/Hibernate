package com.main;

import java.util.*;

import org.hibernate.*;

import com.config.HibernateUtil;
import com.model.Employee;

public class TestMain {


	public static void main(String[] args) {
	
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1.GetData \n2.Delete \n3.Update \n4.GetDataSQL \n5.Exit");
		while(true) {
			switch(s.nextInt()) {
			case 1:
				getDatabyHQL();
				break;
				
			case 2:
				deleteRecordbyHQl();
				break;
				
			case 3:
				updaterecordbyHQL();
				break;
				
			case 4:
				getdatabySQL();
				break;
				
			case 5:
				System.exit(0);
				
			default:
				System.out.println("Enter valid choice..!");
			}
		}
        
	}

	private static Scanner getdatabySQL() {
		
		Scanner s = new Scanner(System.in);
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		String sql = "select * from Employee";
		Query q = session.createSQLQuery(sql).addEntity(Employee.class);
		List<Employee> eList = q.getResultList();
		System.out.println(eList);
		return s;
	}

	private static void updaterecordbyHQL() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Scanner s = new Scanner(System.in);
		Transaction txn = session.beginTransaction();
		String hql = "update Employee set ename=:ename,salary=:salary,mono=:mono where eid=:eid";
		Query q = session.createQuery(hql);
		System.out.println("Enter id to update:");
		q.setParameter("eid", s.nextInt());
		System.out.println("Enter new name:");
		q.setParameter("ename", s.next());
		System.out.println("Enter new salary:");
		q.setParameter("salary", s.nextDouble());
		System.out.println("Enter new mobile No:");
		q.setParameter("mono", s.nextLong());
		q.executeUpdate();
		txn.commit();
		System.out.println("Record Updated..!");
		List<Employee> eList = q.getResultList();
		System.out.println(eList);
	}

	private static void deleteRecordbyHQl() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Scanner s = new Scanner(System.in);
		Transaction txn = session.beginTransaction();
		String hql = "delete from Employee where eid=:eid";
		Query q = session.createQuery(hql);
		q.setParameter("eid", 2);
		q.executeUpdate();
		txn.commit();
		System.out.println("Record Deleted..!");
	}

	private static void getDatabyHQL() {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		
		String hql = "from Employee";
		Query q = session.createQuery(hql);
		List<Employee> eList = q.getResultList();
		System.out.println(eList);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private static void updateRecord(Session session, Scanner s) {
//		Transaction txn = session.beginTransaction();
//        System.out.println("Enter eid to update record:");
//		Employee emp = session.get(Employee.class, s.nextInt());
//		System.out.println("Enter new name:");
//		emp.setEname(s.next());
//		System.out.println("Enter new salary:");
//		emp.setSalary(s.nextDouble());
//		System.out.println("Enter new Mobile No:");
//		emp.setMono(s.nextLong());
//		session.update(emp);
//		txn.commit();
//		System.out.println("Record Updated..!");
//	}
//
//	private static void deleteRecord(Session session, Scanner s) {
//		Transaction txn = session.beginTransaction();
//        System.out.println("Enter eid to delete record:");
//		Employee emp = session.get(Employee.class, s.nextInt());
//        session.delete(emp);
//        txn.commit();
//        System.out.println("Record deleted..!");
//	}
//
//	private static void getRecord(Session session, Scanner s) {
//		System.out.println("Enter eid to get record:");
//		Employee emp = session.get(Employee.class, s.nextInt());
//		System.out.println(emp);
//	}
//
//	private static void insertRecord(Session session, Scanner s) {
//		Transaction txn = session.beginTransaction();
//		Employee emp = new Employee();
//		
//		System.out.println("Enter eid,ename,salary,mono:");
//		emp.setEid(s.nextInt());
//		emp.setEname(s.next());
//		emp.setSalary(s.nextDouble());
//		emp.setMono(s.nextLong());
//		
//		session.save(emp);
//		txn.commit();
//		System.out.println("Employee Added..!");
//	}

}

//System.out.println("Enter your choice:");
//System.out.println("1.Insert \n2.Get \n3.Delete \n4.Update \n5.Exit");
//while(true) {
//	switch(s.nextInt()) {
//	case 1:
//		insertRecord(session, s);
//		break;
//		
//	case 2:
//		getRecord(session, s);
//		break;
//		
//	case 3:
//		deleteRecord(session, s);
//		break;
//		
//	case 4:
//		updateRecord(session, s);
//		break;
//		
//	case 5:
//		System.exit(0);
//		break;
//		
//	default:
//		System.out.println("Enter valid choice..!");
//	}
//}






//<link href="style.css" rel="stylesheet" type="text/css">




