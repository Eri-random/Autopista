package ar.edu.unlam.pb220202c.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Autopista {
	// Si es necesario Utilice herencia o implemente de Interfaces
	// Se debe crear contructeres getters y Setters y los atributos o metodos que
	// crean convenientes
	private HashMap<Integer, Vehiculo> telepase;
	private HashSet<Vehiculo> vehiculosEnCirculacion;

	public Autopista() {
		this.telepase = new HashMap<>();
		this.vehiculosEnCirculacion= new HashSet<>();
	}

	public Boolean registrarTelepase(Integer numeroTelpase, Vehiculo vehiculo) {
		// k //v
		if (this.telepase.get(numeroTelpase) == null) {
			this.telepase.put(numeroTelpase, vehiculo);
			return true;
		}
		return false;
	}

	public Boolean ingresarAutopista(Integer numeroTelepase) {
		// si el telepase no esta registrado lanza una Exceptios del tipo
		// VehiculoNotFounException
		// y no permite ingresar al autopista
		if (this.telepase.containsKey(numeroTelepase)) {
			Vehiculo vehiculo = this.telepase.get(numeroTelepase);
			this.vehiculosEnCirculacion.add(vehiculo);
			return true;
		}

		return false;
	}

	public boolean salirAutopista(Vehiculo vehiculo) {
		// lanza Una exception VehiculoNotFounException si no esta en circulacion
		if(buscarVehiculo(vehiculo)) {
			this.vehiculosEnCirculacion.remove(vehiculo);
			return true;
		}
		return false;
	}

//	public TreeSet<Vehiculo> obtenerVehiculosConExcesosDeVelocidadOrdenadosPorPatente() {
//
//		return null;
//	}

	public Integer cantidadDeVehiculosENCirculacion() {
		return this.vehiculosEnCirculacion.size();
	}
	
	private boolean buscarVehiculo(Vehiculo vehiculo) {
		for (Vehiculo vehiculos : vehiculosEnCirculacion) {
		if(vehiculos.equals(vehiculos)){
				return true;
			}
		}
		return false;
	}
}
