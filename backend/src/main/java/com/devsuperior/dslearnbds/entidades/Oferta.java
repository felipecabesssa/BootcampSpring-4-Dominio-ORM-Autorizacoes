package com.devsuperior.dslearnbds.entidades;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_oferta")
public class Oferta implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String edicao;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant momentoInicial;
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant momentoFinal;
	
	@ManyToOne
	@JoinColumn(name = "curso_id")
	private Curso curso;
	
	public Oferta() {
	}
	
	public Oferta(Long id, String edicao, Instant momentoInicial, Instant momentoFinal, Curso curso) {
		super();
		this.id = id;
		this.edicao = edicao;
		this.momentoInicial = momentoInicial;
		this.momentoFinal = momentoFinal;
		this.curso = curso;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getEdicao() {
		return edicao;
	}
	
	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}
	
	public Instant getMomentoInicial() {
		return momentoInicial;
	}
	
	public void setMomentoInicial(Instant momentoInicial) {
		this.momentoInicial = momentoInicial;
	}
	
	public Instant getMomentoFinal() {
		return momentoFinal;
	}

	public void setMomentoFinal(Instant momentoFinal) {
		this.momentoFinal = momentoFinal;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Oferta other = (Oferta) obj;
		return Objects.equals(id, other.id);
	}
}
