package Feb_17;

public class InheritanceActivity {
	public static void main(String[] args) {
		Manager m = new Manager (123456,"JAMBO","New YORK",909090,101010);//test case 1
		Trainee t = new Trainee (654321,"BOLT","NETHERLAND",505050,707070);//test case 2
		m.calcluateSalary();
		m.calculatetransportAllowance();
		t.calcluateSalary();
		t.calculatetransportAllowance();
	}
}
