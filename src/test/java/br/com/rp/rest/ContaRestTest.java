package br.com.rp.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.Test;

import br.com.rp.domain.Conta;
import br.com.rp.domain.TipoConta;
import br.com.rp.domain.Usuario;

public class ContaRestTest extends AbstractRestTest {
	
	private static final String URL = "http://localhost:8080/vbank/api/";
	
	@Test
	public void deveSalvarConta() {
		Usuario usuario1 = new Usuario();
		usuario1.setCpf("07616673937");
		usuario1.setEmail("wesley.faznada@hotmail.com");
		usuario1.setNome("Wesley Safadao");
		usuario1.setSenha("123456789");
		
		Conta conta = new Conta();
		conta.setNumeroConta("11502-2");
		conta.setSenha("111");
		conta.setValorCredito(1000.00);
		conta.setValorSaldo(10000.00);
		conta.setTipoConta(TipoConta.CORRENTE);
		conta.setUsuario(usuario1);
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "conta");
		Long result = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(conta, MediaType.APPLICATION_JSON),Long.class);
		
		Assert.assertTrue(result > 0);
	}
	
}
