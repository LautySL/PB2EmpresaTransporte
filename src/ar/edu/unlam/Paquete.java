package ar.edu.unlam;

public class Paquete {
	
	private Double ancho, alto, profundo, peso, volumen;
	private String destino;

	public Paquete (Double ancho, Double alto, Double profundo, Double peso, String destino) {
		this.ancho = ancho;
		this.alto = alto;
		this.profundo = profundo;
		this.peso = peso;
		this.destino = destino;
		this.volumen = ancho*alto*profundo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Double getAncho() {
		return ancho;
	}

	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}

	public Double getAlto() {
		return alto;
	}

	public void setAlto(Double alto) {
		this.alto = alto;
	}

	public Double getProfundo() {
		return profundo;
	}

	public void setProfundo(Double profundo) {
		this.profundo = profundo;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}
	
	
	
}
