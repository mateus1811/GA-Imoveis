package Model.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ANUNCIANTE")
public class Anunciante implements Serializable {
	private static final long serialVersionUID = -5459075785329367796L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "IDANUNCIANTE", nullable = false)
	private long id;

	@Column(name = "NOME", nullable = false)
	private String nome;

	@Column(name = "EMAIL", nullable = false, unique = true)
	private String email;

	@Column(name = "SENHA", nullable = false)
	private String senha;

	@Column(name = "TEL_COMERCIAL")
	private int telefoneCom;

	@Column(name = "TEL_RESIDENCIAL")
	private int telefoneRes;

	@Column(name = "TEL_CELULAR", nullable = false)
	private int telefoneCel;
	
	public Anunciante() {

	}

	public Anunciante(long id, String nome, String email, String senha, int telefoneCom, int telefoneRes,
			int telefoneCel) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.telefoneCom = telefoneCom;
		this.telefoneRes = telefoneRes;
		this.telefoneCel = telefoneCel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getTelefoneCom() {
		return telefoneCom;
	}

	public void setTelefoneCom(int telefoneCom) {
		this.telefoneCom = telefoneCom;
	}

	public int getTelefoneRes() {
		return telefoneRes;
	}

	public void setTelefoneRes(int telefoneRes) {
		this.telefoneRes = telefoneRes;
	}

	public int getTelefoneCel() {
		return telefoneCel;
	}

	public void setTelefoneCel(int telefoneCel) {
		this.telefoneCel = telefoneCel;
	}

}
