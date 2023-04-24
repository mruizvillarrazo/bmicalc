package bmicalc;

public class HospitalProxy implements IMCStats {
	
	private IMCStats estadisticas;
	private double mediaAltura, mediaPeso, mediaIMC;
	private int numPacientes;

	
	public HospitalProxy(IMCStats estadisticas) {
		this.estadisticas=estadisticas;
	}
	@Override
	public double alturaMedia() {
		if(mediaAltura==0) {
			mediaAltura=estadisticas.alturaMedia();
		}
		return mediaAltura;
		
	}

	@Override
	public double pesoMedio() {
		if(mediaPeso==0) {
			mediaPeso=estadisticas.pesoMedio();
		}
		return mediaPeso;
	}

	@Override
	public double imcMedio() {
		if(mediaIMC==0) {
			mediaIMC=estadisticas.imcMedio();
		}
		return mediaIMC;
	}

	@Override
	public int numPacientes() {
		if(numPacientes==0) {
			numPacientes=estadisticas.numPacientes();
		}
		return numPacientes;
	}

}
