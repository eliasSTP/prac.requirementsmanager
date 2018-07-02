package com.actions;

import java.util.List;

import com.BO.AnexoBO;
import com.entities.Anexo;
import com.opensymphony.xwork2.ActionSupport;

public class AnexoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Anexo anexo ;
	private List<Anexo> anexos ;
	
	public String altaAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexoBO.altaAnexo(anexo);
		return SUCCESS;
	}
	
	public String consultaAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexos = anexoBO.listAnexo();
		return SUCCESS;
	}
	
	public String inicioModificacionAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexo = anexoBO.getAnexo(anexo);
		return SUCCESS;
		
	}
	
	public String modificaAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexoBO.actualizaAnexo(anexo);
		return SUCCESS;
	}
	
	public String borraAnAc() {
		AnexoBO anexoBO = new AnexoBO();
		anexoBO.borraAnexo(anexo);
		return SUCCESS;
	}

	public Anexo getAnexo() {
		return anexo;
	}

	public void setAnexo(Anexo anexo) {
		this.anexo = anexo;
	}

	public List<Anexo> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
