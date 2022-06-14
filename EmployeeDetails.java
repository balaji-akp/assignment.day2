package assignment2.employeedetails;

public class EmployeeDetails {
	
	public String employeeName()
	{
		String empName = "Balaji";
		return empName;
	}
	public int employeeId()
	{
		int empID = 204884;
		return empID;
	}

	public String getEmployeeAddress()
{
	String empAdd = "Chennai";
	return empAdd;
 	
}
	private double EmployeeSalary()
	{
		double empSalary = 65000.756;
		return empSalary;
	}
	public long EmployeeMobileNumber()
	{
		long empMobileNo = 8508494031L;
		return empMobileNo;
	}
	
	
	public static void main(String[] args) {
		EmployeeDetails emp = new EmployeeDetails();
		System.out.println(emp.employeeName() + " "+ "&" + " " + emp.employeeId());
		System.out.println(emp.getEmployeeAddress());
		System.out.println(emp.EmployeeSalary());
		System.out.println(emp.EmployeeMobileNumber());
	}
}
