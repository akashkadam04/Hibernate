import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction txn = session.beginTransaction();

		Student stu = new Student();
		stu.setRno(1);
		stu.setName("Akash");
		stu.setMarks(80);

		session.save(stu);
		txn.commit();

	}

}
