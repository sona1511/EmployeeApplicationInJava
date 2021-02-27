package com.sona.corejava.empapplication;

public class BankRBI {
	static 
	{
		System.out.println("Welcome To ....");
	}
	public BankRBI()
	{
		System.out.println("RBI BANK Home Loan and Personal Loan Interests are....");
		
	}
	public BankRBI(double p, double r)
	{
		System.out.println(p*r/100);
	}
	public static final void getBankDetails()
	{
		System.out.println("Home Loans in 8%");
		System.out.println("Personal Loans in 10%");
	}
}