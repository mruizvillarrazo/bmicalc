package bmicalc;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BMICalcTest {
	
	private final BMICalcImpl calculadora = new BMICalcImpl();	
	
	@Test
	@DisplayName("Example Test Method.")
	public void bmi() {
		assertEquals(true, true);
	}
	
	
	//Los dos siguientes tests son para el metodo bmi
	
	@Test
	@DisplayName("En el BMI intentar dividir una masa entre 0")
    void calculoIMB1() {
		Exception exception = assertThrows(ArithmeticException.class, () ->
        calculadora.bmi(2, 0));
        assertEquals("No puede ser 0", exception.getMessage());
    }
	
	@Test
	@DisplayName("En el BMI insertar valores negativos")
	void calculoIMB2() {
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
        calculadora.bmi(-5, -2));
        assertEquals("No pueden ser valores negativos", exception.getMessage());
    }
	
	
	//Los siguientes 4 tests son para comprobar que se devuelve 
	//cada string correspondiente a su intervalo
	@Test
	@DisplayName("Comprobar intervalos 1")
    void intervalos1() {
		assertEquals("UNDERWEIGHT", calculadora.category(5));
    }
	
	@Test
	@DisplayName("Comprobar intervalos 2")
    void intervalos2() {
		assertEquals("NORMAL", calculadora.category(21));
    }
	
	@Test
	@DisplayName("Comprobar intervalos 3")
    void intervalos3() {
		assertEquals("OVERWEIGHT", calculadora.category(27));
    }
	
	
	@Test
	@DisplayName("Comprobar intervalos 4")
    void intervalos4() {
		assertEquals("OBSESE", calculadora.category(35));
    }
	
	//Para el método category nos aseguramos que saltan las excepciones con valores
	//imposibles
	
	@Test
	@DisplayName("Testeando valores poco realistas")
    void categoriaException() {
		Exception exception1 = assertThrows(IllegalArgumentException.class, () ->
        calculadora.category(-4));
		Exception exception2 = assertThrows(IllegalArgumentException.class, () ->
        calculadora.category(67));

        assertEquals("Valores imposibles", exception1.getMessage());
        assertEquals("Valores imposibles", exception2.getMessage());

    }
	
	//Para hombres y mujeres comprobar que si superan el intervalo estan obesos
	//y si no pues no lo estan
	
	@Test
	@DisplayName("Comprobando obesidad")
    void abdObsesityTest1() {

        assertTrue(calculadora.abdominalObesity(99,'M'));
        assertTrue(calculadora.abdominalObesity(81,'F'));
        assertFalse(calculadora.abdominalObesity(77,'M'));
        assertFalse(calculadora.abdominalObesity(65,'M'));



    }
	
	
	//Si se introduce un char distinto a M o F saltara una excepcion
	@Test
	@DisplayName("Comprobando que sea hombre o mujer")
    void abdObsesityTest2() {
		
		Exception exception = assertThrows(IllegalArgumentException.class, () ->
        calculadora.abdominalObesity(90, 'J'));
        assertEquals("Argumento incorrecto", exception.getMessage());


    }
}
