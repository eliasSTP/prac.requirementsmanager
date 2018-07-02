package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Anexo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_anexo ;
	private String descripcion_anexo ;
	private String captura_pantalla1 ;
	private String captura_pantalla2 ;
	private String captura_pantalla3 ;
	private String documentacion_adicional ;
	
	@ManyToOne
	private Prueba prueba ;

	public int getId_anexo() {
		return id_anexo;
	}

	public void setId_anexo(int id_anexo) {
		this.id_anexo = id_anexo;
	}

	public String getDescripcion_anexo() {
		return descripcion_anexo;
	}

	public void setDescripcion_anexo(String descripcion_anexo) {
		this.descripcion_anexo = descripcion_anexo;
	}

	public String getCaptura_pantalla1() {
		return captura_pantalla1;
	}

	public void setCaptura_pantalla1(String captura_pantalla1) {
		this.captura_pantalla1 = captura_pantalla1;
	}

	public String getCaptura_pantalla2() {
		return captura_pantalla2;
	}

	public void setCaptura_pantalla2(String captura_pantalla2) {
		this.captura_pantalla2 = captura_pantalla2;
	}

	public String getCaptura_pantalla3() {
		return captura_pantalla3;
	}

	public void setCaptura_pantalla3(String captura_pantalla3) {
		this.captura_pantalla3 = captura_pantalla3;
	}

	public String getDocumentacion_adicional() {
		return documentacion_adicional;
	}

	public void setDocumentacion_adicional(String documentacion_adicional) {
		this.documentacion_adicional = documentacion_adicional;
	}

	public Prueba getPrueba() {
		return prueba;
	}

	public void setPrueba(Prueba prueba) {
		this.prueba = prueba;
	}

}
