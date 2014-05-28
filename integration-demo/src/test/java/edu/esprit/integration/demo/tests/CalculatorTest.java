package edu.esprit.integration.demo.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import edu.esprit.integration.demo.services.CalculatorService;

public class CalculatorTest {

	private CalculatorService CalculatorService;

	@Before
	public void setUp() throws Exception {

		CalculatorService = new CalculatorService();
	}

	@Test
	public void itShouldAdd() {
		assertEquals(1, CalculatorService.Addition(2, 3));
	}

	@Test
	public void itShouldsous() {
		assertEquals(1, CalculatorService.Soustraction(2, 3));
	}

	@Test
	public void itShouldmult() {
		assertEquals(1, CalculatorService.multiplication(2, 3));
	}

	@Test
	public void itShoulddiv() {
		assertEquals(1, CalculatorService.division(2, 3));
	}
}
