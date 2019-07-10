package Model.DAO;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import Model.DAOUtil.JPAManager;
import Model.Entidades.Imovel;

public class DAOImovel extends DAOImple<Imovel> implements DAOImo {
	 private EntityManager entityManager;

	 	    
	  
	public List<Imovel> listarImoveis(String bairro) {
		  
		  EntityManager manager = (EntityManager) JPAManager.getInstance().getEntityManager();
			try{ 
				Query query = manager.createQuery("SELECT i FROM Imovel i WHERE i.bairro like '%" + bairro + "%'");
				List<Imovel> imoveis = query.getResultList();
				return imoveis;
			} catch (Exception e) {
				manager.getTransaction().rollback();
			} finally {
				manager.close();
			}
		return null;
	  }
}

	  
