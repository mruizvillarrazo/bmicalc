package bmicalc;

import java.util.HashMap;
import java.util.Map;

public class BMICalcImpl implements BMICalc, IMCHospital, IMCStats, Estrategia{
	
	
	
	

	
	@Override
	public Map<Double, String> imc(double altura, double peso) {
		Double bmi_valor=bmi(altura, peso); 
		String categ= category(bmi_valor);
		Map<Double, String> res = new HashMap<Double, String>();
		res.put(bmi_valor, categ);
		
		return res;
	}
	
	@Override
	public boolean tieneObesidadAbdominal(char genero, double circunferencia) {
		boolean tenerOb = abdominalObesity(circunferencia, genero);
		// TODO Auto-generated method stub
		return tenerOb;
	}
	
	private static BMICalcImpl bmiC;
	
	private BMICalcImpl() {
		bmiC = new BMICalcImpl();
	}
	
	public static BMICalcImpl getInstancia() {
		if(bmiC==null) {
			bmiC = new BMICalcImpl();
		}
		return bmiC;
	}

	public double bmi(double mass, double height) {
		if(mass==0 || height==0 ) {
			throw new ArithmeticException("No puede ser 0");
		}else if( mass<0 || height <0) {
			throw new IllegalArgumentException("No pueden ser valores negativos");
		}
		double result = (mass)/(Math.pow(height,2));
		return result;
	}

	

	public String category(double bmi) {
		String cat="";
		if (bmi<=0 || bmi>=50) {
			throw new IllegalArgumentException("Valores imposibles");
		}
		
		if(bmi<18.5) {
			cat="UNDERWEIGHT";
		}else if (bmi>18.5 && bmi<24.9) {
			cat="NORMAL";
		}else if(bmi>25.0 && bmi<=29.9) {
			cat="OVERWEIGHT";
		}else {
			cat="OBESE";
		}
		return cat;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean estar=false;
		if(gender!='M' && gender!='F' && waistCircumference==0) {
			throw new IllegalArgumentException("Argumento incorrecto");
		}
		if((gender=='M' && waistCircumference>90)||(gender=='F' && waistCircumference>80)){
			estar=true;
		}
		return estar;
	}

	@Override
	public double alturaMedia() {
		double mediaAltura= alturaMedia();
		return mediaAltura;
	}

	@Override
	public double pesoMedio() {
		double mediaPeso = pesoMedio();
		return mediaPeso;
	}

	@Override
	public double imcMedio() {
		double mediaIMC = imcMedio();
		return mediaIMC;
	}

	@Override
	public int numPacientes() {
		int numPacientes = numPacientes();
		return numPacientes;
	}

	@Override
	public String imcCalc(double altura, double peso) {
		if(peso==0 || altura==0 ) {
			throw new ArithmeticException("No puede ser 0");
		}else if( peso<0 || altura <0) {
			throw new IllegalArgumentException("No pueden ser valores negativos");
		}
		double valor = (peso)/(Math.pow(altura,2));
		String res = "La persona con altura" + altura + "metros y " + peso + "kilos de peso tiene un IMC "
				+ "de " + valor +".";
		return res;
	}

}