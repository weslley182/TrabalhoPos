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
	private Enum tipoConta;

	@Column(unique = true)
	private String numeroConta;

	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column
	private String senha;

	@Column
	private double valorSaldo;

	@Column
	private double valorCredito;

}
