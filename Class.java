package Feb_10;

class Class1 {
	int Passbook;
	String name;
	float Payment;
	static String Bank="GTC";  // static variable
	 static void change(){
	 Bank ="ITC";}
	// constructor
	Class1( int Passbook, String name, float Payment){
		this.Passbook=Passbook;
		this.name= name;
		this.Payment= Payment;
	}
		//method
		void display() {
		System.out.println(Passbook+" "+name+"  "+Payment+" "+Bank);
		}
		public class Class { 
		//class2
			public static void main(String[] args) {
				Class1.change();
				//objects
				Class1 s1 =new Class1(1,"pallabi",5000);	
				 Class1 s2 =new Class1(555,"Tushar",6000);	
				s1.display(); // method call
				s2.display();
			}	
			}			
			}

