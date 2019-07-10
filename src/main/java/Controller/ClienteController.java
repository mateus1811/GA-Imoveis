package Controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import Exceções.ExisteException;
import Model.ClienteModel;
import Model.Entidades.Cliente;
@ManagedBean(name = "clienteController")
@SessionScoped
public class ClienteController {
	
private Cliente cliente = new Cliente();
private List<Cliente> clientes = new ArrayList<>();
private ClienteModel cm = new ClienteModel();

public void addCliente() throws ExisteException {
	try {
		cm.registrarCliente(this.cliente);
		FacesUtils.adicionarMsgInfo("Cliente adicionado com Sucesso.");
	} catch (ExisteException ee) {
		FacesUtils.adicionarMsgErro("Falha ao adicionar.");
	}
	clientes.add(cliente);
	cliente = new Cliente();
	
}
public void removerCliente(String email) {
	if (email.contentEquals(cliente.getEmail())) {
		clientes.remove(cliente);
	}
}

public Cliente getCliente() {
	return cliente;
}

public void setCliente(Cliente cliente) {
	this.cliente = cliente;
}

public List<Cliente> getClientes() {
	return clientes;
}

public void setClientes(List<Cliente> clientes) {
	this.clientes = clientes;
}

public ClienteModel getCm() {
	return cm;
}

public void setCm(ClienteModel cm) {
	this.cm = cm;
}


}
