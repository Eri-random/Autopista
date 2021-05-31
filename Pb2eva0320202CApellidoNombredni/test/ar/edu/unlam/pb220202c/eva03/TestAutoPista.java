package ar.edu.unlam.pb220202c.eva03;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestAutoPista {
	
	
	public void queSePuedaRegistrarTelepase () {
		Autopista moreno = new Autopista();
		Vehiculo auto = new Automovil("ABC123");
		assertTrue(moreno.registrarTelepase(1, auto));
	}

	public void queAlSalirDelAutopistaNoestaEncirculacionLanceUnaExcepcion() {
		Autopista moreno = new Autopista();
		Vehiculo auto = new Automovil("ABC123");
		moreno.registrarTelepase(1, auto);
		moreno.ingresarAutopista(1);
		assertFalse(moreno.salirAutopista(auto));
	}
	
//	public void queVerifiqueQueSeObtengaUnaListaDeAutosInsfractoresOrdenadaPorPatente(){
//		
//	}

	public void cantidadDeVehiculosEnLaAutopista() {
		Autopista moreno = new Autopista();
		Vehiculo auto = new Automovil("ABC123");
		Vehiculo camion = new Camion("AAA123", 3);
		Vehiculo moto = new Vehiculo("PMI444", 120);
		moreno.registrarTelepase(1, auto);
		moreno.registrarTelepase(2, camion);
		moreno.registrarTelepase(3, moto);
		moreno.ingresarAutopista(1);
		moreno.ingresarAutopista(2);
		moreno.ingresarAutopista(3);
		assertEquals((Integer)3, moreno.cantidadDeVehiculosENCirculacion());

	}
	
	public void queNoSePermitaIngresar2pantetesIgualesALaAutopiesta() {
		Autopista moreno = new Autopista();
		Vehiculo auto = new Automovil("ABC123");
		Vehiculo camion = new Camion("AAA123", 3);
		Vehiculo moto = new Vehiculo("AAA123", 120);
		moreno.registrarTelepase(1, auto);
		moreno.registrarTelepase(2, camion);
		moreno.registrarTelepase(3, moto);
		moreno.ingresarAutopista(1);
		moreno.ingresarAutopista(2);
		moreno.ingresarAutopista(3);
		assertEquals((Integer)2, moreno.cantidadDeVehiculosENCirculacion());
	}
	
}
