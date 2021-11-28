package com.myob.calculator;

import junit.framework.TestCase;
import org.junit.Before;

/**
 * Created by lynnchin on 7/02/2016.
 */
public class PayslipCalculatorTest extends TestCase{
	private PaySlipCalculator paySlipCalculator;

	@Before
	public void setUp(){
		paySlipCalculator = new PaySlipCalculator();
		Emplyee e = new Employee("Test Uaser", 96000);
	}

	public void testExecute(){
		paySlipCalculator.execute(e);
	}

}
