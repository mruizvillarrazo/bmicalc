package bmicalc;
import io.cucumber.java.en.*;




public class StepDefinitions {

	
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
	
	
	@Given("unos datos erroneos")
	public void unos_datos_erroneos() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("introduzco masa {int} kg y algura {double} m")
	public void introduzco_masa_kg_y_algura_m(Integer int1, Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	


	
	//Feature 2
	//-----------------------------------------------------------------------------------------------
		
	@Given("un BMI de {int}")
	public void un_bmi_bajo(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("quiero ver si la persona es Delgada")
	public void quiero_ver_si_la_persona_es_delgada() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener un resultado de BAJO PESO")
	public void debo_obtener_un_resultado_de_bajo_peso() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@Given("un BMI de {double}")
	public void un_bmi_medio(Double double1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("quiero ver si la persona es Normal")
	public void quiero_ver_si_la_persona_es_normal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener un resultado de NORMAL")
	public void debo_obtener_un_resultado_de_normal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("un BMI de {int}")
	public void un_bmi_alto(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("quiero ver si la persona es Obeso")
	public void quiero_ver_si_la_persona_es_obeso() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener un resultado de OBESIDAD")
	public void debo_obtener_un_resultado_de_obesidad() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	//Feature 3
	//-----------------------------------------------------------------------------------------------
		

	@Given("un género que no es {string} o {string}")
	public void un_género_que_no_es_o(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("intento verificar la obesidad abdominal")
	public void intento_verificar_la_obesidad_abdominal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener una excepción {string}")
	public void debo_obtener_una_excepción(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("un hombre con una circunferencia de cintura de {int} cm")
	public void un_hombre_con_una_circunferencia_de_cintura_de_cm(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("verifico si es obeso")
	public void verifico_si_es_obeso() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener un resultado de false")
	public void debo_obtener_un_resultado_de_false() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	@Given("una mujer con una circunferencia de cintura de {int} cm")
	public void una_mujer_con_una_circunferencia_de_cintura_de_cm(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@When("verifico si es obesa")
	public void verifico_si_es_obesa() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	@Then("debo obtener un resultado de true")
	public void debo_obtener_un_resultado_de_true() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	
	
	
	}