package br.edu.inatel.soa.bmi.utils;

public enum Description {
	
	VERY_UNDERWEIGHT("Severely underweight", "Muito abaixo do peso"),
	UNDERWEIGHT("Underweight", "Abaixo do peso"),
	NORMAL("Normal", "Peso normal"),
	OVERWEIGHT("Overweight", "Acima do peso"),
	OBESE_CLASS_I("Obese Class I", "Obesidade I"),
	OBESE_CLASS_II("Obese Class II (severely obese)", "Obesidade II (severa)"),
	OBESE_CLASS_III("Obese Class III (very severely obese)", "Obesidade III (mórbida)");
	
	private String descEnUS;
	private String descPtBr;
	
	private Description(String descEnUS, String descPtBr) {
		this.descEnUS = descEnUS;
		this.descPtBr = descPtBr;
	}
	
	public String get(String lang) {
		String description = "";
		if(lang.equalsIgnoreCase("pt_BR")) {
			description = descPtBr;
		}
		else {
			description = descEnUS;
		}
		return description;
	}

}
