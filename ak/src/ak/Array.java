package ak;

import java.util.*;

public class Array {

	public static void main(String[] args) {
		
		
		//Sort an Array ----5
		
//		int a[] = {2,5,9,3,1,8,845,55,58465,01};
//		Arrays.sort(a);
//		System.out.println(Arrays.toString(a));
		
		//Sum of diagonal elements of Array ---1
		
//		int b[][] = new int[3][3];
//		b[0][0] = 2;
//		b[0][1] = 6;
//		b[1][0] = 15;
//		b[1][1] = 36;
//		b[0][2] = 42;
//		b[1][2] = 25;
//		b[2][0] = 4;
//		b[2][1] = 10;
//		b[2][2] = 8;
//		System.out.println(Arrays.deepToString(b));
//		int sum = 0;
//		int add = 0;
//		for(int i=0;i<b.length;i++) {
//			sum = sum + b[i][i];
//			add = add + b[i][b.length-1];						
//		}
//		System.out.println(sum);
//		System.out.println(add);
		
		
		//Print array elements without for loop ---6
		
//		int a[] = {1,2,3,4,5,6};
//		System.out.println(Arrays.toString(a));
		
		//Print Matrix without loop
		
//		int b[][] = new int[3][3];
//		b[0][0] = 2;
//		b[0][1] = 6;
//		b[1][0] = 15;
//		b[1][1] = 36;
//		b[0][2] = 42;
//		b[1][2] = 25;
//		b[2][0] = 4;
//		b[2][1] = 10;
//		b[2][2] = 8;
//		System.out.println(Arrays.deepToString(b));
		
		//Accept 2 array from user and merge them ---4
		
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		for(int i=0;i<a.length;i++) {
			a[i]=s.nextInt();
	}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		int b[] = new int[2];
		for(int i=0;i<b.length;i++) {
			b[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);			
		}
		
		int a1 = a.length;
		int b1 = b.length;
		int c1 = a1 + b1;
		int c[] = new int[c1];
		System.arraycopy(a, 0, c, 0, a1);
		System.arraycopy(b, 0, c, a1, b1);		
		System.out.println("Merged array is:"+Arrays.toString(c));
		
		
		
		
		//Arithmetic multiplication of two matrices ---3
		
//		Scanner s = new Scanner(System.in);
//		int a[][] = new int[2][2];
//        System.out.println("Enter array elements:");
//        for(int i=0;i<2;i++) {
//          for(int j=0;j<2;j++) {
//            a[i][j]=s.nextInt();
//          
//          }
//        }
//        for(int i=0;i<2;i++) {
//          for(int j=0;j<2;j++) {
//            System.out.print(a[i][j]);         
//          }
//        }
//        
//        int b[][] = new int[2][2];
//        System.out.println("Enter array elements:");
//        for(int i=0;i<2;i++) {
//          for(int j=0;j<2;j++) {
//            b[i][j]=s.nextInt();
//          
//          }
//        }
//        for(int i=0;i<2;i++) {
//          for(int j=0;j<2;j++) {
//            System.out.print(b[i][j]);         
//          }
//        }
//        System.out.println();
//        int c[][] = new int[a.length][b.length];
//        for(int i=0;i<a.length;i++) {
//        	for(int j=0;j<b.length;j++) {
//        		c[i][j] +=  a[i][j] * b[i][j]; 
//        	}
//        }
//        for(int i=0;i<a.length;i++) {
//        	for(int j=0;j<b.length;j++) {
//        		System.out.println(c[i][j]);
//        	}
//        }
//        
        
		
	//Accept index and print given character in that index
		
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a string:");
//		String s = sc.nextLine();
//		System.out.println("Enter an index:");
//		int i = sc.nextInt();
//		char ch = 'z';
//		StringBuilder sb = new StringBuilder(s);
//		sb.setCharAt(i, ch);
//		System.out.println(sb);
//		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
