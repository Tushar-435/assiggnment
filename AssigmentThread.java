package Thread;

 class AssigmentThread extends Thread {
			/*public void run() {	
				System.out.println("Thread First");
				 System.out.println("Tushar");
				try {
					Thread.sleep(1000);
					// System.out.println("Tushar");
				}
				catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("Thread Second");
				// System.out.println("10/5= "+10/5);
				System.out.println("riya");
				try {
					Thread.sleep(1000);
					// System.out.println("Ram");;
				}
				catch (Exception e) {
					System.out.println(e);
				}
			}
			public static void main(String[] args) {
				// object decide the number of intervals
				AssigmentThread t = new AssigmentThread();
				t.start(); // 1st interval
				try {
					t.join();		
				} 
				catch (Exception e) {
					System.out.println(e);
				}

		}}*/
	 public void run()  {    
		 System.out.println("first code:");    
		 }      
		 // main method  
		 public static void main(String arg[])  {   
		 // creating an object of the class MyThread2  
			 Thread r1 = new  AssigmentThread();   
		 // creating an object of the class Thread using Thread(Runnable r, String name)  
		 Thread t = new Thread(r1, "second code is");    
		 t.start();   
		 String s = t.getName();  
		 System.out.println(s);  
		 }    
		 }