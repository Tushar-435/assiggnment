package Feb_28;

 interface Person {
	 void speak();
 }
 class Student implements Person {

	@Override
	public void speak() {
		System.out.println("Number of student");
	}}
 class Teacher implements Person {

	@Override
	public void speak() {
		System.out.println("Number of teacher");
	}}
		public class SchoolInterface {
			public static void main(String[] args) {
				Student obj=new Student();
				Teacher obj1=new Teacher();
				obj.speak();
				obj1.speak();
			}
		
		}
