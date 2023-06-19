package ar.edu.unlam.test;

import static org.junit.Assert.*;
import ar.edu.unlam.*;

public class Test {

	@org.junit.Test
	public void queUnaBicicletaPuedaLlevarDosPaquetes() {
		Bicicleta bicicleta = new Bicicleta (123);
		
		Paquete paquete1 = new Paquete (0.1, 0.3, 0.4, 0.4, "Casanova");
		Paquete paquete2 = new Paquete (0.2, 0.3, 0.5, 0.3, "Casanova");
		
		bicicleta.llevarPaquete(paquete1);
		bicicleta.llevarPaquete(paquete2);
		
		Integer cantidadDePaquetesQueLlevaLaBicicletaEsperado = 2;
		Integer cantidadDePaquetesQueLlevaLaBicicleta = bicicleta.getCantidadDePaquetesQueLleva();
		
		assertEquals (cantidadDePaquetesQueLlevaLaBicicletaEsperado, cantidadDePaquetesQueLlevaLaBicicleta);
	}
	
	@org.junit.Test 
	public void queUnaBicicletaNoPuedaLlevarMasDeDosPaquetes() {
		Bicicleta bicicleta = new Bicicleta (123);
		
		Paquete paquete1 = new Paquete (0.1, 0.3, 0.4, 0.4, "Casanova");
		Paquete paquete2 = new Paquete (0.2, 0.3, 0.5, 0.3, "Casanova");
		Paquete paquete3 = new Paquete (0.2, 0.9, 0.4, 0.1, "Isidro");
		
		bicicleta.llevarPaquete(paquete1);
		bicicleta.llevarPaquete(paquete2);
		bicicleta.llevarPaquete(paquete3);
		
		Integer cantidadDePaquetesQueLlevaLaBicicletaEsperado = 2;
		Integer cantidadDePaquetesQueLlevaLaBicicleta = bicicleta.getCantidadDePaquetesQueLleva();
		
		assertEquals (cantidadDePaquetesQueLlevaLaBicicletaEsperado, cantidadDePaquetesQueLlevaLaBicicleta);
	}
	
	@org.junit.Test
	public void queSiNoTengoDestinoEnBicicletaMeLoAsigneElPrimerPaquete() {
		Bicicleta bicicleta = new Bicicleta (123);
		
		Paquete paquete1 = new Paquete (0.1, 0.3, 0.4, 0.4, "Casanova");
		
		bicicleta.llevarPaquete(paquete1);
		
		String destinoEsperado = "Casanova";
		String destino = bicicleta.getDestino();
		
		assertEquals (destinoEsperado, destino);
	}
	
	@org.junit.Test
	public void queNoSePuedanRepetirLosDestinosEnUnAutomovil() {
		Automovil auto = new Automovil (123);
		
		Paquete paquete1 = new Paquete (0.1, 0.3, 0.4, 0.4, "Casanova");
		Paquete paquete2 = new Paquete (0.1, 0.2, 0.4, 0.4, "Casanova");
		
		auto.llevarPaquete(paquete1);
		auto.llevarPaquete(paquete2);
		
		Integer cantidadDePaquetesEsperado = 1;
		Integer cantidadDePaquetes = auto.getCantidadDePaquetesQueLleva();
		
		assertEquals (cantidadDePaquetesEsperado, cantidadDePaquetes);
	}
	
	
	
}
