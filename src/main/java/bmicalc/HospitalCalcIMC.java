package bmicalc;

public class HospitalCalcIMC {

	private Estrategia calculos;
	
	public void setEstrategia(Estrategia calculos) {
		this.calculos=calculos;
	}
	
	public String executeStrategy(double altura, double peso) {
		return calculos.imcCalc(altura, peso);
	}
}
