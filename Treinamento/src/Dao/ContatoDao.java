package Dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import Model.Contato;
import Util.JPAUtilColetivo;

public class ContatoDao {

	public Boolean inserirContato(Contato contatoNovo) {
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		try {
			
			em.persist(contatoNovo);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			
			System.out.println("Não foi possível inserir o novo contato");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally {
			em.close();
		}

		return true;
		
	}
	
	public Contato retornarContatoPeloId(Integer id) {
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		Contato contadoDb = new Contato();
		
		
		try {
			contadoDb = em.find(Contato.class, id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			contadoDb = null;
			e.printStackTrace();
		} finally {
			em.close();
		}
				
		return contadoDb;
		
		
	}
	
	public Contato retornarContatoPeloNome(String nome) {
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		Contato contatoDb = new Contato();
				
		TypedQuery<Contato> typedQuery;
		typedQuery = em.createQuery("FROM Contato c WHERE c.nome = :pNome", Contato.class);
		typedQuery.setParameter("pNome", nome);
		
		try {
			contatoDb=typedQuery.getSingleResult();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			contatoDb=null;
			e.printStackTrace();
			
		} finally {
			em.close();
		}
		
		return contatoDb;
		
	}
	
	public List<Contato> retornarListContatos(){
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		List<Contato> listContato = new ArrayList<Contato>();
				
		TypedQuery<Contato> typedQuery;
		typedQuery = em.createQuery("FROM Contato c WHERE c.id !=null", Contato.class);
		
		try {
			listContato = typedQuery.getResultList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			listContato=null;
			e.printStackTrace();
		} finally {
			em.close();
		}
		
		return listContato;
		
	}
	
	public Boolean removerContatoPorId(Integer id) {
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		Contato contadoDb = new Contato();
		
		
		try {
			contadoDb = em.find(Contato.class, id);
			em.remove(contadoDb);
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
	
	

}
