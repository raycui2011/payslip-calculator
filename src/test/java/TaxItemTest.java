
package com.myob.calculator;
import junit.framework.TestCase;
import org.junit.Before;


public class TaxItemTest extends TestCase {
	private TaxItem item;

	@Before
	public void setUp(){
		item = new TaxItem();
	}

	public void testDerivedTaxItem(){

		item.setTaxRate(0.19);
		item.setMinLimit(18201);
		item.setMaxLimit(37000);
		item.setAdditionCost(0);

		assertEquals(item.getTaxRate(),0.19);
		assertEquals(item.getMinLimit(),18201);
		assertEquals(item.getMaxLimit(),37000);
		assertEquals(item.getAdditionCost(),0.0);
	}
}
