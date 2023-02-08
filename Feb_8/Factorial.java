package Feb_8;

import java.util.Scanner;

public class Factorial {
		public static void main(String[] args) {
			//take a scanner class object
			Scanner sc=new Scanner(System.in);
			int n, fact=1;
			System.out.println("enter the number to find factorial");
			n=sc.nextInt();
			 while(n>0) {
				 fact=fact*n;
				 n=n-1;
			 }
			 System.out.println("factorial="+  fact);
					}
		}





