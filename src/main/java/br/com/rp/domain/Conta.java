package br.com.rp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_conta")
public class Conta extends BaseEntity {

	@Column
	@Enumerated(EnumType.STRING)
	private TipoConta tipoConta;

	@Column(unique = true)
	private String numeroConta;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column
	private String senha;

	@Column
	private double valorSaldo;

	@Column
	private double valorCredito;

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(TipoConta tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public double getValorSaldo() {
		return valorSaldo;
	}

	public void setValorSaldo(double valorSaldo) {
		this.valorSaldo = valorSaldo;
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public boolean possuiSaldo(Double valorSaque) {
		return valorSaldo >= valorSaque;
	}

	public void sacar(Double valor) throws Exception {
		if (possuiSaldo(valor)) {
			valorSaldo -= valor;
		} else
			throw new Exception("Saldo insuficiente.");

	}

}
