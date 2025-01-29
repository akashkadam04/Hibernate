package ak;
import java.util.*;

//Assignment of Interface no.1

//interface A{
//	
//	 public void get(int number1); 
//}
//class B implements A{
//	int number1;
//	int number2;
//	public void get(int number1) {
//		this.number1=number1;
//	}
//	public void accept(int number2) {
//		this.number2=number2;
//	}	
//}
//class C {
//	public void max(int number1,int number2) {
//		if(number1>number2) {
//			System.out.println("Max number:"+number1);
//		}
//		else {
//			System.out.println("Max number:"+number2);
//		}
//	}	
//}
//public class Demo3 {
//
//	public static void main(String[] args) {
//	   B b = new B();
//	   C c = new C();	   
//	   b.get(20);
//	   b.accept(25);
//	   c.max(20, 25);
//	}
//}

//Assignment of Interface no.2

interface Shape{
	public void get(int length1);
	public void get1(int length2);
}
class Demo3 implements Shape{
	int length1,length2;
	public void get(int length1) {
		this.length1=length1;
		System.out.println("Value of length1:"+length1);
	}
	public void get1(int length2) {
		this.length2=length2;
		System.out.println("Value of length2:"+length2);
	}
	public static void main(String[] args) {
		Demo3 d = new Demo3();
		d.get(5);
		d.get1(6);
	}
}



























