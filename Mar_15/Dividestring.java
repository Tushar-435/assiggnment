package Mar_15;

import java.util.Scanner;

public class Dividestring {
	
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Enter a string:");
		        String str = scanner.nextLine();
		        int strLength = str.length();
		        for (int i = 0; i < strLength; i++) {
		            char ch = str.charAt(i);
		            System.out.print(ch+" ");     
		        }
		        System.out.println();
		        }}