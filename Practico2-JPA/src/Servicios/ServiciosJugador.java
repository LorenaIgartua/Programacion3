package Servicios;

import java.util.List;

//import javax.management.Query;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import Entidades.Jugador;

public class ServiciosJugador {
	
	public static void altaJugador (int dni, String n, String ap, int edad, EntityManager entitymanager) {		
		entitymanager.getTransaction( ).begin( );

		Jugador jugador = new Jugador();
		jugador.setDni(dni);
		jugador.setNombre(n);
		jugador.setApellido(ap);
		jugador.setEdad(edad);
		
		entitymanager.persist( jugador );
		entitymanager.getTransaction( ).commit( );
	}
	
//	public static void consultaJugador (int dni, EntityManager entitymanager) {		
//		
//		Jugador jugador = entitymanager.find(Jugador.class, dni);
//		if (jugador != null) {
//			
//		}
//		entitymanager.getTransaction( ).begin( );
//
//		Jugador jugador = new Jugador();
//		jugador.setDni(dni);
//		jugador.setNombre(n);
//		jugador.setApellido(ap);
//		jugador.setEdad(edad);
//		
//		entitymanager.persist( jugador );
//		entitymanager.getTransaction( ).commit( );
//	}
	
	public static List<Jugador> buscarTodosLosJugadores (EntityManager entitymanager) {		
		
		String jpql = "SELECT j FROM Jugador j";
		Query query = entitymanager.createQuery(jpql);
		List<Jugador> resultados = query.getResultList();
		return resultados;
	}
	
	public static List<Jugador> buscarJugadoresPorNombre (String nombre, EntityManager entitymanager) {		
		
		String jpql = "SELECT j FROM Jugador j WHERE j.nombre = ?1";
		Query query = entitymanager.createQuery(jpql);
		query.setParameter(1, nombre);
		List<Jugador> resultados = query.getResultList();
		return resultados;
	}
	
	public static List<Jugador> buscarJugadoresPorEdad (int edad, EntityManager entitymanager) {		
		
		String jpql = "SELECT j FROM Jugador j WHERE j.nombre > ?1";
		Query query = entitymanager.createQuery(jpql);
		query.setParameter(1, edad);
		List<Jugador> resultados = query.getResultList();
		return resultados;
	}
	
//	public static void bajaJugador (int dni, EntityManager entitymanager) {		
//		
//		Jugador jugador = entitymanager.find(Jugador.class, dni);
//		if (jugador != null) {
//			entitymanager.
//			
//		}
//
//		Jugador jugador = new Jugador();
//		jugador.setDni(dni);
//		jugador.setNombre(n);
//		jugador.setApellido(ap);
//		jugador.setEdad(edad);
//		
//		entitymanager.persist( jugador );
//		entitymanager.getTransaction( ).commit( );
//		
//		String jpql = "SELECT j FROM Jugador j WHERE j.nombre > ?1";
//		Query query = entitymanager.createQuery(jpql);
//		query.setParameter(1, edad);
//		List<Jugador> resultados = query.getResultList();
//		return resultados;
//	}
		

}


