package com.myob.calculator;

public class SuperCalculator {

	public static int calculate(double grossIncome, double superRate){
		return (int)Math.round(grossIncome * superRate);
	}
}
