package Model;
import java.util.List;

import Model.DAO.DAOGenerico;
import Model.DAO.DAOImovel;
import Model.DAO.DAOImple;
import Model.Entidades.Imovel;

public class ImovelModel {
	DAOGenerico<Imovel> dao = new DAOImple<Imovel>();
	DAOImovel daoi = new DAOImovel();
	
	public String registrarImovel(Imovel i) {
		if (i.getCidade() != null && i.getBairro() != null && i.getRua() != null && i.getCep() != null && i.getNumero() != 0) {
			dao.inserir(i);
		} else {
			return "Falha ao registrar. Preencha todos os campos.";
		}
		return "Dados salvos com sucesso.";
	}

	public String removerImovel(Imovel i) {
		if (i.getCidade() != null && i.getBairro() != null && i.getRua() != null && i.getCep() != null && i.getNumero() != 0) {
			dao.remover(i);
		} else {
			return "Falha ao remover.";
		}
		return "Remoção feita com com sucesso.";
	}

	public String atualizarImovel(Imovel i) {
		if (i.getCidade() != null && i.getBairro() != null && i.getRua() != null && i.getCep() != null && i.getNumero() != 0) {
			dao.atualizar(i);
		} else {
			return "Falha ao atualizar.";
		}
		return "Atualizado com sucesso.";
	}
	
	public List<Imovel> retornarImovel(){
		return dao.findAll();
	}
	
	public List<Imovel> listarImoveis(String bairro){
		return daoi.listarImoveis(bairro);
	
	}
}