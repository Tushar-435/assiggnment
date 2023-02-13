package Feb_13;
public class MLTParenteg2 { // parent class 
	int salary= 30000; // parent class member
}
class MIChildEg1 extends MLTParenteg2{
	int bonus = 1500; // child class member
	int annualsal= salary+bonus;
}
class MIChilldEg2 extends MIChildEg1{
	int da = 200;
	int totalsal= annualsal+da;
	public static void main(String[] args) {
		MIChilldEg2 object = new MIChilldEg2();
		System.out.println("salary is:"+ object.salary);
		System.out.println("Annual salary is:"+ object.annualsal);
		System.out.println("Total salary is:"+ object.totalsal);
	}
}


