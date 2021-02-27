package com.sona.corejava.empapplication;

public class EmployeeInformation extends BankAccountDetails implements EmployeeInterface{
	int empno;
	double sal;
	String address;
	/**
	 * Interface methods
	 */
	public void employeeInfo(int empno, double sal) {
		this.empno=empno;
		this.sal=sal;
	}
	public void employeeAddress(String add) {
		this.address=add;
	}
	public void employeeDetails() {
		System.out.println("Employee No. :" +empno);
		System.out.println("Employee Salary : "+sal);
		System.out.println("Employee Address : "+address);
		System.out.println("Employee Country :"+country);
		
	}
   /**
    * Abstract methods
    */
	@Override
	public void accountDetails() {
		System.out.println("Account No :");
		System.out.println("Area : Banglore");
		
	}
	public void show()
	{
		System.out.println("This is Local Method");
	}


	public static void main(String[] args) {
		try
		{
			EmployeeInformation emp=new EmployeeInformation();
			/**
			 * 3 Interface methods called
			 */
			emp.employeeInfo(200, 30000);
			emp.employeeAddress("Banglore");
			emp.employeeDetails();
			/**
			 * abstract methods
			 */
			emp.accountDetails();
			emp.bankDetails();
			/**
			 * Local methods
			 */
			emp.show();
			/**
			 * HAS-A
			 */
			BankRBI  bank=new BankRBI();//Static Block and Default Constructor
			BankRBI  bank1=new BankRBI(5.2,5.2);//Pareterized cons
			BankRBI.getBankDetails();
			
		}
		catch(Exception e)

		
		{
			System.out.println("I Can it"+e);
		}

	}


	

	
	

}
