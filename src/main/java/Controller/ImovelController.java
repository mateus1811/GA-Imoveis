package Controller;


import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import Model.ImovelModel;
import Model.Entidades.Imovel;

@ManagedBean(name = "imovelController")
@RequestScoped
public class ImovelController {

	private Imovel imovel = new Imovel();
	private List<Imovel> imoveis = new ArrayList<>();
	private ImovelModel im = new ImovelModel();

	public String addImovel() {
		
		im.registrarImovel(this.imovel);
		imoveis.add(imovel);
		imovel = new Imovel();
		
		FacesUtils.adicionarMsgInfo("Adicionado com Sucesso.");
		return "";
		
	}
	public void removerImovel(long id) {
		if (id == imovel.getId()) {
			imoveis.remove(imovel);
		}
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}

	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public ImovelModel getIm() {
		return im;
	}

	public void setIm(ImovelModel im) {
		this.im = im;
	}

}
