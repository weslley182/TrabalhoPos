package br.com.rp.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "tb_configuracao_horario")
public class ConfiguracaoHorario extends BaseEntity{

	@Column
	@Enumerated(EnumType.STRING)
	private TipoOperacao tipoOperacao;
	
	@Temporal(TemporalType.TIME)
	private Date horaInicio;
	
	@Temporal(TemporalType.TIME)
	private Date horaFim;
	
	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;
	
	@Column
	private boolean isPermitido;
	
	
	
	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(TipoOperacao tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public Date getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Date horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Date getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Date horaFim) {
		this.horaFim = horaFim;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public boolean isPermitido() {
		return isPermitido;
	}

	public void setPermitido(boolean isPermitido) {
		this.isPermitido = isPermitido;
	}

}
