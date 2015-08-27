package br.edu.inatel.soa.bmi.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BMICalculatorTest {
	
	BMICalculator bmiCalculator;

	@Before
	public void setUp() throws Exception {
		bmiCalculator = new BMICalculator();
	}

	@Test
	public void should_calculate_the_bmi_for_76Kg_and_171Cm() {
		//given
		Float expected = 25.990902f;
		Float actual = bmiCalculator.getBMI(76f, 1.71f);
		//then
		assertEquals(expected, actual);
	}
	
	@Test
	public void should_get_the_right_description_for_the_25_dot_99_BMI_in_enUS() {
		//given
		String expected = "Overweight";
		//when
		String actual = bmiCalculator.getDescription(25.99f);
		//then
		assertEquals(expected, actual);
	}
	
	@Test
	public void should_get_the_right_description_for_the_25_dot_99_BMI_in_ptBR() {
		//given
		String expected = "Acima do peso";
		//when
		String actual = bmiCalculator.getDescription(25.99f, "pt_BR");
		//then
		assertEquals(expected, actual);
	}

}
