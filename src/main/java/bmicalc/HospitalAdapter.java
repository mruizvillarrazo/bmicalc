package bmicalc;

import java.util.Map;

public class Adapter implements IMCHospital{
	
	private BMICalcImpl calculadora = BMICalcImpl.getInstancia();

	@Override
	public Map<Double, String> imc(double altura, double peso) {
		return calculadora.imc(altura, peso);
		
	}

	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		return calculadora.tieneObesidadAbdominal(genero, circunferencia);
	}

}
