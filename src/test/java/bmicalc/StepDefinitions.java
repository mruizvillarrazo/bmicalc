package bmicalc;
import org.junit.jupiter.api.Assertions;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;




public class StepDefinitions {

	
	private double masa;
	private double altura;
	private Double resultadoBMI;
	private BMICalcImpl bmi;
	private boolean hayExcepcion;
	
	@Before
	public void inicialization() {
		masa=0;
		altura=0;
		resultadoBMI=null;
		bmi=null;

		
	}

	//Feature 1
	//-----------------------------------------------------------------------------------------------
	@Given("una persona con una masa de {int} kg y una altura de {double} m")
	public void una_persona_con_una_masa_de_kg_y_una_altura_de_m(Integer int1, Double double1) {
		this.masa=int1;
		this.altura=double1;
	    
	}
	@When("calculo su IMC")
	public void calculo_su_imc() {
	    // Write code here that turns the phrase above into concrete actions
		bmi=BMICalcImpl.getInstancia();
	    resultadoBMI=bmi.bmi(masa, altura);
	}
	
	
	@Then("debo obtener un resultado de {double}")
	public void debo_obtener_un_resultado_de(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    Assertions.assertEquals(double1, Math.round(resultadoBMI*100.0)/100.0);
	}
	
	@Given("una persona con una masa de {int} kg y altura {double} m")
	public void una_persona_con_una_masa_de_kg_y_altura_m(Integer int1, Double double1) {
		this.masa=int1;
		this.altura=double1;
	}
	@When("intento calcular su IMC")
	public void intento_calcular_su_imc() {
	    try {
	    	bmi=BMICalcImpl.getInstancia();
		    resultadoBMI=bmi.bmi(masa, altura);
	    }catch(ArithmeticException e) {
	    	hayExcepcion=true;
	    }
	}
	@Then("debo obtener una excepción")
	public void debo_obtener_una_excepción() {
	    Assertions.assertTrue(hayExcepcion);
	}
	
	//Feature 2
	//-----------------------------------------------------------------------------------------------
	

}