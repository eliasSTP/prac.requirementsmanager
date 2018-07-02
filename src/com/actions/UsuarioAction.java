package com.actions;

import java.util.List;

import com.BO.UsuarioBO;
import com.entities.Usuario;
import com.opensymphony.xwork2.ActionSupport;

public class UsuarioAction extends ActionSupport  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuario usuario ;
	private List<Usuario> usuarios ;
	
	public String altaUsAc() {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.altaUsuario(usuario);
		return SUCCESS;
	}
	
	public String consultaUsAc() {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarios = usuarioBO.listUsuario();
		return SUCCESS;
	}
	
	public String inicioModificacionUsAc() {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuario = usuarioBO.getUsuario(usuario);
		return SUCCESS;
		
	}
	
	public String modificaUsAc() {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.actualizaUsuario(usuario);
		return SUCCESS;
	}
	
	public String borraUsAc() {
		UsuarioBO usuarioBO = new UsuarioBO();
		usuarioBO.borraUsuario(usuario);
		return SUCCESS;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
		

}
