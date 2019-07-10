package Model.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import Model.DAOUtil.JPAManager;



public class DAOImple<T> implements DAOGenerico<T> {
	private Class<T> classe;
	public void setClazz(Class<T> classeToSet){
		this.classe = classeToSet;
	}
	
	public List<T> findAll() {
		EntityManager manager = (EntityManager) JPAManager.getInstance().getEntityManager();
		return manager.createQuery("FROM " + classe.getName(), classe).getResultList();
	}
	
	public void inserir(T t) {
		EntityManager manager = (EntityManager) JPAManager.getInstance().getEntityManager();
		
		try  {
			manager.getTransaction().begin();		
			manager.persist(t);
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}

	public void remover(T t) {
		EntityManager manager = JPAManager.getInstance().getEntityManager();
		
		try  {
			manager.getTransaction().begin();		
			manager.remove(t);
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}

	public void atualizar(Object t) {
		EntityManager manager = JPAManager.getInstance().getEntityManager();
		
		try  {
			manager.getTransaction().begin();		
			manager.merge(t);
			manager.getTransaction().commit();
			
		} catch (Exception e) {
			manager.getTransaction().rollback();
		} finally {
			manager.close();
		}
	}
	
	

	
	
	
}
	


