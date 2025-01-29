package ak;
import java.util.Scanner;

//Assignment of Exception Handling No.01

//class InvalidRollNoException extends Exception
//{
//	public InvalidRollNoException(String message) {
//	}
//}
//class InvalidAgeException extends Exception{
//	public InvalidAgeException(String message) {
//	}
//}
//
//class Demo5 {		
//	public static void main(String[] args) throws InvalidRollNoException,InvalidRollNoException
//	{  
//		    Scanner sc = new Scanner(System.in);
//			System.out.println("Enter roll number:");
//			int rollno = sc.nextInt();
//			if(rollno<=0) {
//		    	throw new InvalidRollNoException("ROLL_NO_NOT_VALID");
//		    }
//			System.out.println("Enter name:");
//			String name = sc.next();			
//			System.out.println("Enter age:");
//			int age = sc.nextInt();
//			if(age<18) {
//		    	throw new InvalidAgeException("AGE_IS_NOT_Valid_FOR_WORKING");
//		    }	
//			System.out.println("Data is:\t"+rollno+"\t"+name+"\t"+age);
//	}
//}
	
//Assignment of Exception Handling No.02

class InvalidSalaryException extends Exception{
	public InvalidSalaryException(String msg) {
		super(msg);
	}
}
class Demo5{
	public static void main(String[] args) throws InvalidSalaryException
	{
		    Scanner sc = new Scanner(System.in);
			System.out.println("Enter id of employee:");
			int eid = sc.nextInt();
			System.out.println("Enter name:");
			String name = sc.next();
			System.out.println("Enter salary:");
			int salary = sc.nextInt();
			if(salary<=0) {
				throw new InvalidSalaryException("Salary_Must_Be_Greater_Than_Zero");
			}
			else if(salary>70000){
				throw new InvalidSalaryException("Salary_Out_Of_Bounds");

			}
			System.out.println("Data is:\t"+eid+"\t"+name+"\t"+salary);		
	}
}


































