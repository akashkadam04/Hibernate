package ak;
import java.util.*;



//Assignment of String no.1

//class Demo4 {
//
//	public static void main(String[] args) {
//	      Scanner sc = new Scanner(System.in);
//	      System.out.println("Enter a string:");
//          String s = sc.next();
//          String rs = "";
//          for(int i=0;i<s.length();i++) {
//        	  rs = s.charAt(i) + rs;
//          }
//          System.out.println("Reversed string is:"+rs);
//	}
//}

//Assignment of String no.5

//class Demo4{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a String:");
//		String s = sc.next();
//		String rs = "";
//		for(int i=0;i<s.length();i++) {
//			rs = s.charAt(i) + rs;
//		}
//		if(s.equalsIgnoreCase(rs)) {
//			System.out.println("String is Palindrome!");
//		}
//		else {
//			System.out.println("String is not Palindrome!");
//		}
//		
//	}
//}

//Assignment of String no.4

class Demo4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String:");
		String s = sc.next();
		char c[] = s.toCharArray();
		char ch = ' ';
		for(int i=0;i<s.length();i++) {
		     if(c[i]==ch) {
		    	 
		     }
		}
		System.out.println("Highest occuring character is:"+ch);
	}
}


//Assignment of String no.3

//class Demo4{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string:");
//		String s = sc.nextLine();
//		char c[] = s.toCharArray();
//		int index = 0;
//		for(int i=0;i<s.length();i++) {
//			int j;
//			for(j=0;j<i;j++) {
//				if(c[i]==c[j]) {
//					break;
//				}
//			}
//			if(j==i) {
//				c[index++] = c[i];
//			}
//		}
//		System.out.println(String.valueOf(Arrays.copyOf(c, index)));
//	}
//}

//Assignment of String no.2

//class Demo4{
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string:");
//		String s = sc.nextLine();
//		System.out.println("Enter a position:");
//		int a = sc.nextInt();
//		char c = 'b';
//		StringBuilder str = new StringBuilder(s);
//		str.setCharAt(a, c);
//		System.out.println("Modified string is: "+str);
//		
//	}
//}







































































































































































































































