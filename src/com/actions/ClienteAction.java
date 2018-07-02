package com.actions;

import java.util.List;

import com.BO.ClienteBO;
import com.entities.Cliente;
import com.opensymphony.xwork2.ActionSupport;

public class ClienteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Cliente cliente ;
	private List<Cliente> clientes ;
	
	public String altaCliAc() {
		ClienteBO clienteBO = new ClienteBO();
		clienteBO.altaCliente(cliente);
		return SUCCESS;
	}
	
	public String consultaCliAc() {
		ClienteBO clienteBO = new ClienteBO();
		clientes = clienteBO.listClientes();
		return SUCCESS;
	}
	
	public String inicioModificacionCliAc() {
		ClienteBO clienteBO = new ClienteBO();
		cliente = clienteBO.getCliente(cliente);
		return SUCCESS;
		
	}
	
	public String modificaCliAc() {
		ClienteBO clienteBO = new ClienteBO();
		clienteBO.actualizaCliente(cliente);
		return SUCCESS;
	}
	
	public String borraCliAc() {
		ClienteBO clienteBO = new ClienteBO();
		clienteBO.borraCliente(cliente);
		return SUCCESS;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
