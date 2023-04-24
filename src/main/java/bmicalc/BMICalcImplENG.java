
package bmicalc;

public class BMICalcImplENG implements Estrategia{

	@Override
	public String imcCalc(double altura, double peso) {
		if(peso==0 || altura==0 ) {
			throw new ArithmeticException("It can not be 0 value");
		}else if( peso<0 || altura <0) {
			throw new IllegalArgumentException("No negative values are allowed");
		}
		double valor = (peso*2.20462)/(Math.pow(altura*3.28084,2));
		String res = "The person with height" + altura*3.28084 + "feet and weight of " + peso*2.20462 + "pounds has a BMI of "
				 + valor +".";
		return res;
	}

}
