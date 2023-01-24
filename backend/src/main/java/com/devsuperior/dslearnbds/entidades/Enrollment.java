package com.devsuperior.dslearnbds.entidades;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.devsuperior.dslearnbds.entidades.pk.EnrollmentPK;

@Entity
@Table(name = "tb_enrollment")
public class Enrollment {
	
	@EmbeddedId
	private EnrollmentPK id = new EnrollmentPK();	
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant enrollMoment;
	
	@Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
	private Instant refundMoment;
	private boolean  avaliable;
	private boolean onlyUpdate;

	public Enrollment() {
	}

	public Enrollment(Usuario usuario, Oferta oferta, Instant enrollMoment, Instant refundMoment, boolean avaliable,
			boolean onlyUpdate) {
		super();
		id.setUsuario(usuario);
		id.setOferta(oferta);
		this.enrollMoment = enrollMoment;
		this.refundMoment = refundMoment;
		this.avaliable = avaliable;
		this.onlyUpdate = onlyUpdate;
	}

	public Usuario getEstudante() {
		return id.getUsuario();
	}
	
	public void setEstudante(Usuario usuario) {
		id.setUsuario(usuario);
	}
	
	public Oferta getOferta() {
		return id.getOferta();
	}
	
	public void setOferta(Oferta oferta) {
		id.setOferta(oferta);
	}

	public Instant getEnrollMoment() {
		return enrollMoment;
	}

	public void setEnrollMoment(Instant enrollMoment) {
		this.enrollMoment = enrollMoment;
	}

	public Instant getRefundMoment() {
		return refundMoment;
	}

	public void setRefundMoment(Instant refundMoment) {
		this.refundMoment = refundMoment;
	}

	public boolean isAvaliable() {
		return avaliable;
	}

	public void setAvaliable(boolean avaliable) {
		this.avaliable = avaliable;
	}

	public boolean isOnlyUpdate() {
		return onlyUpdate;
	}

	public void setOnlyUpdate(boolean onlyUpdate) {
		this.onlyUpdate = onlyUpdate;
	}
	
	
}
