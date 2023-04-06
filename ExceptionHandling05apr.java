package IO;

import java.util.Scanner;

public class ExceptionHandling05apr {
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st");
		int a=sc.nextInt();
		System.out.println("enter 2nd");
		int b=sc.nextInt();
		System.out.println("enter string");
		String str=sc.next();
		        try {
		        	System.out.println("result :"+ a / b);
		        } catch (ArithmeticException e) {
		            System.out.println("Invalid division");
		        }

		        try {
		 
		            int num = Integer.parseInt(str);
		        } catch (NumberFormatException e) {
		            System.out.println("Format mismatch");
		        }

		        try {
		           
		            char ch = str.charAt(10);
		        } catch (StringIndexOutOfBoundsException e) {
		            System.out.println("Index is invalid");
		        }

		        try {
		            int[] arr = {1, 2, 3};
		            int value = arr[5];
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println("Array index is invalid");
		        }

		        

		class MyException extends Exception {
		    private String pallabi;

		    public MyException(String pallabi) {
		        this.pallabi = pallabi;
		    }

		    public String getPallabi() {
		        return pallabi;
		    }}
		    try {
	            throw new MyException(" Exception");
	        } catch (MyException e) {
	            System.out.println("My Exception[" + e.getPallabi() + "]");
	        }

	        try {
	            
	        } catch (Exception e) {
	            System.out.println("Exception encountered");
	        } finally {
	            System.out.println("Exception Handling Completed");
	        }
		}}