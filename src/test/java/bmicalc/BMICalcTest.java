package bmicalc;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
	
	
	@Test
	@DisplayName("En el IBM intentar dividir una masa entre 0")
    void division() {
		Exception exception = assertThrows(ArithmeticException.class, () ->
        calculadora.bmi(2, 0));
        assertEquals("/ by zero", exception.getMessage());
    }
	
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
	
	
	
}
