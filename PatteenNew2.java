package ControlStatement;

public class PatteenNew2 {
public static void main(String[] args) {
	for (int i=1; i<=5; i++) { // loop to print the number of spaces before the star *
		for (int j=5; j>=i; j--) {
			System.out.print(" "); 
			}// loop to print the number of stars in each row
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
	}

	}
}