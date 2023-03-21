package Mar_20;

public class assigmentExceptionEg {
	
			void display() {
				try {
				int i = 1/0;
				System.out.println(i);
				}
				catch (Exception e) {
				System.out.println("Invalid Devision");	
				}}
			void show() {
				try {
					String a= "Tushar";
					int n= Integer.parseInt(a);
					System.out.println(n);
				}
					catch (Exception e) {
					System.out.println("Format Mismatch");	
					}}
			void print() {
				try {
					int cal = 1+50/0;
					System.out.println(cal);
					}
					catch (Exception e) {
					System.out.println("Calculation Invalid");	
					}}
			void run() {
				try {
					int arr [] = new int[5];
					arr[7]=10;
					}
					catch (Exception e) {
					System.out.println("Array index is Invalid");	
					}}
			void s() {
				System.out.println();
				String s ="Exception handling completed";
				System.out.println(s);	
			}
			public static void main(String[] args) {
			assigmentExceptionEg  ea =new assigmentExceptionEg();
				ea.display();
				ea.show();
				ea.print();
				ea.run();
				ea.s();
			}
		}