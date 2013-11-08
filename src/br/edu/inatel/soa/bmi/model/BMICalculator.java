package br.edu.inatel.soa.bmi.model;

import br.edu.inatel.soa.bmi.utils.Description;

public class BMICalculator {

	public Float getBMI(Float weight, Float height) {
		Float bmi = weight / (height * height);
		return bmi;
	}
	
	public String getDescription(Float bmi) {
		return getDescription(bmi, "en_US");
	}
	
	public String getDescription(Float bmi, String lang) {
		String description = "";
		
		if(bmi < 17) {
			description = Description.VERY_UNDERWEIGHT.get(lang);
		} 
		else if (bmi >= 17 && bmi <= 18.49) {
			description = Description.UNDERWEIGHT.get(lang);
		}
		else if(bmi >= 18.5 && bmi <= 24.99) {
			description = Description.NORMAL.get(lang);
		}
		else if(bmi >= 25 && bmi <= 29.99) {
			description = Description.OVERWEIGHT.get(lang);
		}
		else if(bmi >= 30 && bmi <= 34.99) {
			description = Description.OBESE_CLASS_I.get(lang);
		}
		else if(bmi >= 35 && bmi <= 39.99) {
			description = Description.OBESE_CLASS_II.get(lang);
		}
		else if(bmi >= 40) {
			description = Description.OBESE_CLASS_III.get(lang);
		}
		
		return description;
	}
	
}
