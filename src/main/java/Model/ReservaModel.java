package Model;
import java.util.Date;
import java.util.List;

import Model.DAO.DAOGenerico;
import Model.DAO.DAOImple;
import Model.DAO.DAOReserva;
import Model.Entidades.Reserva;

public class ReservaModel {
	DAOGenerico<Reserva> dao = new DAOImple<Reserva>();
	DAOReserva daor = new DAOReserva();
	
	public String fazerReserva(Reserva r) {
		if (r.getId() != 0 && r.getIdCl() != null && r.getIdAn() != null && r.getIdIm() != null && r.getData() != null) {
			dao.inserir(r);
		} else {
			return "Falha ao registrar. Preencha todos os campos.";
		}
		return "Reserva realizada com sucesso.";
	}

	public String removerReserva(Reserva r) {
		if (r.getId() != 0 && r.getIdCl() != null && r.getIdAn() != null && r.getIdIm() != null && r.getData() != null) {
			dao.remover(r);
		} else {
			return "Falha ao remover.";
		}
		return "Remoção feita com sucesso.";
	}

	public String atualizarReserva(Reserva r) {
		if (r.getId() != 0 && r.getIdCl() != null && r.getIdAn() != null && r.getIdIm() != null && r.getData() != null) {
			dao.atualizar(r);
		} else {
			return "Falha ao atualizar.";
		}
		return "Atualizado com sucesso.";
	}
	public List<Reserva> retornarReserva(){
		return dao.findAll() ;
		
	}
	
	public Reserva EncontrarPorData(Date data){
		return daor.findReserva(data);
	}
}
