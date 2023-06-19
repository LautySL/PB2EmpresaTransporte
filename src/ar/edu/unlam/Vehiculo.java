package ar.edu.unlam;

import java.util.ArrayList;

public abstract class Vehiculo {
	
	private Integer ID;
	private Double pesoQueLleva, volumenQueLleva;
	private ArrayList <Paquete> paquetesQueLleva;

	public Vehiculo(Integer iD) {
		this.ID = iD;
		this.pesoQueLleva = 0.0;
		this.volumenQueLleva = 0.0;
		this.paquetesQueLleva = new ArrayList<>();
	}

	public ArrayList <Paquete> getPaquetesQueLleva() {
		return paquetesQueLleva;
	}
	
	public Integer getCantidadDePaquetesQueLleva() {
		return this.paquetesQueLleva.size();
	}
	
	public void agregarPaquete (Paquete paquete) {
		this.paquetesQueLleva.add(paquete);
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}
	
	public Double getPesoQueLleva() {
		return pesoQueLleva;
	}

	public void setPesoQueLleva(Double pesoQueLleva) {
		this.pesoQueLleva = pesoQueLleva;
	}

	public Double getVolumenQueLleva() {
		return volumenQueLleva;
	}

	public void setVolumenQueLleva(Double volumenQueLleva) {
		this.volumenQueLleva = volumenQueLleva;
	}

	public void setPaquetesQueLleva(ArrayList<Paquete> paquetesQueLleva) {
		this.paquetesQueLleva = paquetesQueLleva;
	}

	public abstract void llevarPaquete(Paquete paquete);
	
}
