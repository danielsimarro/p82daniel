package application;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import entities.Cuenta;



public class Programa {
	
	public static void main(String[] args) {
		
		List<Cuenta> lista = findAll();
		
		System.out.println("\n\nTodas las entidades ------------ ");
		for (Cuenta v : lista) {
			System.out.println(v);
		}
	}

	
	// Este método obtiene todos los registros de la tabla. Si no hay registros
		// devuelve una lista vacía
		public static List<Cuenta> findAll() {
			EntityManager em = getEntityManager();
			// Se crea la Query a partir del nombre de la NamedQuery de la clase Vehiculo
			Query q = em.createNamedQuery("Cuenta.findAll");
			// Se ejecuta la consulta y se hace un casting
			@SuppressWarnings("unchecked")
			List<Cuenta> listaCuenta = (List<Cuenta>) q.getResultList();
			// Cierra el entityManager
			em.close();
			return listaCuenta;
		}
		
		// Crea un objeto EntityManager usando una unidad de persistencia
		private static EntityManager getEntityManager() {
			// EntityManager permite realizar operaciones con la BD
			// Se obtiene a través del EntityManagerFactory y este a su vez se genera
			// a partir del nombre de la unidad de persistencia (fichero persistence.xml)
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("p82daniel");
			EntityManager em = entityManagerFactory.createEntityManager();
			return em;
		}
}
