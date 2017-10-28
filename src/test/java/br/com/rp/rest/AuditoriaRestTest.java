package br.com.rp.rest;

import java.util.Date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.Test;

import br.com.rp.domain.ConfiguracaoHorario;
import br.com.rp.domain.Conta;
import br.com.rp.domain.Operacao;
import br.com.rp.domain.TipoConta;
import br.com.rp.domain.TipoOperacao;
import br.com.rp.domain.Usuario;

public class AuditoriaRestTest extends AbstractRestTest{


private static final String URL = "http://localhost:8080/vbank/api/";
	
	@Test
	public void deveSalvarAuditoria() {
		/*
		Operacao operacao = new Operacao();
		operacao.setContaOrigem(criarConta());
		operacao.setTipoOperacao(TipoOperacao.SAQUE);
		operacao.setValor(100.00);
	    
	    
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "auditoria");
		Long result = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(config, MediaType.APPLICATION_JSON),Long.class);
		
		Assert.assertTrue(result > 0);
		*/
	}
	
	private Usuario criarUsuario(){
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("07616673937");
		usuario1.setEmail("wesley.faznada@hotmail.com");
		usuario1.setNome("Wesley Safadao");
		usuario1.setSenha("123456789");
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "usuario");
		Long id = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(usuario1, MediaType.APPLICATION_JSON),Long.class);		
		usuario1.setId(id);
		System.out.println("ID do Usuario: " + usuario1.getId());
		return usuario1;		
	}
	
	private Conta criarConta(){
		Usuario usu = criarUsuario();
		Conta conta = new Conta();
		conta.setNumeroConta("11502-2");
		conta.setSenha("111");
		conta.setValorCredito(1000.00);
		conta.setValorSaldo(2000.00);
		conta.setTipoConta(TipoConta.CORRENTE);
		conta.setUsuario(usu);
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "conta");
		Long id = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(conta, MediaType.APPLICATION_JSON),Long.class);		
		conta.setId(id);
		System.out.println("ID do conta: " + conta.getId());
		return conta;		
	}
}
