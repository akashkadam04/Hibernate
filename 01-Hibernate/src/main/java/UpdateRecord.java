import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID for updation:");
		int a = sc.nextInt();
		System.out.println("Enter marks for updation:");
		float d = sc.nextFloat();
		System.out.println("Enter name for updation:");
		String s = sc.next();
		Student stu = session.get(Student.class, a);
		stu.setMarks(d);
		stu.setName(s);
		session.update(stu);
		txn.commit();
		System.out.println("Record Updated..!");

	}

}
