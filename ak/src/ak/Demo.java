package ak;

import java.io.*;
import java.util.*;
import java.util.function.ToIntFunction;

//class Employee{
//	private int eid,salary;
//	private String ename;
//	public int  getEid() {
//		return eid;
//	}
//	public int getSalary() {
//		return salary;
//	}
//	public String getName() {
//		return ename;
//	}
//	public Employee(int eid,String ename,int salary) {
//		this.eid=eid;
//		this.ename=ename;
//		this.salary=salary;
//	}
//	public String toString() {
//		return "Emp: [Eno "+eid+"  Ename "+ename+"  Salary "+salary+"]";
//	}
//}
//
//class Demo  {		
//	public static void main(String[] args) 
//	{  
//		Scanner sc = new Scanner(System.in);
//		List l = new ArrayList();
//		System.out.println("Enter number of employess: ");
//		int n = sc.nextInt();
//		
//		for(int i=0;i<n;i++) {
//			
//			System.out.println("Enter id of employee:");
//            int eid = sc.nextInt();
//            System.out.println("Enter name of employee:");
//            String ename = sc.next();
//            System.out.println("Enter salary of employee:");
//            int salary = sc.nextInt();
//            
//            l.add(new Employee(eid,ename,salary));             
//		}
//		Iterator itr = l.iterator();
//        while(itr.hasNext()) {
//        System.out.println(itr.next());
//        }
//		l.sort(Comparator.comparingInt(Employee::getSalary));
//		System.out.println("Sorted by salary:");
//		System.out.println(l);	
//	}
//}



//class A extends Thread {
//	public void run() {
//		for(int i=1;i<5;i++) {
//			String s = Thread.currentThread().getName();
//			System.out.println(s);
//		}
//	}
//}
//class B extends Thread {
//	public void run() {
//		for(int i=1;i<3;i++) {
//			System.out.println("HEllo");
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

//class Demo {
//	public static void main(String[] args) throws InterruptedException {
//		
//		A a1 = new A();
//		A a2 = new A();
//		A a3 = new A();
////		B b1 = new B();
////		
////		System.out.println(b1.isAlive());
//		
//		a1.setName("Thread --1");
//		a2.setName("Thread --2");
//		a3.setName("Thread --3");
//		
//		a3.start();
//		a3.join();
//		a1.start();
//		a2.start();
//		for(int i=1;i<3;i++) {
//			System.out.println(Thread.currentThread().getName());
//		}
//		
//	}
//}


//class Bank extends Thread {
//	static double bal = 5000;
//	static double withdraw;
//	Bank(double withdraw){
//		this.withdraw=withdraw;
//	}
//	public static synchronized void m1() {
//		String s = Thread.currentThread().getName();
//		if(withdraw<=bal) {
//			System.out.println(s + " money withdrawl");
//			bal = bal - withdraw;
//		}
//		else {
//			System.out.println("Insufficient bal");
//		}
//	}
//	public void run() {
//		m1();
//	}
//}
//
//class Demo{
//	public static void main(String[] args) throws InterruptedException {
//		Bank b = new Bank(5000);
//		Bank b1 = new Bank(5000);
//		Bank b2 = new Bank(5000);
//
//		Thread t1 = new Thread(b);
//		Thread t2 = new Thread(b1);
//		Thread t3 = new Thread(b2);
//           
//		t1.setName("Akash");
//		t2.setName("Ram");
//		t3.setName("Shyam");
//		
//		t1.start();
//		t2.start();
//		t3.start();
//
//	}
//}

//class A extends Thread{
//	String s;
//	A(String name){
//		s=name;
//	}
//	public void run() {
//		if(Thread.currentThread().isDaemon()) {
//		System.out.println(s+ " is a Daemon thhread..!");
//		}	
//	   else {
//		System.out.println(s+" User thread");
//	}
//	}
//}
//
//class Demo{
//	public static void main(String[] args) {
//	  A a1 = new A("Thread--1");	
//	  A a2 = new A("Thread--2");	
//	  A a3 = new A("Thread--3");	
//	  
//	  a1.setDaemon(true);
//	  a1.start();
//	  a2.start();
//	  a3.setDaemon(true);
//	  a3.start();
//
//	}
//}



class Demo{
	public static void main(String[] args) throws IOException {
				

	}
}












































