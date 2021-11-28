package com.myob.calculator;

import java.util.ArrayList;


public class PaySlipCalculator {

	public void execute(Employee employee){
		 employee.setIncomeTax((int)calculateIncomeTax(employee.getAnnualSalary()));
		 employee.output();
	}


	public long calculateIncomeTax(long annualSalary){
		return TaxCalculator.calculate(annualSalary);
	}


}
