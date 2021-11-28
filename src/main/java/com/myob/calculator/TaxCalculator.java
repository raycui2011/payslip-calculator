package com.myob.calculator;

import java.util.ArrayList;

public class TaxCalculator {

	private static ArrayList<TaxItem> initializeTaxItems() {
		ArrayList<TaxItem> taxItems = new ArrayList<>();

		TaxItem itemOne = new TaxItem(20000, 40000, 0.10, 0);
		TaxItem itemTwo = new TaxItem(40000, 80000, 0.20, 2000);
		TaxItem itemThree = new TaxItem(80000, 180000, 0.30, 10000);
		TaxItem itemFour = new TaxItem(180000, Integer.MAX_VALUE, 0.40, 42000);

		taxItems = new ArrayList<>();

		taxItems.add(itemOne);
		taxItems.add(itemTwo);
		taxItems.add(itemThree);
		taxItems.add(itemFour);

		return taxItems;
	}

	/**
		This method is used to calculate the monthly salary
  */
	public static long calculate(long annualSalary)
	throws PaySlipCalculatorException {
		if (annualSalary < 0) {
			throw new PaySlipCalculatorException("Annual Salary must be greater than zero");
		}
		for (TaxItem item : initializeTaxItems()) {
			if (annualSalary > item.getMinLimit() && annualSalary <= item.getMaxLimit()) {
				return Math.round((item.getAdditionCost() + (annualSalary - item.getMinLimit()) * item.getTaxRate()) / 12);
			}
		}
		return annualSalary;
	}
}
