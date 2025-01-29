package ak;
import java.util.*;

//Assignment of Class nd Object no.1

//class Bank{
//	Scanner sc = new Scanner(System.in);
//	int bid;
//	String bname,city;
//	public void getdata(){
//		System.out.println("Enter id of bank:");
//		bid = sc.nextInt();
//		System.out.println("Enter name of bank:");
//		bname = sc.next();
//		System.out.println("Enter city of bank:");
//		city = sc.next();		
//	}
//	public void putdata() {
//		System.out.println(bid+"\t"+bname+"\t"+city);
//	}
//}
//public class assi2 {
//
//	public static void main(String[] args) {
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many records you want:");
//		int n = sc.nextInt();
//		Bank b[] = new Bank[n];
//		for(int i=0;i<n;i++) {
//			b[i] = new Bank();
//			b[i].getdata();
//		}
//		System.out.println("Bank id\t"+"name\t"+"city");
//		for(int i=0;i<n;i++) {
//			 b[i].putdata();
//		}
//		
//
//	}
//
//}


//Assignment of Class nd Object no.2

//class Area{
//	int l,b;
//	void SetDim(int l,int b) {
//		this.l=l;
//		this.b=b;
//	}
//	void getarea() {
//		int r = l *b;
//		System.out.println("Area of rectangle:"+r);
//		
//	}
//	
//}
//class assi2{
//	public static void main(String[] args) {
//		Area a = new Area();
//		a.SetDim(5, 2);
//		a.getarea();
//	}
//}

//Assignment of Class nd Object no.3

//class Student{
//	int roll_no;
//	String name;
//	void disp(int r,String n) {
//		this.roll_no = r;
//		this.name = n;
//		System.out.println(r);
//		System.out.println(n);
//	}
//	
//}
//class assi2{
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.disp(2, "John");
//		
//	}
//}

//Assignment of Class nd Object no.4

//class Student{
//	int roll_no,ph_no;
//	String add;
//	void A(int r,int ph,String ad) {
//		this.roll_no = r;
//		this.ph_no = ph;
//		this.add = ad;
//		System.out.println("1st Student");
//		System.out.println(r+"\t"+ph+"\t"+ad);		
//	}
//	void B(int r,int ph,String ad) {
//		this.roll_no = r;
//		this.ph_no = ph;
//		this.add = ad;
//		System.out.println("2nd Student");
//		System.out.println(r+"\t"+ph+"\t"+ad);
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Student s = new Student();
//		s.A(1, 982855, "Ram");
//		s.B(2, 524985, "Shyam");
//	}
//}

//Assignment of Class nd Object no.5

//class Triangle{
//	Triangle(int a,int b,int c){
//		double area = 0.5 * a * b;
//		double peri = a * b * c;
//		System.out.println("Area of triangle:"+area);
//		System.out.println("Perimeter of triangle:"+peri);
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Triangle t = new Triangle(2,5,4);
//	}
//}

//Assignment of Class nd Object no.7

//class Area{
//	int l, b;
//	Area(int l,int b){
//		this.l=l;
//		this.b=b;
//		int area = l * b;
//		System.out.println("Area of rectangle is:"+area);
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Area a = new Area(4,5);
//		Area a1 = new Area(5,8);
//	}
//}


//Assignment of Class nd Object no.8

//class Area{
//	int l,b;
//	Area(int l,int b){
//		this.l=l;
//		this.b=b;
//	}
//	void returnArea() {
//		int area = l * b;
//		System.out.println("Area of rectangle is:"+area);
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Area a = new Area(4,5);
//		a.returnArea();
//	}
//}

//Assignment of Class nd Object no.9

//class Average{
//	void average() {
//		int a=5;
//		int b=7;
//		int c=9;
//		int d = a+b+c;
//		double e = d/3;
//		System.out.println("Average is:"+e);
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Average a = new Average();
//		a.average();
//	}
//}

//Assignment of Class nd Object no.10

//class Complex{
//	int real,img;
//	void sum(int r,int i) {
//		this.real=r;
//		this.img=i;
//		System.out.println(this.real+"i"+this.img);
//	}
//	public static void complex number add(complex c1,complex c2) {
//		int res = c1.real + c2.real;
//		int res1 = c1.img + c2.img;
//		int sum = res + res1;
//		System.out.println("Sum is:"+sum);
//	}
//	void difference(int r,int i) {
//		this.real=r;
//		this.img=i;
//		System.out.println("Difference is:"+(r-i));
//	}
//	void product(int r,int i) {
//		this.real=r;
//		this.img=i;
//		System.out.println("Product is:"+(r*i));
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Complex c = new Complex();
//		c.sum(5, 2);
//	    
//	}
//}


//Assignment of Class nd Object no.11

//class Employee{
//	Scanner sc = new Scanner(System.in);
//	int year;
//	String name,address;
//	void accept() {
//		System.out.println("Enter name:");
//		name = sc.next();
//		System.out.println("Enter year of joining:");
//		year = sc.nextInt();
//		System.out.println("Enter address:");
//		address = sc.next();
//	}
//	void display() {
//		System.out.println(name+"\t\t"+year+"\t\t"+address);
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many records you want:");
//		int n = sc.nextInt();
//		Employee e[] = new Employee[n];
//		for(int i=0;i<n;i++) {
//			e[i] = new Employee();
//			e[i].accept();
//		}
//		System.out.println("Name\t"+"Year of joining\t\t1"+"address");
//		for(int i=0;i<n;i++) {
//			e[i].display();
//		}
//	}
//}

//Assignment of Class nd Object no.12

class Distance{
	int feet,inches;
	void getdistance(int feet,int inches) {
		this.feet=feet;
	    this.inches=inches;
	}			
	void addDistance(Distance D1,Distance D2) {
		inches = D1.inches + D2.inches;
		feet = D1.feet + D2.feet + (inches/12);
		inches = inches%12;
		System.out.println("Total distance is:"+feet+"ft"+inches+"in");
	}	
}
class assi2{
	public static void main(String[] args) {
		Distance d1 = new Distance();
		d1.getdistance(5,12);
		Distance d2 = new Distance();
		d2.getdistance(6,12);
		Distance d3 = new Distance();
		d3.addDistance(d1, d2);		
	}
}

//Assignment of Class nd Object no.13

//class Employee{
//	int salary,work_perday;
//	void getInfo(int s,int wh) {
//		this.salary=s;
//		this.work_perday=wh;
//	}
//	void AddSal() {		
//		if(salary<500) {
//			salary = salary +10;
//			System.out.println("Final salary is:"+salary);
//		}
//		else {
//			System.out.println("Final salary is:"+salary);
//		}	
//	}
//	void AddWork() {	
//		if(work_perday>6) {
//			salary = salary + 5;
//			System.out.println("Final salary is:"+salary);
//		}
//		else {
//			System.out.println("Final salary is:"+salary);
//		}
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Employee e = new Employee();
//		e.getInfo(400, 7);
//		e.AddSal();
//		e.AddWork();
//	}
//}

//Assignment of Class nd Object no.14

//class Matrix{
//	Matrix(){
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter no of rows:");
//		int r = sc.nextInt();
//		System.out.println("Enter no of columns:");
//		int c = sc.nextInt();
//		int A[][] = new int[r][c];
//		System.out.println("Enter array elements:");
//        for(int i=0;i<r;i++) {
//        	for(int j=0;j<c;j++) {
//        		A[i][j]=sc.nextInt();
//        	}
//        }
//        for(int i=0;i<r;i++) {
//        	for(int j=0;j<c;j++) {
//        		System.out.println(A[i][j]);
//        	}
//        }       
//	}
//}
//class assi2{
//	public static void main(String[] args) {
//		Matrix m = new Matrix();
//	}
//}

//Assignment of Class nd Object no.16

//class Institute{
//	Scanner sc = new Scanner(System.in);
//	int price;
//	String name,course;
//	public void accept() {
//    	System.out.println("Enter name of institute:");
//	    name = sc.next();
//		System.out.println("Enter name of course:");
//	    course = sc.next();
//		System.out.println("Enter price of course:");
//	    price = sc.nextInt();
//	}
//    public void display() {
//		System.out.println(name+"\t\t"+course+"\t\t"+price);
//	}	
//}
//class assi2{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("How many records you want:");
//		int n = sc.nextInt();
//		Institute I[] = new Institute[n];
//		for(int i=0;i<n;i++) {
//			I[i] = new Institute();
//			I[i].accept();
//		}
//		System.out.println("Name\t\t"+"Course\t\t"+"Price");
//		for(int i=0;i<n;i++) {
//			I[i].display();
//		}
//	}
//}

//Assignment of Class nd Object no.15

//class Matrix{
//Matrix(){
//	Scanner sc = new Scanner(System.in);
//	System.out.println("Enter no of rows:");
//	int r = sc.nextInt();
//	System.out.println("Enter no of columns:");
//	int c = sc.nextInt();
//	int a[][] = new int[r][c];
//	System.out.println("Enter array elements:");
//    for(int i=0;i<r;i++) {
//    	for(int j=0;j<c;j++) {
//    		a[i][j]=sc.nextInt();
//    	}
//    }
//    System.out.println("Elements of array a:");
//    for(int i=0;i<r;i++) {
//    	for(int j=0;j<c;j++) {
//    		System.out.println(a[i][j]);
//    	}
//    } 
//    int b[][] = new int[r][c];
//	System.out.println("Enter array elements:");
//    for(int i=0;i<r;i++) {
//    	for(int j=0;j<c;j++) {
//    		b[i][j]=sc.nextInt();
//    	}
//    }
//    System.out.println("Elements of array b:");
//    for(int i=0;i<r;i++) {
//    	for(int j=0;j<c;j++) {
//    		System.out.println(b[i][j]);
//    	}
//    }
//    int C[][] = new int[a.length][b.length];
//    System.out.println("Adding two Matrices!");
//    for(int i=0;i<a.length;i++) {
//    	for(int j=0;j<a.length;j++) {
//    		C[i][j] = a[i][j] + b[i][j];
//    	}
//    }
//    for(int i=0;i<a.length;i++) {
//    	for(int j=0;j<a.length;j++) {
//    		System.out.println(C[i][j]);
//    	}
//    }
//    int D[][] = new int[a.length][b.length];
//    System.out.println("Multiplying two Matrices!");
//    for(int i=0;i<a.length;i++) {
//    	for(int j=0;j<b.length;j++) {
//    		D[i][j] += a[i][j] * b[i][j];
//    	}
//    }
//    for(int i=0;i<a.length;i++) {
//    	for(int j=0;j<b.length;j++) {
//    		System.out.println(D[i][j]);
//    	}
//    }
//    
//    
//  }
//}
//class assi2{
//    public static void main(String[] args) {
//	    Matrix m = new Matrix();
//  }
//}






























































































































































































