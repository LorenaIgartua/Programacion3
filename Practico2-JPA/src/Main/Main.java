package Main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidades.*;
import Servicios.ServiciosJugador;

public class Main {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Practico2-JPA-ApacheDerby");
		EntityManager entitymanager = emf.createEntityManager();
		
		ServiciosJugador.altaJugador(26590121, "Nicolas", "Igartua", 25, entitymanager);
		ServiciosJugador.altaJugador(25474949, "Esteban", "Canton", 16, entitymanager);
		ServiciosJugador.altaJugador(33222999, "Matias", "Canton", 17, entitymanager);
		ServiciosJugador.altaJugador(13456834, "Roque", "Risiga", 40, entitymanager);
		ServiciosJugador.altaJugador(78234567, "Pepe", "Mujica", 65, entitymanager);
		ServiciosJugador.altaJugador(22134567, "Juan", "Lopez", 33, entitymanager);
		ServiciosJugador.altaJugador(11237777, "Jose", "Manchini", 28, entitymanager);
		ServiciosJugador.altaJugador(33678191, "Lautaro", "Gomez", 22, entitymanager);
		ServiciosJugador.altaJugador(22556898, "Ramon", "Igartua", 7, entitymanager);
		
		
		List<Jugador> rdos = ServiciosJugador.buscarTodosLosJugadores(entitymanager);
		for (Jugador j : rdos) {
			System.out.println(j.toString());
		}
		
		System.out.println("otra consulta");
		
		List<Jugador> consulta = ServiciosJugador.buscarJugadoresPorNombre("Nicolas",entitymanager);
		for (Jugador j : consulta) {
			System.out.println(j.toString());
		}
//		entitymanager.getTransaction( ).begin( );
//		
//		Equipo equipo = new Equipo( 1 , "River" );
//		entitymanager.persist( equipo );
//		
//		Jugador jugador = new Jugador( );
//		jugador.setDni( 34287439 );
//		jugador.setNombre( "Jose" );
//		jugador.setApellido( "Perez" );
//		jugador.setEquipo( equipo );
//		entitymanager.persist( jugador );
//		
//		Torneo apertura = new Torneo();
//		apertura.setNombre("Apertura");
//		entitymanager.persist( apertura );
//		
//		entitymanager.getTransaction( ).commit( );
		entitymanager.close();
		emf.close();
		
	}
}
