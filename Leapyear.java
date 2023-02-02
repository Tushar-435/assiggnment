package ControlStatement;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int a=sc.nextInt();
		if(a%4==0) {
			System.out.println("This is the leap year");
		}
		else{
			System.out.println("This is not a leap year");
			
		}
	}

}
