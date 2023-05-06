package bmicalc;

public class BMICalcImpl implements CardiovascularMetrics, MetabolicMetrics {

	public double calculateBodyMassIndex(double mass, double height) {
		if(mass==0 || height==0 ) {
			throw new ArithmeticException("No puede ser 0");
		}else if( mass<0 || height <0) {
			throw new IllegalArgumentException("No pueden ser valores negativos");
		}
		double result = (mass)/(Math.pow(height,2));
		return result;
	}

	

	public ObesityCategory getObesityCategory(double bmi) {
	    if (bmi <= 0 || bmi >= 50) {
	        throw new IllegalArgumentException("Valores imposibles");
	    }
	    if (bmi < 18.5) {
	        return ObesityCategory.UNDERWEIGHT;
	    } else if (bmi < 24.9) {
	        return ObesityCategory.NORMAL;
	    } else if (bmi < 29.9) {
	        return ObesityCategory.OVERWEIGHT;
	    } else {
	        return ObesityCategory.OBESE;
	    }
	}

	public boolean abdominalObesity(double waistCircumference, Gender gender) {
		boolean estar=false;
		if(gender==Gender.MALE && gender==Gender.FEMALE && waistCircumference==0) {
			throw new IllegalArgumentException("Argumento incorrecto");
		}
		if((gender==Gender.MALE && waistCircumference>90)||(gender==Gender.FEMALE && waistCircumference>80)){
			estar=true;
		}
		return estar;
	}

}