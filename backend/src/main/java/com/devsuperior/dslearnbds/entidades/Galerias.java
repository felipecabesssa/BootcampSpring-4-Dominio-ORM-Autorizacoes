package com.devsuperior.dslearnbds.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entidades.enums.tipoGaleria;

@Entity
@Table(name = "tb_galerias")
public class Galerias  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private Integer posicao;
	private String imgUri;
	private tipoGaleria tipo;
	
	@ManyToOne
	@JoinColumn(name = "oferta_id")
	private Oferta oferta;
	
	public Galerias() {
	}

	public Galerias(Long id, String nome, String descricao, Integer posicao, String imgUri, tipoGaleria tipo, Oferta oferta) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.posicao = posicao;
		this.imgUri = imgUri;
		this.tipo = tipo;
		this.oferta = oferta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public String getImgUri() {
		return imgUri;
	}

	public void setImgUri(String imgUri) {
		this.imgUri = imgUri;
	}

	public tipoGaleria getTipo() {
		return tipo;
	}

	public void setTipo(tipoGaleria tipo) {
		this.tipo = tipo;
	}

	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
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
		Galerias other = (Galerias) obj;
		return Objects.equals(id, other.id);
	}

	
}
