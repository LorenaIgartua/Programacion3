package Main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Entidades.*;

public class Main2 {
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Practico2-JPA-ApacheDerby");
		EntityManager entitymanager = emf.createEntityManager();
		entitymanager.getTransaction().begin();
		Equipo equipo = entitymanager.find(Equipo.class, 1);
		System.out.println(equipo);
		entitymanager.getTransaction().commit();
		entitymanager.close();
		emf.close();
		
	}
}
