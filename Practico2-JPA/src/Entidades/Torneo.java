package Entidades;

//import java.io.Serializable;
import java.util.Calendar;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity  
@Table(name="TABLA_TORNEOS")
public class Torneo {
	
	@Id 
	@Column(name="idTorneo")
	private int idTorneo;
	@Column(name="nombre", nullable = false)
	private String nombre;
	@Column(name="fecha", nullable = true)
	private Calendar fecha;
	@ManyToMany   
	private Set<Equipo> equipos;
	
	public Torneo() {
		super();
	}

	public int getIdTorneo() {
		return idTorneo;
	}

	public void setIdTorneo(int idTorneo) {
		this.idTorneo = idTorneo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	

	@Override
	public String toString() {
		return "Torneo [idTorneo=" + idTorneo + ", nombre=" + nombre + ", fecha=" + fecha + "]";
	}

}
