package ak;
import java.util.*;

//Assignment of inheritance no.1

//class Shop{
//	Scanner sc = new Scanner(System.in);
//	int sid;
//	String sname,city;
//	void accept() {
//		System.out.println("Enter id of shop:");
//		sid = sc.nextInt();
//		System.out.println("Enter name of shop:");
//		sname = sc.next();
//		System.out.println("Enter city of shop:");
//		city = sc.next();
//	}
//	public void display() {
//		System.out.println(sid+"\t\t"+sname+"\t\t"+city);
//	}
//}
////class Customer extends Shop{
////	Customer c = new Customer();
////	c.accept();
////	c.display();
////}
//public class Demo2 extends Shop{
//
//	public static void main(String[] args) {		
//		Demo2 d = new Demo2();
//		d.accept();
//		System.out.println("Shop id\t\t"+"name\t\t"+"city");
//		d.display();
//	}
//
//}

//Assignment of inheritance no.2

class Date{
	Scanner sc = new Scanner(System.in);
	int date,month,year;
	void accept() {
		System.out.println("Enter date:");
		date = sc.nextInt();
		System.out.println("Enter month:");
		month = sc.nextInt();
		System.out.println("Enter year:");
		year = sc.nextInt();
	}
	void display() {
		System.out.println("Date:"+date+"\t"+month+"\t"+year);
	}
}
class Demo2 extends Date{
	void validate() {
		if(month>12 || month==0 || date==0 || year==0 || date>31 ) {
			System.out.println("Date is invalid!");
		}
		else {
			System.out.println("Date is valid!");
		}
	}
	public static void main(String[] args) {
		Demo2 d = new Demo2();
		d.accept();
		d.display();
		d.validate();
		
	}
}

//Assignment of inheritance no.3

//class Shop{
//	Scanner sc = new Scanner(System.in);
//	int sid;
//	String stype,area;
//	void accept() {
//		System.out.println("Enter id od shop:");
//		sid = sc.nextInt();
//		System.out.println("Enter type of shop:");
//		stype = sc.next();
//		System.out.println("Enter area of shop:");
//		area = sc.next();
//	}
//	void display() {
//		System.out.println(sid+"\t\t"+stype+"\t\t"+area);
//	}
//}
//class Customer extends Shop{
//	Scanner sc = new Scanner(System.in);
//	int cid,qty,cost;
//	String cname,product;
//	void accept1() {
//		System.out.println("Enter cid:");
//		cid = sc.nextInt();
//		System.out.println("Enter cname:");
//		cname = sc.next();
//		System.out.println("Enter product:");
//		product = sc.next();
//		System.out.println("Enter quantity:");
//		qty = sc.nextInt();
//		System.out.println("Enter cost:");
//		cost = sc.nextInt();
//	}
//	void display1() {
//		int total_cost = cost * qty;
//		System.out.println("Total cost of product is:"+total_cost);
//	}
//}
//class Demo2 extends Customer{
//	public static void main(String[] args) {
//		Demo2 d = new Demo2();
//		d.accept();
//		d.display();
//		d.accept1();
//		d.display1();
//	}
//	
//}

































































































































