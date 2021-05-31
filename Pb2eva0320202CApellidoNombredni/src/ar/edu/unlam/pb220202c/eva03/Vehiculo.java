package ar.edu.unlam.pb220202c.eva03;

public class Vehiculo implements Imultable {

	// Se debe crear contructeres getters y Setters y los que crean convenientes
	private String patente;
	private Integer velocidadActual = 0;
	private Integer limiteVelocidad;
	private Boolean estado;

	public Vehiculo(String patente, Integer limiteVelocidad) {
		this.patente = patente;
		this.limiteVelocidad = limiteVelocidad;
	}

	public void incrementarVelocidad(Integer velocidad) {
		this.velocidadActual += velocidad;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelocidadActual() {
		return velocidadActual;
	}

	public Integer getLimiteVelocidad() {
		return limiteVelocidad;
	}

	@Override
	public boolean enInfraccion() {
		if (this.velocidadActual > this.limiteVelocidad) {
			return this.estado=true;
		}
		return this.estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}
	
	

}
