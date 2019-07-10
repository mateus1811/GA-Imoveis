package Model.DAO;

import Model.Entidades.Cliente;

public interface DAOCli {
	public Cliente findCliente(String email);
}
