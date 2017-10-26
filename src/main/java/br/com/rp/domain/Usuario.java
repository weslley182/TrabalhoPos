package br.com.rp.domain;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario extends BaseEntity {

	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Enum tipoUsuario;
	
	@Column(name = "cpf", unique = true, nullable = false)
	@Size(min = 11, max = 11)
	private String cpf;

	@Column(name = "email", unique = true, nullable = false)
	private String email;

	@Column(name = "senha")
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {

		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
