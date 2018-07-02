package com.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Prueba {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_prueba ;
	private String descripcion_prueba ;
	private String tipo ;
	private String pasos_previos ;
	private String precondicion ;
	private String postcondicion ;
	private String resultado_esperado ;
	private String resultado_real ;
	private String incidencia ;
	
	@ManyToOne
	private Requisito requisito ;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER, mappedBy="prueba")
	private List<Anexo> anexos ;



	public List<Anexo> getAnexos() {
		return anexos;
	}

	public void setAnexos(List<Anexo> anexos) {
		this.anexos = anexos;
	}

	public int getId_prueba() {
		return id_prueba;
	}

	public void setId_prueba(int id_prueba) {
		this.id_prueba = id_prueba;
	}

	public String getDescripcion_prueba() {
		return descripcion_prueba;
	}

	public void setDescripcion_prueba(String descripcion_prueba) {
		this.descripcion_prueba = descripcion_prueba;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPasos_previos() {
		return pasos_previos;
	}

	public void setPasos_previos(String pasos_previos) {
		this.pasos_previos = pasos_previos;
	}

	public String getPrecondicion() {
		return precondicion;
	}

	public void setPrecondicion(String precondicion) {
		this.precondicion = precondicion;
	}

	public String getPostcondicion() {
		return postcondicion;
	}

	public void setPostcondicion(String postcondicion) {
		this.postcondicion = postcondicion;
	}

	public String getResultado_esperado() {
		return resultado_esperado;
	}

	public void setResultado_esperado(String resultado_esperado) {
		this.resultado_esperado = resultado_esperado;
	}

	public String getResultado_real() {
		return resultado_real;
	}

	public void setResultado_real(String resultado_real) {
		this.resultado_real = resultado_real;
	}

	public String getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}

	public Requisito getRequisito() {
		return requisito;
	}

	public void setRequisito(Requisito requisito) {
		this.requisito = requisito;
	}

}
