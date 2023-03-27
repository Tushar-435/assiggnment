package Thread;

public class EvenoddThreadAss extends Thread{
	public void run() {
		System.out.println("Even number");
		for(int i=1; i<=100; i++) {
			if (i%2==0) {    
				System.out.print(i+" "); 
		}}
		System.out.println();
		System.out.println("odd number");
				for(int j=1; j<=100; j++) {
					if(j%2!=0)    
						System.out.print(j+" "); 
				}}
						
		public static void main(String[] args) {
			// object decide the number of intervals
			EvenoddThreadAss t = new EvenoddThreadAss();
			t.start(); // 1st interval
			
	}}
