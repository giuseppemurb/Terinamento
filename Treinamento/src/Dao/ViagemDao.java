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
	
	public Viagem retornarViagemPelaId (Integer id){
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		Viagem viagemDb = new Viagem();
		
		
		
		try {
			viagemDb = em.find(Viagem.class, id);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			viagemDb = null;

		} finally {
			em.close();
		}
		
		
		return viagemDb;
		
	}

}
