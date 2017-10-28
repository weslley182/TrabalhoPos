package br.com.rp.view;

import java.io.Serializable;

public class ViewModelOperacaoSaque implements Serializable {

	private Long idConta;
	private Double valor;
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Long getIdConta() {
		return idConta;
	}
	public void setIdConta(Long idConta) {
		this.idConta = idConta;
	}
}
