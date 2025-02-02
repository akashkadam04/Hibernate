package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Student;
import com.model.StudentId;

public class TestMain {
public static void main(String[] args) {
	
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction txn = session.beginTransaction();
	
	StudentId id1 = new StudentId(101, 111);
	StudentId id2 = new StudentId(101, 222);
	
	Student s1 = new Student();
	s1.setStudentid(id1);
	s1.setName("Akash");
    s1.setMono(987654321);
    
    Student s2 = new Student();
    s2.setStudentid(id2);
	s2.setName("Raj");
    s2.setMono(887654321);
    
    session.save(s1);
    session.save(s2);
    txn.commit();
}

}
