package Feb_28;

 interface Bankaccountinterface { // parent interface 
	 
	 void deposit(); // method
	 void withdraw();
 }
 class CheckingAccount implements Bankaccountinterface { // child class

	@Override
	public void deposit() { // method
		System.out.println("Case deposite");
	}
	@Override
	public void withdraw() {
		System.out.println("Case withdraw");
	}}
	public class Bankaccount { // main class
		public static void main(String[] args) { // main method
			CheckingAccount obj=new CheckingAccount(); // creating object
			obj.deposit();
			obj.withdraw();
		}
		
		
		
	}

	


