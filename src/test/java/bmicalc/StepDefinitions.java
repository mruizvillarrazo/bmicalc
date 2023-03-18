package bmicalc;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;




public class StepDefinitions {

	
	private double masa;
	private double altura;
	private double resultadoBMI;
	private BMICalcImpl bmi;
	private String category;
	
	@Before
	public void inicialization() {
		masa=0;
		altura=0;
		resultadoBMI=0;
		bmi=null;
		category=null;
		
	}

	//Feature 1
	//-----------------------------------------------------------------------------------------------
	@Given("una persona con una masa de {int} kg y una altura de {double} m")
	public void una_persona_con_una_masa_de_kg_y_una_altura_de_m(Integer int1, Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("calculo su IMC")
	public void calculo_su_imc() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener un resultado de {double}")
	public void debo_obtener_un_resultado_de(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("una persona con una masa de {int} kg y altura {double} m")
	public void una_persona_con_una_masa_de_kg_y_altura_m(Integer int1, Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("intento calcular su IMC")
	public void intento_calcular_su_imc() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener una excepción {string}")
	public void debo_obtener_una_excepción(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	//Feature 2
	//-----------------------------------------------------------------------------------------------
	
}