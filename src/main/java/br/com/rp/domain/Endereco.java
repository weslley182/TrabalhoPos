package br.com.rp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "tb_endereco")
public class Endereco extends BaseEntity{
	
	@JoinColumn(name = "id_cliente")
	private Usuario idCliente;
	
	@Column
	@Enumerated(EnumType.STRING)
	private EnumRegiao regiao;
	
	@Column
	private String cep;
	
	@Column
	@Enumerated(EnumType.STRING)
	private EnumUf uf;

	public Usuario getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Usuario idCliente) {
		this.idCliente = idCliente;
	}

	public EnumRegiao getRegiao() {
		return regiao;
	}

	public void setRegiao(EnumRegiao regiao) {
		this.regiao = regiao;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public EnumUf getUf() {
		return uf;
	}

	public void setUf(EnumUf uf) {
		this.uf = uf;
	}
	
	
	
}
