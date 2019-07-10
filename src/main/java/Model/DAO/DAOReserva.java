package Model.DAO;


import java.util.Date;
import javax.persistence.EntityManager;

import Model.DAOUtil.JPAManager;
import Model.Entidades.Reserva;

public class DAOReserva {
	private EntityManager entityManager;

	   
	  public Reserva findReserva(Date data) {
		 EntityManager manager = (EntityManager) JPAManager.getInstance().getEntityManager();
	    return entityManager.find(Reserva.class, data);
	  }
	  
	  
	 
}
