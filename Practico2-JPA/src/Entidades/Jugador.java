package Entidades;

//import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TABLA_JUGADORES")
public class Jugador  {
	
	
	@Id
	private int dni;
	@Column(nullable = false)
	private String nombre;
	@Column(nullable = false)
	private String apellido;
	@Column
	private int edad;
	@ManyToOne  
	@JoinColumn(nullable = true)
	private Equipo equipo;
	
	
	public Jugador( ) {
		this.dni = 0;
		this.nombre = null;
		this.apellido = null;
		this.edad = 0;
		this.equipo = null;
	}

	public int getDni() {
		return dni;
	}


	public void setDni(int dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Equipo getEquipo() {
		return equipo;
	}


	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}


	@Override
	public String toString() {
		return "Jugador [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	

}
