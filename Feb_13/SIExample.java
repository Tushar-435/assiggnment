package Feb_13;


class SingleParent5 { // parent class
	int a =20;
	int b=30;
	}
	public class SIExample extends SingleParent5{
		public static void main(String[] args) {
			// int c= b+a;//
			SingleParent5 child = new SingleParent5();
			System.out.println("c is : "+(child.a + child.b));
		}
	}

	/*class   SingleChilda6 extends   SingleParent5{ // child class
		int b=30;
		int c= b+a;
		
	}
	public class  SIExample {
		public static void main(String[] args) {
			SingleChilda6 child = new SingleChilda6(); // create a object of child class
		System.out.println("a is :"+child.a);
		System.out.println("b is : "+child.c);
		}
		}*/	