package br.com.rp.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_proposta")
public class Proposta extends BaseEntity {

	@Column(name = "dtEnvio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtEnvio;

	@Column(name = "dtAprovacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtAprovacao;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@OneToMany(mappedBy = "proposta", targetEntity = Motivo.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Motivo> motivos;

	public Date getDtEnvio() {
		return dtEnvio;
	}

	public void setDtEnvio(Date dtEnvio) {
		this.dtEnvio = dtEnvio;
	}

	public Date getDtAprovacao() {
		return dtAprovacao;
	}

	public void setDtAprovacao(Date dtAprovacao) {
		this.dtAprovacao = dtAprovacao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Motivo> getMotivo() {
		return motivos;
	}

	public void setMotivo(List<Motivo> motivos) {
		this.motivos = motivos;
	}

}
