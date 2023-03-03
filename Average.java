package Mar_03;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		System.out.println("Enter forth number");
		int d=sc.nextInt();
		System.out.println("Enter fith number");
		int e=sc.nextInt();
		System.out.println("everage of array");
		int [] num= {a+b+c+d+e};
		
		for(int i=0; i < num.length ; i++)
	        sum = sum + num[i];
		double average = sum / num.length;
        System.out.println("Average value of the array elements is : " + average); 
		
	}

}
