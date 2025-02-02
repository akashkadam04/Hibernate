package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.DyChinchwad;
import com.model.DyPatil;
import com.model.DyPune;

public class TestMain {
public static void main(String[] args) {
	
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction txn = session.beginTransaction();
	
	//InheritanceMapping->tableperclass
	DyPune  pune = new DyPune();
	pune.setSid(1);
	pune.setSname("Mahesh");
	pune.setMono(987654322);
	pune.setHostelFacility(true);
	
	DyChinchwad ch = new DyChinchwad();
	ch.setSid(2);
	ch.setSname("Ramesh");
	ch.setBusFacility(false);
	ch.setMono(87654321321l);
	
	DyPatil  dy = new DyPatil();
	dy.setSid(3);
	dy.setSname("Akash");
    dy.setMono(987432112346l);
	
    session.save(pune);
    session.save(ch);
    session.save(dy);
    txn.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	//INheritance Mapping->Single Table
	
//	DyPune pune = new DyPune();
//	pune.setSid(103);
//	pune.setSname("Akash");
//	pune.setMono(986542332);
//	pune.setHostelFacility(true);
//	
//	DyChinchwad ch = new DyChinchwad();
//	ch.setSid(104);
//	ch.setSname("Ram");
//	ch.setMono(98763214321l);
//	ch.setBusFacility(false);
//	
//	session.save(ch);
//	session.save(pune);
//	txn.commit();
	
	

	
	
	//INheritance Mapping->Joined
	
//	DyPune pune = new DyPune();
//	pune.setSid(101);
//	pune.setSname("Akash");
//	pune.setMono(986542332);
//	pune.setHostelFacility(true);
//	
//	DyChinchwad ch = new DyChinchwad();
//	ch.setSid(102);
//	ch.setSname("Ram");
//	ch.setMono(98763214321l);
//	ch.setBusFacility(false);
//	
//	session.save(ch);
//	session.save(pune);
//	txn.commit();
	
	
}
}
