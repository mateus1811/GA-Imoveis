package Model.DAO;

import java.util.List;

import Model.Entidades.Imovel;

public interface DAOImo {
	public List<Imovel> listarImoveis(String bairro);
}
