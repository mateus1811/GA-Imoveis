package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.ReservaModel;
import Model.Entidades.Reserva;

public class ReservaController {
	private Reserva reserva = new Reserva();
	private List<Reserva> reservas = new ArrayList<>();
	private ReservaModel re = new ReservaModel();

	public String addReserva(){
		re.fazerReserva(this.reserva);
		reservas.add(reserva);
		reserva = new Reserva();
		return "";
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public ReservaModel getRe() {
		return re;
	}

	public void setRe(ReservaModel re) {
		this.re = re;
	}

	public String removerAnunciante(Reserva reserva) {
		if (this.reserva.getId() == reserva.getId()) {
			reservas.remove(reserva);
		}
		return "";
	}
	
}
