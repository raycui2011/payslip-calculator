package com.myob.calculator;

public class Employee {

	private String name;
	private long annualSalary;
	private int incomeTax;

	public Employee(){

	}

	public Employee(String name, long annualSalary){
		this.name = name;
		this.annualSalary = annualSalary;
	}



	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
			return name;
	}


	public long getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(long annualSalary) {
		this.annualSalary = annualSalary;
	}

	public int getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}


	public int grossIncome(){
		return Math.round(annualSalary/12);
	}

	public int netIncome(){
		return (grossIncome()-incomeTax);
	}

	@Override
	public String toString() {
		return this.getName() +  grossIncome() + "," + incomeTax + "," + netIncome();
	}

	public void output() {
		System.out.println("Monthly Payslip for: " + this.getName());
		System.out.println("Gross Monthly Income: $" + this.grossIncome());
		System.out.println("Monthly Income Tax: $" + incomeTax);
		System.out.println("Net Monthly Income: $" + netIncome());
	}

}
