package Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import Model.Linha;
import Util.JPAUtilColetivo;

public class LinhaDao {
	
	// metodo de inserção do objeto linha do banco de dados
	public Boolean inserirLinhaDB(Linha linha) {
		
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		
		try {
			
			em.persist(linha);
			em.getTransaction().commit();
			
		} catch (Exception e) {
			
			System.out.println("Não foi possível inserir o nova Linha");
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		finally {
			em.close();
		}

		return true;
		
	}

	// metodo de retorno de objeto linha, entrada pelo prefixo da linha
	public Linha retornaLinha(String numeroLinha) {
		Linha linhaDB = new Linha();
				
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
				
		TypedQuery<Linha> typedQuery;
		typedQuery = em.createQuery("FROM Linha l WHERE l.numeroLinha = :pNumero and l.ativo=true", Linha.class);
		typedQuery.setParameter("pNumero", numeroLinha);
		try {
		linhaDB = typedQuery.getSingleResult();
		} catch (Exception e) {
					
		System.out.println("Erro Linha não encontrado !!! :"+numeroLinha);
		//e.printStackTrace();
		linhaDB = null;
		
		}
				em.close();
				return linhaDB;
		}

	// metodo que retorna todas as linhas ativas
	public List<Linha> retornaListaLinha(){
		EntityManager em = new JPAUtilColetivo().getEntityManager();
		em.getTransaction().begin();
		List<Linha> listaLinha = new ArrayList<Linha>();
		TypedQuery<Linha> typedQuery;
		typedQuery = em.createQuery("FROM Linha l where l.ativo=true order by id asc", Linha.class);
		listaLinha = typedQuery.getResultList();
		em.close();
		return listaLinha;
	}
}
