package com.main;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.config.HibernateUtil;
import com.model.Customer;
import com.model.Department;
import com.model.Employee;
import com.model.Laptop;
import com.model.Product;


public class TestMain {
public static void main(String[] args) {
	
	SessionFactory factory = HibernateUtil.getSessionFactory();
	Session session = factory.openSession();
	Transaction txn = session.beginTransaction();

	//ManytoMany
	
	Product p1 = new Product(101,"TV","Black");
	Product p2 = new Product(102,"Monitor","Black");
	Product p3 = new Product(103,"Printer","Black");
	Product p4 = new Product(104,"Mobile","Black");
	Product p5 = new Product(105,"LAptop","Black");
	
	Set<Product> pset1 =  new HashSet<Product>();
	pset1.add(p1);
	pset1.add(p2);
	pset1.add(p3);
	pset1.add(p4);
	pset1.add(p5);
	
	
	Set<Product> pset2 =  new HashSet<Product>();
	pset2.add(p1);
	pset2.add(p2);
	pset2.add(p3);
	pset2.add(p4);
	pset2.add(p5);
	
	Customer c1 = new Customer(1001,"Akash",87649876543l,pset1);
	
	Customer c2 = new Customer(1002,"Ram",87649876543l,pset2);
	
	Set<Customer> cset = new HashSet<Customer>();
	cset.add(c2);
	cset.add(c1);
	
	p1.setcSet(cset);
	p2.setcSet(cset);
	p3.setcSet(cset);
	p4.setcSet(cset);
	p5.setcSet(cset);
	
	session.save(c1);
	session.save(c2);
	txn.commit();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//OnetoMany or ManytoOne
	
//	Employee e1 = new Employee(101,"Akash",987654399l);
//	Employee e2 = new Employee(102,"Ram",987654399l);
//	Employee e3 = new Employee(103,"Shyam",987654399l);
//	Employee e4 = new Employee(104,"Mahesh",987654399l);
//	Employee e5 = new Employee(105,"Rohit",987654399l);
//	
//	Set<Employee> set1 = new HashSet<Employee>();
//	set1.add(e1);
//	set1.add(e2);
//	set1.add(e3);
//	
//	Department d1 = new Department();
//	d1.setDid(1001);
//	d1.setDname("IT");
//	
//	Set<Employee> set2 = new HashSet<Employee>();
//	set2.add(e4);
//	set2.add(e5);
//	
//	Department d2 = new Department();
//	d1.setDid(1002);
//	d1.setDname("COMP");
//	
//	e1.setDept(d1);
//	e2.setDept(d1);
//    e3.setDept(d1);	
//	
//	e4.setDept(d2);
//	e5.setDept(d2);
//	
//	session.save(d1);
//	session.save(d2);
//	
//	txn.commit();
	
	
	
	//OnetoOne
//	Employee e1 = new Employee();
//	e1.setEid(101);
//	e1.setEname("Akash");
//    e1.setMono(9876543232l);
//    
//    Laptop l1 = new Laptop();
//    l1.setLid(1001);
//    l1.setLname("Mac");
//    l1.setPrice(10000);
//    
//    e1.setLap(l1);
//    l1.setEmp(e1);
//    
//    session.save(l1);
//    session.save(e1);
//    txn.commit();
    
	
}
}
