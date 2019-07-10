package Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Model.Entidades.Anunciante;
import Model.Entidades.Cliente;

@ManagedBean(name = "loginController")
@SessionScoped
public class LoginController {
	private String login;
	private String senha;
	
	public LoginController(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}
	
	public boolean fazerLogin(String login, String senha) {
		Cliente cliente = new Cliente();
		Anunciante anunciante = new Anunciante();
		if(senha == cliente.getSenha() && login == cliente.getEmail() || senha == anunciante.getSenha() && login == anunciante.getEmail()) {
			return true;
		}
		return false;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}
