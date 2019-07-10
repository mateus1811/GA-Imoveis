package Model;


import java.util.List;

import Exceções.ExisteException;
import Exceções.LoginInvalidoException;
import Exceções.VerifInvalidaException;
import Model.DAO.DAOAnun;
import Model.DAO.DAOAnunciante;
import Model.DAO.DAOGenerico;
import Model.DAO.DAOImple;
import Model.Entidades.Anunciante;

public class AnuncianteModel {
	
	DAOGenerico<Anunciante> dao = new DAOImple<Anunciante>();
	DAOAnun dao1 = new DAOAnunciante();
	
	
	public  String registrarAnunciante(Anunciante a) throws ExisteException, LoginInvalidoException{
		if( a.getNome() != null && a.getEmail() != null && a.getSenha() != null) {
			if (dao1.findAnunciante(a) == null) {
				dao.inserir(a);
			} else {
				throw new ExisteException("Já existe.");
			}
		} else { 
			throw new LoginInvalidoException("Falha ao registrar. Preencha todos os campos.");
		}
		return "Dados salvos com sucesso.";
			
		}
	

	public String removerAnunciante(Anunciante a) {
		if (a.getNome() != null && a.getEmail() != null && a.getSenha() != null) {
			dao.remover(a);
		} else {
			return "Falha ao remover.";
		}
		return "Remoção feita com sucesso";
	}

	public String atualizarAnunciante(Anunciante a) {
		if (a.getNome() != null && a.getEmail() != null && a.getSenha() != null) {
			dao.atualizar(a);
		} else {
			return "Falha ao atualizar informações."; 
		}
		return "Atualizado com sucesso.";
	}
	public List<Anunciante> retornarAnunciante(){
		return dao.findAll() ;
		
	}
	
	public Anunciante EncontrarAnunciante(Anunciante a){
		return ((DAOAnunciante)dao).findAnunciante(a);
	}
	

	public boolean valida (String senhaConfirm) throws VerifInvalidaException{
		Anunciante anunciante = new Anunciante();
		if (senhaConfirm != anunciante.getSenha()) {
		throw new VerifInvalidaException ("Senhas diferem.");
		} else {
			return true;
		}
	}	
	public static boolean invalido (String nome, String email, String senha) throws LoginInvalidoException{
		if (nome == null || email == null || senha == null) {
			throw new LoginInvalidoException ("Falha ao registrar. Preencha todos os campos.");
		} else {
			return false;
		}
	}
	public static boolean existe (String email) throws ExisteException{
		if (email != null) {
			throw new ExisteException("Já Existe.");
		} else {
			return true;
		}
		
	}
}
