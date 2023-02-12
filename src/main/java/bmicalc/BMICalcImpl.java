package bmicalc;

public class BMICalcImpl implements BMICalc {

	public double bmi(double mass, double height) {
		double result = (mass)/(Math.pow(height,2));
		return result;
	}

	public String category(double bmi) {
		String cat="";
		if(bmi<18.5) {
			cat="UNDERWEIGHT";
		}else if (bmi>18.5 && bmi<24.9) {
			cat="NORMAL";
		}else if(bmi>25.0 && bmi<29.9) {
			cat="OVERWEIGHT";
		}else {
			cat="OBSESE";
		}
		return cat;
	}

	public boolean abdominalObesity(double waistCircumference, char gender) {
		boolean estar=false;
		if((gender=='M' && waistCircumference>90)||(gender=='F' && waistCircumference>80)){
			estar=true;
		}
		return estar;
	}

}
