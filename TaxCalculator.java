package Mar_24;

import java.util.Scanner;

//custom exception :  If the employee is not a Indian
	class CountryNotValidException extends Exception { 
		public CountryNotValidException (String str) { 
			super(str);							
		}					
	}
	// custom exception : If the employee name is null or empty
	class  EmployeeNameInvalidException extends Exception { 
		public  EmployeeNameInvalidException (String str1) { 
			super(str1);							
		}					
	}
	// custom exception : if employee not eligible for tax 
	class TaxNotEligibleException extends Exception {
		public TaxNotEligibleException (String str3) {
			super(str3);
		}
	}
public class TaxCalculator {	
		public double caculateTax(String empName, boolean isIndian, double empSal ) throws Exception{ // method
			double taxAmount=0 ;
			if (isIndian == false) { // to check if employee Indian or not
				throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
			}
			else if (empName== null) { // to check if employee name is present
				throw new EmployeeNameInvalidException("The employee name cannot be empty");
			}
			else if (empSal>100000 && isIndian == true) { // for matching the tax according to the salary
				taxAmount = (empSal*8)/100;
			}
			else if (empSal>50000 && empSal<100000 && isIndian == true) {
				taxAmount = (empSal*6)/100;
			}
			else if (empSal>30000 && empSal<50000 && isIndian == true) {
				taxAmount = (empSal*5)/100;
			}
			else if (empSal>10000 && empSal<30000 && isIndian == true) {
				taxAmount = (empSal*4)/100;
			}
			else if (empSal<10000 && isIndian == true) {
				throw new TaxNotEligibleException("The employee does not need to pay tax");
			}
			return taxAmount; //  return tax calculated 
		}
	}
 class TaxSimulator {
	public static void main(String[] args) {
		// creating scanner class
		Scanner in =new Scanner(System.in);
		System.out.println("Enter Employee Name :");
		String empName = in.next(); // for employee name
		System.out.println("Enter true if Indian either false :");
		boolean isIndian = in.nextBoolean(); // is employee Indian or not
		System.out.println("Enter Employee's salary :");
		double empSal = in.nextDouble(); // for employee sir 
		
		// 
		TaxCalculator tc = new TaxCalculator(); // object created for TaxCalculator 
		try { // try block for user input
			System.out.println(tc.caculateTax(empName, isIndian, empSal));
		}
		catch(Exception e) { // catch block for exception handling
			System.out.println(e);
		}
	}
}