package br.com.rp.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.Test;

import br.com.rp.domain.Endereco;
import br.com.rp.domain.EnumRegiao;
import br.com.rp.domain.EnumUf;
import br.com.rp.domain.Usuario;

public class EnderecoRestTest extends AbstractRestTest {
	
	private static final String URL = "http://localhost:8080/vbank/api/";
	
	@Test
	public void deveSalvarEndereco() {
		Endereco endereco1 = new Endereco();
		endereco1.setIdCliente(null);
		endereco1.setCep("86975000");
		endereco1.setRegiao(EnumRegiao.Regiao_Sul);
		endereco1.setUf(EnumUf.PR);
		
		Endereco endereco = new Endereco();
		endereco.setIdCliente(null);
		endereco.setCep("87991000");
		endereco.setRegiao(EnumRegiao.Regiao_Sul);
		endereco.setUf(EnumUf.PR);
		
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "endereco");
		Long result = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(endereco, MediaType.APPLICATION_JSON),Long.class);
		
		Assert.assertTrue(result > 0);
	}
	
}
