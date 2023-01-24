package com.devsuperior.dslearnbds.entidades.pk;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.devsuperior.dslearnbds.entidades.Oferta;
import com.devsuperior.dslearnbds.entidades.Usuario;

@Embeddable
public class EnrollmentPK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "usuario_id")
	private Usuario usuario;

	@ManyToOne
	@JoinColumn(name = "oferta_id")
	private Oferta oferta;

	public EnrollmentPK() {
	}
	

	public EnrollmentPK(Usuario usuario, Oferta oferta) {
		super();
		this.usuario = usuario;
		this.oferta = oferta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Oferta getOferta() {
		return oferta;
	}

	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(oferta, usuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrollmentPK other = (EnrollmentPK) obj;
		return Objects.equals(oferta, other.oferta) && Objects.equals(usuario, other.usuario);
	}

	
}
