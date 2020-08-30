package Util;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;

public class JPAUtilColetivo {

	private static final ThreadLocal<EntityManager> threadLocal = new ThreadLocal<EntityManager>();
	private static Map<Object, Object> connectionProperties = new HashMap<Object, Object>();
	private static EntityManagerFactory factory;
	private static int x=0;
	
	
	public EntityManager getEntityManager() {
		EntityManager em = (EntityManager) threadLocal.get();
		if (em == null || !em.isOpen()) {
                try {
                	if(x<5)x++;
                	else {
                		closeManerAndFactory();
                		x=0;
                	}
           		 em = getFactory().createEntityManager();
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null,"Nenhum Banco de Dados foi encontrado", "Erro!", JOptionPane.ERROR_MESSAGE, null);
					e.printStackTrace();
				}
                threadLocal.set(em);
     

		}
        return em;
		

	}
	
	public EntityManagerFactory getFactory() throws SQLException {
		if (factory == null || !factory.isOpen()) {

			//connectionProperties.put(AvailableSettings.DATASOURCE, poolConexao.getDataSource());
            factory = Persistence.createEntityManagerFactory("appRXT", connectionProperties);

        }
        return factory;
		
		
	}
	
	public void closeManerAndFactory() {
		
		factory.close();
		threadLocal.set(null);
		
	}

}
