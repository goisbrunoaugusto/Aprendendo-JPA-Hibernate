package br.com.alura.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("loja");

	public static EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

}
