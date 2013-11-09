package br.edu.inatel.soa.bmi.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import br.edu.inatel.soa.bmi.model.BMICalculator;

@Path("/bmi")
public class BMIService {
	
	private BMICalculator bmiCalculator = new BMICalculator();
	
	@GET
	@Path("weight/{weight}/height/{height}")
	@Produces(MediaType.TEXT_PLAIN)
	public String getBMI(@PathParam("weight") String weight, @PathParam("height") String height) {
		Float bmi = bmiCalculator.getBMI(Float.valueOf(weight), Float.valueOf(height));
		return String.format("Params are weight: %s and height: %s. The result is: %2.2f", weight, height, bmi);
	}
	
//	@GET
//	@Path("weight/{weight}/height/{height}/{lang}")
//	@Produces(MediaType.APPLICATION_JSON)
//	public String getBMI(@PathParam("weight") String weight, 
//			@PathParam("height") String height, @PathParam("lang") String lang) {
//		
//		Float bmi = bmiCalculator.getBMI(Float.valueOf(weight), Float.valueOf(height));
//		JSONObject json = new JSONObject();
//		String response = "";
//		
//		try {
//			json.put("bmi", bmi);
//			json.put("description", bmiCalculator.getDescription(bmi, lang));
//			response = json.toString();
//		} 
//		catch (JSONException e) {
//			response = String.format("{\"message\":\"Something went wrong: %s\"}", e.getMessage());
//		}
//		
//		return response;
//	}
	
	@GET
	@Path("weight/{weight}/height/{height}/{lang}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML, MediaType.APPLICATION_XML})
	public BMIResult getBMI(@PathParam("weight") String weight, 
			@PathParam("height") String height, @PathParam("lang") String lang) {
		
		Float bmi = bmiCalculator.getBMI(Float.valueOf(weight), Float.valueOf(height));
	    String description = bmiCalculator.getDescription(bmi, lang);
	    
	    BMIResult bmiResult = new BMIResult();
	    bmiResult.setBmi(bmi);
	    bmiResult.setDescription(description);

	    return bmiResult;
	}

}
