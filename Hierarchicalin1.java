package feb_14;


	/*class t{
		int a=10;
		int b=20;
		void action() {
			int c=a+b;
			System.out.println( c);
		}
	}
	class E extends t{
		int d=10;
	}
	class f extends t{
		int x=5;
	}
	 public class Hierarchicalin1 {
		 public static void main(String[] args) {
			E e=new E();
			System.out.println(e.a+e.d+" "+" ");
			e.action();
			f d=new f();
			System.out.println(d.a+" "+d.x+" "+" ");
			d.action();
		}
	 }*/
class Brand{
	void running() {
		System.out.println("running mode on");
	}
}
class Maruti extends Brand {
	void modal() {
		System.out.println("aulto 100");
	}}
class colour extends Brand {
	void red() {
		System.out.println("red aulto 100");
	}}
public class Hierarchicalin1{
	public static void main(String[] args) {
		Maruti a= new Maruti();
		a.modal();
		a.running();
		colour b=new colour();
		b.running();
		b.red();
		
		
		
	}
	}




