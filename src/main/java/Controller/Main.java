package Controller;

import Model.ImovelModel;
import Model.Entidades.Imovel;

public class Main {

	public static void main(String[] args) {
		Imovel imovel = new Imovel(0, null, 0, null, null, null, null, 0, 0, 0, 0, 0, 0, false, 0, false, 0);

		ImovelModel ImovelModel = new ImovelModel();
		
		
		imovel.setId((long)1045);
		imovel.setRua("Rua do Caboclo");
		imovel.setNumero(5);
		imovel.setCidade("Cupira");
		imovel.setCep("23476532");
		imovel.setBairro("Centro");
		imovel.setTipo("Casa");
		imovel.setSuite(1);
		imovel.setBanheiro(3);
		imovel.setAreaT(90.3);
		imovel.setAreaC(76.3);
		imovel.setCondominio(0);
		imovel.setValor(400.000);
		imovel.setNovo(true);
		imovel.setIptu(100.0);
		imovel.setVenda(true);
		imovel.setDormitorio(4);
		
	
		ImovelModel.registrarImovel(imovel);
		
		System.out.println("Imóvel salvo com sucesso.");
		}

	}


