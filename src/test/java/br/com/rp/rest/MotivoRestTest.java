package br.com.rp.rest;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.junit.Assert;
import org.junit.Test;

import br.com.rp.domain.Motivo;

public class MotivoRestTest extends AbstractRestTest {
	
	private static final String URL = "http://localhost:8080/vbank/api/";
	
	@Test
	public void deveSalvarMotivo() {				
		
		Motivo motivo = new Motivo();
		motivo.setDescricao("Cliente com restricao no SPC");
		motivo.setObservacao("Amigo do Montanha, então nao presta");
		
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(URL + "motivo");
		Long result = target.request(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON).post(Entity.entity(motivo, MediaType.APPLICATION_JSON),Long.class);
		
		Assert.assertTrue(result > 0);
	}	
		
}
