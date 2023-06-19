package ar.edu.unlam;

import java.util.ArrayList;

public class Bicicleta extends Vehiculo {

	private final Double VOLUMEN_MAXIMO = 0.125;
	private final Double PESO_MAXIMO = 15.0;
	private final Integer CANTIDAD_MAXIMA_DE_PAQUETES_QUE_PUEDE_LLEVAR = 2;
	
	private String destino;
	
	
	public Integer getCANTIDAD_MAXIMA_DE_PAQUETES_QUE_PUEDE_LLEVAR() {
		return CANTIDAD_MAXIMA_DE_PAQUETES_QUE_PUEDE_LLEVAR;
	}

	public Bicicleta(Integer iD, String destino) {
		super(iD);
		this.destino = destino;
	}
	
	public Bicicleta (Integer iD) {
		super(iD);
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getCargaMaxima() {
		return VOLUMEN_MAXIMO;
	}

	public Double getPesoMaximo() {
		return PESO_MAXIMO;
	}
	
	public Boolean revisarQueElDestinoDeLosPaquetesSeanIguales (Paquete paquete) {
		Boolean sonDeMismoDestino = false;
		if (super.getCantidadDePaquetesQueLleva() == 0) {
			sonDeMismoDestino = true;
		}
		if (super.getCantidadDePaquetesQueLleva() == 1 && super.getPaquetesQueLleva().get(0).getDestino().equals(paquete.getDestino())) {
			sonDeMismoDestino = true;
		} return sonDeMismoDestino;
	}
	
	@Override
	public void llevarPaquete (Paquete paquete) {
		ArrayList <Paquete> paquetesQueLleva = super.getPaquetesQueLleva();
		if (super.getPesoQueLleva() + paquete.getPeso() < this.PESO_MAXIMO && 
			super.getVolumenQueLleva() + paquete.getVolumen() < this.VOLUMEN_MAXIMO &&
			revisarQueElDestinoDeLosPaquetesSeanIguales(paquete)) {
			if (paquetesQueLleva.size() < 2) {
				super.agregarPaquete(paquete);
				super.setPesoQueLleva(paquete.getPeso() + super.getPesoQueLleva());
				super.setVolumenQueLleva(paquete.getVolumen() + super.getVolumenQueLleva());
				
				if (this.destino == null) {
					destino = paquete.getDestino();
				}
			}
		}
	}
	
}
