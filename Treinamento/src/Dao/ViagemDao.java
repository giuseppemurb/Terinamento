package Dao;

import javax.persistence.EntityManager;

import Model.Viagem;
import Util.JPAUtilColetivo;

public class ViagemDao {
	
	
	public Boolean inserirViagem (Viagem viagem) {
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		try {
			em.persist(viagem);
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
