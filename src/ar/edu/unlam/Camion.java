package ar.edu.unlam;

public class Camion extends Vehiculo {

	private final Double VOLUMEN_MAXIMO = 20.0;
	private final Double PESO_MAXIMO = 16000.0;

	public Camion(Integer iD) {
		super(iD);
	}
	
	public Double getCARGA_MAXIMA() {
		return VOLUMEN_MAXIMO;
	}

	public Double getPESO_MAXIMO() {
		return PESO_MAXIMO;
	}

	@Override
	public void llevarPaquete(Paquete paquete) {
		if (super.getPesoQueLleva() + paquete.getPeso() < this.PESO_MAXIMO && 
			super.getVolumenQueLleva() + paquete.getVolumen() < this.VOLUMEN_MAXIMO) {
			super.agregarPaquete(paquete);
			super.setPesoQueLleva(paquete.getPeso() + super.getPesoQueLleva());
			super.setVolumenQueLleva(paquete.getVolumen() + super.getVolumenQueLleva());
		}
		
	}

}
