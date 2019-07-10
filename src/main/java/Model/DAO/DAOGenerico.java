package Model.DAO;

import java.util.List;

public interface DAOGenerico <T>{
	public void inserir(T t);
	                       
	public void remover(T t);
	
	public void atualizar(T t);
	
	List<T> findAll();

	
}
