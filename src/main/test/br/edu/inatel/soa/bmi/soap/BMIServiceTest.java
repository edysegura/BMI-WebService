package br.edu.inatel.soa.bmi.soap;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BMIServiceTest {

	BMIService bmiService;
	
	@Before
	public void setUp() throws Exception {
		bmiService = new BMIService();
	}

	@Test
	public void should_get_the_bmi_result_with_description_in_enUS() {
		//given
		BMIResult expected = new BMIResult();
		expected.setBmi(25.990902f);
		expected.setDescription("Overweight");
		//when
		BMIResult actual = bmiService.getBMI(76f, 1.71f, "en_US");
		//then
		assertEquals(expected, actual);
	}

	@Test
	public void should_get_the_bmi_result_with_description_in_ptUS() {
		//given
		BMIResult expected = new BMIResult();
		expected.setBmi(25.990902f);
		expected.setDescription("Acima do peso");
		//when
		BMIResult actual = bmiService.getBMI(76f, 1.71f, "pt_BR");
		//then
		assertEquals(expected, actual);
	}

}
