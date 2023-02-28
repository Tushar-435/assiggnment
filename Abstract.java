package Feb_28;

abstract class shape {
	abstract void calculateArea();
}
class Circle extends shape {

	@Override
	void calculateArea() {
		System.out.println("The shape of circle");
	}}
class Rectangle extends shape {

	@Override
	void calculateArea() {
		System.out.println("The shape of Rictangle");
	}
public static void main(String[] args) {
	shape obj=new Circle();
	shape obj1=new Rectangle();
	obj.calculateArea();
	obj1.calculateArea();
}
		
		
	}
	


