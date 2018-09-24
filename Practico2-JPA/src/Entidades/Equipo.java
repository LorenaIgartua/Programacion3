package Entidades;


//import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity  //indico que quiero una tabla llamada Equipo ... es OBLIGATORIA ..... si quiero otro nombre, uso name
@Table(name="TABLA_EQUIPOS")
public class Equipo {
	
	
	@Id //indico que el id de la tabla es id ... es OBLIGATORIA 
	@Column(name="idEquipo")
	private int id;
	@Column(name="nombre", nullable = false)
	private String nombreEquipo;
	@OneToMany(mappedBy="equipo")   //un equipo puede tener varios jugadores .... 
//	se agrega mappedBy para indicar cual atributo de jugador voy a usar de factor comun
	private Set<Jugador> jugadores;
	@ManyToMany(mappedBy="equipos")
	private Set<Torneo> torneos;
	
	
	
	
	public Equipo() {
		super();
	}
	
	public Equipo (int id, String nombre) {
		this.id = id;
		this.nombreEquipo = nombre;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreEquipo() {
		return nombreEquipo;
	}


	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}


	@Override
	public String toString() {
		return "Equipo [id=" + id + ", nombreEquipo=" + nombreEquipo + ", jugadores=" + jugadores + "]";
	}
	
	
	
}
