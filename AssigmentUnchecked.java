package Mar_22;

import java.util.Scanner;

public class AssigmentUnchecked {
	public static void main(String[] args) {
		try {
			try {
				// Arithmetic exception
				int a =5/0;
				System.out.println(a);
				}
				catch(Exception e) {
				System.out.println(e);
				}
			finally {
				System.out.println("arithmetic exception");
			}
				// null pointer exception
				try {
					String s = null;
					System.out.println(s.length());
				}
				catch(Exception e) {
					System.out.println(e);
				}
				finally {
					System.out.println(" null pointer exception");
				}
				// ArrayIndexoutofbound exception
				try {
					int arr [] = new int[5];
					arr[8]=24;
				}
				catch(Exception e) {
					System.out.println(e);
				}
				finally {
					System.out.println("finally block ");
				}
			}
			catch(Exception e) {
				System.out.println(e);		
			}
		finally {
			System.out.println("Differernt unchecked exceptions done");
		}
		}
	}