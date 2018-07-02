package com.actions;

import java.util.List;

import com.BO.RequisitoBO;
import com.entities.Requisito;
import com.opensymphony.xwork2.ActionSupport;

public class RequisitoAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Requisito requisito ;
	private List<Requisito> requisitos ;
	
	public String altaReAc() {
		RequisitoBO requisitoBO = new RequisitoBO();
		requisitoBO.alta(requisito);
		return SUCCESS;
	}
	
	public String consultaReAc() {
		RequisitoBO requisitoBO = new RequisitoBO();
		requisitos = requisitoBO.list();
		return SUCCESS;
	}
	
	public String inicioModificacionReAc() {
		RequisitoBO requisitoBO = new RequisitoBO();
		requisito = requisitoBO.getRequisito(requisito);
		return SUCCESS;
		
	}
	
	public String modificaReAc() {
		RequisitoBO requisitoBO = new RequisitoBO();
		requisitoBO.actualizaRequisito(requisito);
		return SUCCESS;
	}
	
	public String borraReAc() {
		RequisitoBO requisitoBO = new RequisitoBO();
		requisitoBO.borra(requisito);
		return SUCCESS;
	}

	public Requisito getRequisito() {
		return requisito;
	}

	public void setRequisito(Requisito requisito) {
		this.requisito = requisito;
	}

	public List<Requisito> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(List<Requisito> requisitos) {
		this.requisitos = requisitos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
