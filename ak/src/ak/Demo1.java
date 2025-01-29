package ak;
import java.util.*;

 //Assignment of constructor no.1

//class Employee{
//	Scanner sc = new Scanner(System.in);
//	int eid,age;
//	String name;
//	Employee(){
//	     System.out.println("Enter id of employee:");
//	     eid = sc.nextInt();
//	     System.out.println("Enter name of employee:");
//	     name = sc.next();
//	     System.out.println("Enter age of employeer:");
//	     age = sc.nextInt();   
//	     
//	     if(age<18) {
//	    	 System.out.println("Not eligible for voting!");
//	     }
//	     else {
//	    	 System.out.println("Eligible for voting!");
//	     }
//	   }
//}
//public class Demo1 {
//	public static void main(String[] args) {
//		Employee e = new Employee();
//	}
//
//}


//Assignment of constructor no.2

//class Bank{
//	Scanner sc = new Scanner(System.in);
//	int bid;
//	String bname,branch;
//	Bank(){
//		System.out.println("Enter id of bank:");
//		bid = sc.nextInt();
//		System.out.println("Enter name of bank:");
//		bname = sc.next();
//		System.out.println("Enter branch of bank:");
//		branch = sc.next();		
//	}
//	public void deposit(int a) {
//		System.out.println("Deposit amount is:"+a);
//	}
//	
//	public void withdrawl(int b) {
//		System.out.println("Withdrawl amount is:"+b);
//	}
//	public void check_balance(int a,int b) {
//		int c = a-b;
//		System.out.println("Final balance is:"+c);
//		
//	}
//	
//	
//}
//public class Demo1{
//	public static void main(String[] args) {
//		Bank b = new Bank();
//		b.deposit(10000);
//		b.withdrawl(2000);		
//		b.check_balance(10000, 2000);
//	}
//}

//Assignment of constructor no.3

//class College{
//	Scanner sc = new Scanner(System.in);
//	int cid,no_of_students;
//	String cname;
//	College(){
//		System.out.println("Enter id of college:");
//		cid = sc.nextInt();
//		System.out.println("Enter name of college:");
//		cname = sc.next();
//		System.out.println("No of students in a college:");
//		no_of_students = sc.nextInt();
//	}
//	public void display() {
//		System.out.println(cid+"\t\t"+cname+"\t\t"+no_of_students);
//	}
//}
//public class Demo1{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many records you want:");
//		int n = sc.nextInt();
//		College c[] = new College[n];
//		for(int i=0;i<n;i++) {
//			c[i] = new College();
//		}
//		System.out.println("College id\t"+"name\t"+"no_of_students");
//		for(int i=0;i<n;i++) {
//			 c[i].display();
//		}
//		
//	}
//}


//Assignment of constructor no.4

//class Shape{
//	Scanner sc = new Scanner(System.in);
//	double r,s,l,b,h,w;
//	double pi = 3.14;
//	Shape(){
//		System.out.println("Enter radius:");
//		r = sc.nextDouble();
//		System.out.println("Enter side:");
//		s = sc.nextDouble();
//		System.out.println("Enter length:");
//		l = sc.nextDouble();
//		System.out.println("Enter breadth:");
//		b = sc.nextDouble();
//		System.out.println("Enter heigth:");
//		h = sc.nextDouble();
//		System.out.println("Enter width:");
//		w = sc.nextDouble();
//		
//		double c = pi * r * r;
//		System.out.println("Area of circle:"+c);
//		
//		double r = l * w;
//		System.out.println("Area of rectangle:"+r);
//		
//		double t = 0.5 * b * h;
//		System.out.println("Area of triangle:"+t);
//		
//		double sq = s * s;
//		System.out.println("Area of square:"+sq);				
//	}
//}
//public class Demo1{
//	public static void main(String[] args) {
//		Shape sh = new Shape();		
//	}
//}

//Assignment of constructor no.5

//class date{
//	Scanner sc = new Scanner(System.in);
//	int d,m,y;
//	date(int d,int m,int y){		
//		this.d = d;		
//		this.m = m;		
//		this.y = y;				
//	}
//	date(date d){
//		if(d.y%4==0) {
//			System.out.println("This is a leap year!");
//		}
//		else {
//			System.out.println("This is not a leap year!");
//		}		
//	}	
//}
//class Demo1{
//	public static void main(String[] args) {
//		date d1 = new date(12,05,2021);
//		date d2 = new date(d1);		
//	}
//}



































































