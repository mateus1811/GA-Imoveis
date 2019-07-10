package Model.DAOUtil;

import javax.persistence.*;



public class JPAManager {

	private static JPAManager manager;
	private EntityManagerFactory sessionFactory;
	
	private JPAManager() {
		sessionFactory = Persistence.createEntityManagerFactory("GA-Imoveis");
	}
	
	public static JPAManager getInstance() {
		if (manager == null) {
			manager = new JPAManager();
		}
		
		return manager;
	}
	
	public EntityManager getEntityManager() {
		return sessionFactory.createEntityManager();
	}
}
