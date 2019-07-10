package Model.Entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "RESERVA")
public class Reserva implements Serializable{
	private static final long serialVersionUID = -1902722205311621117L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "IDRESERVA", nullable = false)
	private long id;
	
	@ManyToOne(cascade= CascadeType.ALL)
	private Cliente idCl;
	
	@ManyToOne(cascade= CascadeType.ALL)
	private Anunciante idAn;
	
	@JoinColumn(name = "IDIMOVEL", referencedColumnName = "IDIMOVEL")
	@OneToOne(cascade = CascadeType.ALL)
	private Imovel idIm;
	
	@Column(name = "DATA", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date data;
	
	public Reserva(){
		
	}
	public Reserva(long id, Cliente idCl, Anunciante idAn, Imovel idIm, Date data) {
		this.id = id;
		this.idCl = idCl;
		this.idAn = idAn;
		this.idIm = idIm;
		this.data = data;	
	}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Cliente getIdCl() {
		return idCl;
	}

	public void setIdCl(Cliente idCl) {
		this.idCl = idCl;
	}

	public Anunciante getIdAn() {
		return idAn;
	}

	public void setIdAn(Anunciante idAn) {
		this.idAn = idAn;
	}

	public Imovel getIdIm() {
		return idIm;
	}

	public void setIdIm(Imovel idIm) {
		this.idIm = idIm;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
}
