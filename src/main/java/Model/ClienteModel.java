package Model;

import java.util.List;

import Exceções.ExisteException;
import Exceções.LoginInvalidoException;
import Exceções.VerifInvalidaException;
import Model.DAO.DAOCliente;
import Model.DAO.DAOGenerico;
import Model.DAO.DAOImple;
import Model.Entidades.Cliente;

public class ClienteModel {

	DAOGenerico<Cliente> dao = new DAOImple<Cliente>();
	DAOCliente daoc = new DAOCliente();

	public String registrarCliente(Cliente u) throws ExisteException {

		
			if (u.getNome() != null && u.getEmail() != null && u.getSenha() != null) {
				dao.inserir(u);
			}else {
				throw new ExisteException("Já existe.");
					}
		return "Dados salvos com sucesso.";
	}

	public String removerCliente(Cliente u) {
		if (u.getNome() != null && u.getEmail() != null && u.getSenha() != null) {
			dao.remover(u);
		} else {
			return "Falha ao remover.";
		}
		return "Remoção feita com sucesso.";
	}

	public String atualizarCliente(Cliente u) {
		if (u.getNome() != null && u.getEmail() != null && u.getSenha() != null) {
			dao.atualizar(u);
		} else {
			return "Falha ao atualizar informações.";
		}
		return "Atualizado com sucesso";
	}

	public List<Cliente> retornarCliente() {
		return dao.findAll();

	}

	public Cliente EncontrarCliente(String email) {
		return daoc.findCliente(email);
	}

	public static boolean valida(String senhaConfirm) throws VerifInvalidaException {
		Cliente cliente = new Cliente();
		if (senhaConfirm != cliente.getSenha()) {
			throw new VerifInvalidaException("Senhas diferem.");
		} else {
			return true;
		}
	}

	public static boolean invalido(String nome, String email, String senha) throws LoginInvalidoException {
		if (nome == null || email == null || senha == null) {
			throw new LoginInvalidoException("Login incorreto.");
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
