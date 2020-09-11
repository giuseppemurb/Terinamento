package Dao;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Model.LinhaNomes;
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
	
	public Servidor retornaServidorMatricula(String matricula) {
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		TypedQuery<Servidor> typedQuery;
		typedQuery = em.createQuery("FROM Servidor s WHERE s.matricula =:pMatricula", Servidor.class);
		typedQuery.setParameter("pMatricula", matricula);
		Servidor servidorDb = new Servidor();
		
		try {
			servidorDb = typedQuery.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			servidorDb = null;
			System.out.println("Não foi possível encontrar nenhum servidor com este nome");
		} finally {
			em.close();
		}
		
		return servidorDb;
		
	}

}
