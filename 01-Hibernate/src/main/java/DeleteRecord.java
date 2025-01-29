import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID for delete:");
		int a = sc.nextInt();
		Student stu = session.get(Student.class, a);
		session.delete(stu);
		txn.commit();
		System.out.println("Record Deleted..!");
	}

}
