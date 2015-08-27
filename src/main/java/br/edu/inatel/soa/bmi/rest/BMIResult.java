package br.edu.inatel.soa.bmi.rest;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class BMIResult {
	
	private Float bmi;
	private String description;
	
	public Float getBmi() {
		return bmi;
	}
	public void setBmi(Float bmi) {
		this.bmi = bmi;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
