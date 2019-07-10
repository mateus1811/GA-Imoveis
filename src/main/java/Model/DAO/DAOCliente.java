package Model.DAO;


import javax.persistence.EntityManager;

import Model.DAOUtil.JPAManager;
import Model.Entidades.Cliente;

public class DAOCliente extends DAOImple<Cliente> implements DAOCli{
	

	  private EntityManager entityManager;

	  public Cliente findCliente(String email){
		  EntityManager manager = (EntityManager) JPAManager.getInstance().getEntityManager();
	    return entityManager.find(Cliente.class, email);
	  }

	 
}

