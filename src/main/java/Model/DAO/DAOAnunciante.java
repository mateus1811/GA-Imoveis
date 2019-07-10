package Model.DAO;

import javax.persistence.EntityManager;

import Model.DAOUtil.JPAManager;
import Model.Entidades.Anunciante;

public class DAOAnunciante implements DAOAnun {
	
	public Anunciante findAnunciante(Anunciante anunciante){
		  EntityManager manager = (EntityManager) JPAManager.getInstance().getEntityManager();
	    return manager.find(Anunciante.class, anunciante.getId());
	  }


}
