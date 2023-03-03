package Mar_03;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("sum of array");
		int [] num= {a+b};
		for (int i=0; i<num.length;i++) { // here length shows variable used
			
			System.out.println(num[i]);
		}}}
