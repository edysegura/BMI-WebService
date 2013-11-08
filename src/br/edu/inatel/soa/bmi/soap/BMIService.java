package br.edu.inatel.soa.bmi.soap;

import br.edu.inatel.soa.bmi.model.BMICalculator;

public class BMIService {
	
	private BMICalculator bmiCalculator = new BMICalculator();
	
	public BMIResult getBMI(Float weight, Float height, String lang) {
		if(lang == null || lang.isEmpty()) {
			lang = "en_US";
		}
		BMIResult bmiResult = new BMIResult();
		Float bmi = bmiCalculator.getBMI(weight, height);
		bmiResult.setBmi(bmi);
		bmiResult.setDescription(bmiCalculator.getDescription(bmi, lang));
		return bmiResult;
	}

}
