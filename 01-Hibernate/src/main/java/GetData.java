import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID:");
		int a = sc.nextInt();
		Student stu = session.get(Student.class, a);
		System.out.println(stu);

	}

}

