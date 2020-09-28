package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Model.Linha;
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
	
	public List<Viagem> retornarListViagem(){
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		TypedQuery<Viagem> typedQuery;
		typedQuery = em.createQuery("FROM Viagem v WHERE v.id != null", Viagem.class);
		List<Viagem> listViagem = new ArrayList<Viagem>();
		
		try {
			listViagem = typedQuery.getResultList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			listViagem = null;
			e.printStackTrace();
			
		}
		finally {
			em.close();
		}
		
		return listViagem;
		
	}
	
	public Boolean exluirViagemPelaId(Integer id) {
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		try {
			Viagem viagemDb = em.find(Viagem.class, id);
			em.remove(viagemDb);
			em.getTransaction().commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} finally {
			em.close();
		}
		
		return true;
		
	}

	public Boolean inserirListViagem(List<Viagem> listViagensNova) {
		Boolean resultadoInsercao = false;
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		try {
			listViagensNova.forEach(viagemNova->{
				em.persist(viagemNova);
			});
			em.getTransaction().commit();
			resultadoInsercao = true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			resultadoInsercao = false;
		} finally {
			
			em.close();
			
		}
		
		return resultadoInsercao;
		
	}
}
