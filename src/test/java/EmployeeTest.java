package com.myob.calculator;
import junit.framework.TestCase;
import org.junit.Before;

@RunWith(JUnit4.class)
public class EmployeeTest extends TestCase {
	private Employee employee;

	@Before
	public void setUp() {
		employee = new Employee("Ray", "cui",Long.parseLong(65000));
	}

	@Test
	public void testIfEmployeeInstanceIsCreated() {
		assertNotNull(employee);
	}

  @Test
	public void testIfAnnualSalaryIsInvalid() {
		try {
			employee.setAnnualSalary(-100000);
		} catch (PaySlipCalculatorException ex) {
			assertEquals("Invalid salary range. Salary value must be a positive integer", ex.getMessage());
		}
	}
 @Test
 public void testAnnualSalary() {
	 assertEquals(65000, employee.getAnnualSalary());
 }

 @Test
 public void testName() {
	 assertEquals("Ray Cui", employee.getName());
 }
}
