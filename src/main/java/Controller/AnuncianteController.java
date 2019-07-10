package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Exceções.ExisteException;
import Exceções.LoginInvalidoException;
import Model.AnuncianteModel;
import Model.Entidades.Anunciante;

@ManagedBean(name = "anuncianteController")
@SessionScoped
public class AnuncianteController {
	private Anunciante anunciante = new Anunciante();
	private List<Anunciante> anunciantes = new ArrayList<>();
	private AnuncianteModel an = new AnuncianteModel();

	public String addAnunciante() throws ExisteException, LoginInvalidoException {
		try {
			an.registrarAnunciante(this.anunciante);
			FacesUtils.adicionarMsgInfo("Adicionado com Sucesso.");
		} catch (ExisteException ee) {
			FacesUtils.adicionarMsgErro("Falha ao adicionar.");
		}
		anunciantes.add(anunciante);
		anunciante = new Anunciante();
		return "";
	}

	public String removerAnunciante(Anunciante anunciante) {
		if (this.anunciante.getId() == anunciante.getId()) {
			anunciantes.remove(anunciante);
		}
		return "";
	}

	public Anunciante getAnunciante() {
		return anunciante;
	}

	public void setAnunciante(Anunciante anunciante) {
		this.anunciante = anunciante;
	}

	public List<Anunciante> getAnunciantes() {
		return anunciantes;
	}

	public void setAnunciantes(List<Anunciante> anunciantes) {
		this.anunciantes = anunciantes;
	}

}
