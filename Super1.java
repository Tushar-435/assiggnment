package Feb_20;

class Mobile {
	String name="iphone";
}
class model extends Mobile {
	String name="iphone_14";
	void print() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class Super1 {
	public static void main(String[] args) {
		model b=new model();
		b.print();
	}
	

}
