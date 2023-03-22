package Mar_21;

import java.util.Scanner;

public class Assigment1 {
	 void addtwopositive() {
		Scanner sc=new Scanner(System.in);
		try {
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println(" ");
		String s="Non positive";
		int n=Integer.parseInt(s);
		System.out.println(n);
		}
		catch(Exception e) {
			System.out.println(e);
	}}
	public static void main(String[] args) {
			Assigment1 c=new Assigment1();
			c.addtwopositive();
		}
	}
