package Dao;

import javax.persistence.EntityManager;

import Model.Servidor;
import Util.JPAUtilColetivo;

public class ServidorDao {
	
	
	public Boolean inserirServidor(Servidor servidorNovo) {
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		try {
			em.persist(servidorNovo);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			return false;

		} finally {
			em.close();
		}
		
		
		return true;
	}

}
