package week1.day2;


public class EmployeeDetails {
	
	private void printEmployeeName(String empName, int empId) {
		
		System.out.println(empName + empId);
		
	}
	
	public void getEmployeeAddress(String empAddress) {
		
		System.out.println("empAddress");
	}
	
	double printEmployeeSalary(double empSalary) {
		System.out.println(empSalary);
		return empSalary;
	}
	
	protected long printEmployeeMobileNumber(long mobNum) {
		System.out.println(mobNum);
		return mobNum;
	}

	public static void main(String[] args) {
		
		EmployeeDetails obj = new EmployeeDetails();
		obj.printEmployeeName("Ann ", 12345);
		obj.getEmployeeAddress("Chennai");
		obj.printEmployeeSalary(12345.46);
		obj.printEmployeeMobileNumber(9876543210L);
		
	}
	
}
