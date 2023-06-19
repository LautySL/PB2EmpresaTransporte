package ar.edu.unlam;

import java.util.ArrayList;

public class Automovil extends Vehiculo {

	private final Double VOLUMEN_MAXIMO = 2.0;
	private final Double PESO_MAXIMO = 500.0;
	
	public Automovil (Integer iD) {
		super(iD);
	}

	public Double getCARGA_MAXIMA() {
		return VOLUMEN_MAXIMO;
	}

	public Double getPESO_MAXIMO() {
		return PESO_MAXIMO;
	}
	
	public Boolean verificarQueElDestinoDeLosPaquetesNoSeRepita (Paquete paquete) {
		ArrayList <String> destinos = new ArrayList<>();
		
		for (Paquete paquete1 : super.getPaquetesQueLleva()) {
			destinos.add(paquete1.getDestino());
		}
		
		for (String paquete1 : destinos) {
			if (paquete.getDestino().equals(paquete1)) {
				return false;
			}
		} return true;
		
	}
	
	@Override
	public void llevarPaquete(Paquete paquete) {
		if (super.getPesoQueLleva() + paquete.getPeso() < this.PESO_MAXIMO && 
			super.getVolumenQueLleva() + paquete.getVolumen() < this.VOLUMEN_MAXIMO) {
				if (verificarQueElDestinoDeLosPaquetesNoSeRepita(paquete)) {
					if (super.getCantidadDePaquetesQueLleva() < 3) {
						super.agregarPaquete(paquete);
						super.setPesoQueLleva(paquete.getPeso() + super.getPesoQueLleva());
						super.setVolumenQueLleva(paquete.getVolumen() + super.getVolumenQueLleva());
					}
				}
			}
		
	}


}
