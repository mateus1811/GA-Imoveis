package Model.Entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "IMOVEL")
public class Imovel implements Serializable{
	private static final long serialVersionUID = -1720461322374106312L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "IDIMOVEL", nullable = false)
	private long id;
	
	@Column(name = "RUA", nullable = false)
	private String rua;
	
	@Column(name = "NUMERO", nullable = false)
	private int numero;
	
	@Column(name = "CIDADE", nullable = false)
	private String cidade;
	
	@Column(name = "CEP", nullable = false)
	private String cep;
	
	@Column(name = "BAIRRO", nullable = false)
	private String bairro;
	
	@Column(name = "TIPO", nullable = false)
	private String tipo;
	
	@Column(name = "NUM_SUITE", nullable = false)
	private int suite;
	
	@Column(name = "NUM_BANHEIRO", nullable = false)
	private int banheiro;
	
	@Column(name = "AREA_TOTAL", nullable = false)
	private double areaT;
	
	@Column(name = "AREA_CONSTRUIDA", nullable = false)
	private double areaC;
	
	@Column(name = "CONDOMINIO")
	private double condominio;
	
	@Column(name = "VALOR", nullable = false)
	private double valor;
	
	@Column(name = "NOVO", nullable = false)
	private boolean novo;
	
	@Column(name = "IPTU")
	private double iptu;
	
	@Column(name = "VENDA", nullable = false)
	private boolean venda;
	
	@Column(name = "NUM_DORMITORIO", nullable = false)
	private int dormitorio;

	public Imovel(){
		
	}
	public Imovel(long id, String rua, int numero, String cidade, String cep, String bairro, String tipo,
			int suite, int banheiro, double areaT, double areaC, double condominio, double valor, boolean novo,
			double iptu, boolean venda, int dormitorio) {
		this.id = id;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
		this.cep = cep;
		this.bairro = bairro;
		this.tipo = tipo;
		this.suite = suite;
		this.banheiro = banheiro;
		this.areaT = areaT;
		this.areaC = areaC;
		this.condominio = condominio;
		this.valor = valor;
		this.novo = novo;
		this.iptu = iptu;
		this.venda = venda;
		this.dormitorio = dormitorio;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSuite() {
		return suite;
	}

	public void setSuite(int suite) {
		this.suite = suite;
	}

	public int getBanheiro() {
		return banheiro;
	}

	public void setBanheiro(int banheiro) {
		this.banheiro = banheiro;
	}

	public double getAreaT() {
		return areaT;
	}

	public void setAreaT(double areaT) {
		this.areaT = areaT;
	}

	public double getAreaC() {
		return areaC;
	}

	public void setAreaC(double areaC) {
		this.areaC = areaC;
	}

	public double getCondominio() {
		return condominio;
	}

	public void setCondominio(double condominio) {
		this.condominio = condominio;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public boolean isNovo() {
		return novo;
	}

	public void setNovo(boolean novo) {
		this.novo = novo;
	}

	public double getIptu() {
		return iptu;
	}

	public void setIptu(double iptu) {
		this.iptu = iptu;
	}

	public boolean isVenda() {
		return venda;
	}

	public void setVenda(boolean venda) {
		this.venda = venda;
	}

	public int getDormitorio() {
		return dormitorio;
	}

	public void setDormitorio(int dormitorio) {
		this.dormitorio = dormitorio;
	}
	

}
